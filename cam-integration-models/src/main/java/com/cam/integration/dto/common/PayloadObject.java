package com.cam.integration.dto.common;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PayloadObject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 462433444017041089L;
	@JsonProperty("account")
	private Account account;
	@JsonProperty("contacts")
	private List<Contact> contacts;
	@JsonProperty("locations")
	private List<Location> locations;
	
	PayloadObject(){}
	
	@JsonCreator
	public PayloadObject(@JsonProperty("account") Account account, @JsonProperty("contacts") List<Contact> contacts,
			@JsonProperty("locations") List<Location> locations) {
		super();
		this.account = account;
		this.contacts = contacts;
		this.locations = locations;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

}
