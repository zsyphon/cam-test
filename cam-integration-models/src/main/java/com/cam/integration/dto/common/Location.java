package com.cam.integration.dto.common;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Location  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6737421377790914538L;
	@JsonProperty("locationId")
	private String locationId;
	@JsonProperty("camIntegartionId")
	private int camIntegartionId;
	@JsonProperty("idType")
	private String idType;
	@JsonProperty("primaryLocationFlag")
	private Boolean primaryLocationFlag;
	@JsonProperty("effectiveStartDate")
	String effectiveStartDate;
	@JsonProperty("addressLine1")
	private String addressLine1;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("addressLine2")
	private String addressLine2;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("addressLine3")
	private String addressLine3;
	@JsonProperty("city")
	private String city;
	@JsonProperty("stateCode")
	private String stateCode;
	@JsonProperty("stateName")
	private String stateName;
	@JsonProperty("postalCode")
	private String postalCode;
	@JsonProperty("postalCodeExtn")
	private String postalCodeExtn;
	@JsonProperty("county")
	private String county;
	@JsonProperty("countryCode")
	private String countryCode;
	@JsonProperty("countryName")
	private String countryName;
	@JsonProperty("latitude")
	private double latitude;
	@JsonProperty("longitude")
	private double longitude;
	@JsonProperty("doNotMailFlag")
	private Boolean doNotMailFlag;

	public Location() {
	}

	@JsonCreator
	public Location(@JsonProperty("locationId") String locationId, @JsonProperty("camIntegartionId") int camIntegrationId, @JsonProperty("idType") String idType,
			@JsonProperty("primaryLocationFlag") Boolean primaryLocationFlag,
			@JsonProperty("effectiveStartDate") String effectiveStartDate,
			@JsonProperty("addressLine1") String addressLine1, @JsonProperty("addressLine2") String addressLine2,
			@JsonProperty("addressLine3") String addressLine3, @JsonProperty("city") String city,
			@JsonProperty("stateCode") String stateCode, @JsonProperty("stateName") String stateName,
			@JsonProperty("postalCode") String postalCode, @JsonProperty("postalCodeExtn") String postalCodeExtn,
			@JsonProperty("country") String county, @JsonProperty("countryCode") String countryCode,
			@JsonProperty("countryName") String countryName, @JsonProperty("latitude") String latitude,
			@JsonProperty("longitude") String longitude, @JsonProperty("doNotMailFlag") Boolean doNotMailFlag) {
		super();
		this.locationId =locationId;
		this.camIntegartionId = camIntegrationId;
		this.idType = idType;
		this.primaryLocationFlag = primaryLocationFlag;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.city = city;
		this.stateCode = stateCode;
		this.stateName = stateName;
		this.postalCode = postalCode;
		this.postalCodeExtn = postalCodeExtn;
		this.county = county;
		this.countryCode = countryCode;
		this.countryName = countryName;

		this.doNotMailFlag = doNotMailFlag;
		this.setEffectiveDate(effectiveStartDate);
		this.setLatitude(latitude);
		this.setLongitude(longitude);
	}

	void setEffectiveDate(String date) {

		this.effectiveStartDate = date;
	}

	void setLatitude(String lat) {
		this.latitude = lat.length() > 0 ? Double.parseDouble(lat) : 0d;
	}

	void setLongitude(String lng) {
		this.longitude = lng.length() > 0 ? Double.parseDouble(lng) : 0d;
	}

	public String getLocationId() {
		return locationId;
	}

	public void getLocationId(String id) {
		this.locationId = id;
	}

	public int getcamIntegartionId() {
		return camIntegartionId;
	}

	public void setcamIntegartionId(int camIntegartionId) {
		this.camIntegartionId = camIntegartionId;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public Boolean getPrimaryLocationFlag() {
		return primaryLocationFlag;
	}

	public void setPrimaryLocationFlag(Boolean primaryLocationFlag) {
		this.primaryLocationFlag = primaryLocationFlag;
	}

	public String getEffectiveStartDate() {
		return effectiveStartDate;
	}

	public void setEffectiveStartDate(String effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPostalCodeExtn() {
		return postalCodeExtn;
	}

	public void setPostalCodeExtn(String postalCodeExtn) {
		this.postalCodeExtn = postalCodeExtn;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public Boolean getDoNotMailFlag() {
		return doNotMailFlag;
	}

	public void setDoNotMailFlag(Boolean doNotMailFlag) {
		this.doNotMailFlag = doNotMailFlag;
	}

}