package com.cam.integration.dto.salesforce;

import java.io.Serializable;
import java.util.List;

import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SalesforcePayload extends AbstractSObjectBase implements Serializable {

	private static final long serialVersionUID = -2035385936651510553L;
	@JsonProperty("account")
	private SFAccount account;
	@JsonProperty("contacts")
	private List<SFContact> contacts;
	@JsonProperty("locations")
	private List<SFLocation> locations;
	
	

	@JsonCreator
	public SalesforcePayload(@JsonProperty("account") SFAccount account, @JsonProperty("contacts") List<SFContact> contacts,
			@JsonProperty("locations") List<SFLocation> locations) {
		super();
		this.account = account;
		this.contacts = contacts;
		this.locations = locations;
	}

//	public SalesforcePayload(SFAccount sfAccount, List<SFContact> contacts, List<SFLocation> locations) {
//		this.account = sfAccount;
//		this.contacts = contacts;
//		this.locations = locations
//	}

	public SFAccount getAccount() {
		return account;
	}

	public void setAccount(SFAccount account) {
		this.account = account;
	}

	public List<SFContact> getContacts() {
		return contacts;
	}

	public void setContacts(List<SFContact> contacts) {
		this.contacts = contacts;
	}

	public List<SFLocation> getLocations() {
		return locations;
	}

	public void setLocations(List<SFLocation> locations) {
		this.locations = locations;
	}

}
