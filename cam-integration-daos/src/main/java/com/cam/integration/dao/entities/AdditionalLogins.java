package com.cam.integration.dao.entities;

import static java.lang.String.format;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdditionalLogins implements Serializable {

	private static final long serialVersionUID = -5204820777727834398L;

	@Id
	private String contactId;
	private String userName;
	private String sourceSystemId;

	public AdditionalLogins() {
	}

	public AdditionalLogins(String contactId, String userName, String sourceSystemId) {
		super();
		this.contactId = contactId;
		this.userName = userName;
		this.sourceSystemId = sourceSystemId;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSourceSystemId() {
		return sourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String toString() {
		return format("AdditionalLogins{ contactId=%s, userName%s, sourceSystemId=%s}", contactId, userName, sourceSystemId);
	}
}
