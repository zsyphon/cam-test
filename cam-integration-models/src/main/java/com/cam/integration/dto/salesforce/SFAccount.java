package com.cam.integration.dto.salesforce;

import java.io.Serializable;

import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

import com.cam.integration.dto.common.Account;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SFAccount extends AbstractSObjectBase implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5960476622106184822L;
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

	public SFAccount(Account account) {
		this.accountId = account.getAccountId();
		this.dBAName = account.getdBAName();
		this.legalName = account.getLegalName();
		this.companyType = account.getLegalName();
	}

	@JsonCreator
	public SFAccount(@JsonProperty("accountId") String accountId, @JsonProperty("camOrgId") int camOrgId,
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
