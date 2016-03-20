package com.webientsoft.esykart.merchant.model;

public class MerchantModel {
	
	private Integer merchantId;
	private String displayName;
	private String fullName;
	private String email;
	private String mobile;
	private String password;

	public Integer getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/*
	 * public Integer getRegistraionId() { return registraionId; } public void
	 * setRegistraionId(Integer registraionId) { this.registraionId =
	 * registraionId; } public Integer getAddressId() { return addressId; }
	 * public void setAddressId(Integer addressId) { this.addressId = addressId;
	 * } public Integer getAlternateAddressId() { return alternateAddressId; }
	 * public void setAlternateAddressId(Integer alternateAddressId) {
	 * this.alternateAddressId = alternateAddressId; }
	 */
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
