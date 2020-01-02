package com.cam.integration.dao.entities;

import static java.lang.String.format;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Permission implements Serializable {

	private static final long serialVersionUID = -356487193941475799L;

	@Id
	private String permissionId;
	private String accountId;
	private String contactId;
	private String channelId;
	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> permissionList;

	public Permission() {
	}

	public Permission(String permissionId, String accountId, String contactId, String channelId,
			List<String> permissionList) {
		super();
		this.permissionId = permissionId;
		this.accountId = accountId;
		this.contactId = contactId;
		this.channelId = channelId;
		this.permissionList = permissionList;
	}

	public String getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public List<String> getPermissionList() {
		return permissionList;
	}

	public void setPermissionList(List<String> permissionList) {
		this.permissionList = permissionList;
	}

	public String toString() {
		final String permissionsString = permissionList.stream().map(Object::toString).collect(Collectors.joining(","));
		return format("ContactPreference{ accountId=%s, contactId=%s, channelId=%s }", accountId, contactId, channelId,
				permissionsString);
	}

}
