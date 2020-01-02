package com.cam.integration.dao.entities;

import static java.lang.String.format;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContactPreference implements Serializable{

	private static final long serialVersionUID = -1070702565501931187L;

	@Id
	private String contactId;
	
	public ContactPreference(){}

	public ContactPreference( String contactId) {
		super();
		this.contactId = contactId;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}
	
	public String toString() {
		return format("ContactPreference{ contactId=%s }", contactId);
	}
	
}
