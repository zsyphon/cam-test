package com.cam.integration.dao.entities;

import static java.lang.String.format;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountPreference implements Serializable {

	private static final long serialVersionUID = 1536227982176892538L;
	
	@Id
	private String accountId;
	private String key;
	private String value;
	
	public AccountPreference() {}

	public AccountPreference(String accountId, String key, String value) {
		super();
		this.accountId = accountId;
		this.key = key;
		this.value = value;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
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
		return format("AccountPreference{ accountId=%s }", accountId);
	}
	
	
}
