package com.cam.integration.dao.entities;

import static java.lang.String.format;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContactAttributes implements Serializable{


	private static final long serialVersionUID = -2577843154505193633L;
	@Id
	private String contactId;
	private String key;
	private String value;
	
	public ContactAttributes() {}
	
	public ContactAttributes(String contactId, String key, String value) {
		super();
		this.contactId = contactId;
		this.key = key;
		this.value = value;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String toString() {
		return format("ContactAttributes{ contactId=%s, key=%s, value=%s }", contactId, key, value);
	}

}
