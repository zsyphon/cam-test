package com.cam.integration.dto.common;

import java.io.Serializable;

import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 581900902472487687L;
	@JsonProperty("accountId")
	private String accountId;
	@JsonProperty("camOrgId")
	private int camOrgId;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("dBAName")
	private String dBAName;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("legalName")
	private String legalName;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("companyType")
	private String companyType;

	public Account() {
	}

	@JsonCreator
	public Account(@JsonProperty("accountId") String accountId, @JsonProperty("camOrgId") int camOrgId,
			@JsonProperty("dBAName") String dBAName, @JsonProperty("legalName") String legalName,
			@JsonProperty("companyType") String companyType) {
		super();
		this.accountId = accountId;
		this.camOrgId = camOrgId;
		this.dBAName = dBAName;
		this.legalName = legalName;
		this.companyType = companyType;
	}

	public int getcamOrgId() {
		return camOrgId;
	}

	public void setcamOrgId(int camOrgId) {
		this.camOrgId = camOrgId;
	}

	public String getdBAName() {
		return dBAName;
	}

	public void setdBAName(String dBAName) {
		this.dBAName = dBAName;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

}

