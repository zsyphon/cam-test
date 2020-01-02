package com.cam.orchestration.routes.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SalesforceMessageProcessor implements Processor {
	 private static final Logger logger = LoggerFactory.getLogger(SalesforceMessageProcessor.class);
	 
    public void process(Exchange exchange) throws Exception {
    	logger.debug("Salesforce processor processing");
        Message in = exchange.getIn();
        String apiLimits = in.getHeader("Sforce-Limit-Info", String.class);
        System.out.println(apiLimits);
   }
}