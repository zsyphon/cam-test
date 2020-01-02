package com.cam.integration.dto.salesforce;

import java.io.Serializable;

import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

import com.cam.integration.dto.common.Contact;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SFContact extends AbstractSObjectBase implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2035385936651510553L;
	@JsonProperty("camOrgId")
	int camOrgId;
	private String contactId;
	@JsonProperty("camPersonId")
	private String camPersonId;
	@JsonProperty("firstName")
	private String firstName;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("middleName")
	private String middleName;
	@JsonProperty("lastName")
	private String lastName;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("email")
	private String email;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("phone")
	private String phone;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("mobile")
	private String mobile;
	public SFContact() {}
	public SFContact(Contact contact) {
		contactId = contact.getContactId();
		camOrgId = contact.getcamOrgId();
		camPersonId = contact.getcamPersonId();
		firstName = contact.getFirstName();
		middleName = contact.getMiddleName();
		lastName = contact.getLastName();
		email = contact.getEmail();
		phone = contact.getPhone();
		mobile = contact.getMobile();
	}

	@JsonCreator
	public SFContact(@JsonProperty("contactId") String contactId, @JsonProperty("camOrgId") int camOrgId,
			@JsonProperty("camPersonId") String camPersonId, @JsonProperty("firstName") String firstName,
			@JsonProperty("middleName") String middleName, @JsonProperty("lastName") String lastName,
			@JsonProperty("email") String email, @JsonProperty("phone") String phone,
			@JsonProperty("mobile") String mobile) {
		super();
		this.contactId = contactId;
		this.camOrgId = camOrgId;
		this.camPersonId = camPersonId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.mobile = mobile;
	}

	public int getcamOrgId() {
		return camOrgId;
	}

	public void setcamOrgId(int camOrgId) {
		this.camOrgId = camOrgId;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getcamPersonId() {
		return camPersonId;
	}

	public void setcamPersonId(String camPersonId) {
		this.camPersonId = camPersonId;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
