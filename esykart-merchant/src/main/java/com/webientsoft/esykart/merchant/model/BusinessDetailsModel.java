package com.webientsoft.esykart.merchant.model;

public class BusinessDetailsModel {
	private Integer id;
	private String businessName;
	private String businessType;
	private String pan;
	private String tin;
	private String tan;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public String getTan() {
		return tan;
	}

	public void setTan(String tan) {
		this.tan = tan;
	}

}
