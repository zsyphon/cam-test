package com.cam.orchestration.routes;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.cam.integration.dto.common.PayloadObject;
import com.cam.integration.dto.salesforce.SFAccount;
import com.cam.integration.dto.salesforce.SFContact;
import com.cam.integration.dto.salesforce.SFLocation;
import com.cam.integration.dto.salesforce.SalesforcePayload;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class LocalQueueRoute extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {
		final ObjectMapper objectMapper = new ObjectMapper();
		  from("activemq:queue:salesforce_data").process(new Processor() {
              public void process(final Exchange exchange) throws Exception {
            	 final  Message in = exchange.getIn();
            	 final String json = in.getBody().toString();
                  System.out.println("LOCAL BODY *** "+json);
                  PayloadObject data =  objectMapper.readValue(json, PayloadObject.class);
                  System.out.println("PAYLOAD *** "+data);
                   final PayloadObject cleansedData = data;//dataValidator.validate(data);
                  final SFAccount account = new SFAccount(cleansedData.getAccount());
                  final List<SFContact> contacts = (cleansedData.getContacts()).stream().map(c-> {
                	  return new SFContact(c);
                  }).collect(Collectors.toList());
                  
                  final List<SFLocation> locations = (cleansedData.getLocations()).stream().map(l-> {
                	  return new SFLocation(l);
                  }).collect(Collectors.toList());
                  final SalesforcePayload sfPayload =new SalesforcePayload(account,contacts, locations);
                  
                  exchange.getIn().setBody(sfPayload);
              }
          }).to("salesforce:createSObject?sObjectName=Integration_Message__e").process(exchange-> {
				 final Message in = exchange.getIn();
				 System.out.println("SF RESPOSNE");
				 System.out.println(in.getBody());
				 System.out.println();
			 });
		 
	}

}
