package com.cam.integration.dao.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SalesforceOrgCorrelation implements Serializable {

	private static final long serialVersionUID = 965986473552094512L;
	@Id
	private String contactId;
	private String salesforceContactId;
	private String salesforceOrgId;

	public SalesforceOrgCorrelation() {
	}

	public SalesforceOrgCorrelation(String contactId, String salesforceContactId, String salesforceOrgId) {
		this.contactId = contactId;
		this.salesforceContactId = salesforceContactId;
		this.salesforceOrgId = salesforceOrgId;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getSalesforceContactId() {
		return salesforceContactId;
	}

	public void setSalesforceContactId(String salesforceContactId) {
		this.salesforceContactId = salesforceContactId;
	}

	public String getSalesforceOrgId() {
		return salesforceOrgId;
	}

	public void setSalesforceOrgId(String salesforceOrgId) {
		this.salesforceOrgId = salesforceOrgId;
	}

	public String toString() {
		return "SalesforceOrgCorrelation{" + "contactId=" + contactId + ", salesforceContactId='" + salesforceContactId
				+ '\'' + ", salesforceOrgId='" + salesforceOrgId + '\'' + '}';
	}
}
