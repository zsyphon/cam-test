package com.cam.orchestration.web;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cam.integration.dao.entities.SalesforceOrgCorrelation;
import com.cam.integration.dao.repositories.SalesforceOrgRepository;


@RestController
public class WebController {

	private static final Logger logger = LoggerFactory.getLogger(WebController.class);

	@Autowired
	private SalesforceOrgRepository salesforceOrgRepository;
	
	@GetMapping(value="/")
	public String helloWorld() {
		return "Hello";
	}

	@GetMapping(value = "/sf_correlation/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Iterable<SalesforceOrgCorrelation> getSalesforceOrgCorrelationById(@PathVariable("id") Integer id) {		
		final List<SalesforceOrgCorrelation> target = new ArrayList<>();
		if (id != null) {
			logger.debug("salesforce correlation requested {}", id);
			final SalesforceOrgCorrelation sfOrg = new SalesforceOrgCorrelation("123", "sf123", "sfo123");
			salesforceOrgRepository.save(sfOrg);
			
			final Iterable<SalesforceOrgCorrelation> orgs = salesforceOrgRepository.findAll();
			orgs.forEach(target::add);
			System.out.println(target);
			return target;
		}
		return target;
	}

}