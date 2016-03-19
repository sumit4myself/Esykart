package com.webientsoft.esykart.store.merchant.web.model;

public class MerchantModel {
	
	private Integer merchantId;
	private String displayName;
	private Integer registraionId;
	private Integer addressId;
	private Integer alternateAddressId;
	
	
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
	public Integer getRegistraionId() {
		return registraionId;
	}
	public void setRegistraionId(Integer registraionId) {
		this.registraionId = registraionId;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public Integer getAlternateAddressId() {
		return alternateAddressId;
	}
	public void setAlternateAddressId(Integer alternateAddressId) {
		this.alternateAddressId = alternateAddressId;
	}

}
