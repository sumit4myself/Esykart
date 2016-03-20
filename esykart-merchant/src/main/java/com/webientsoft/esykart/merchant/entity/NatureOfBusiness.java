package com.webientsoft.esykart.merchant.entity;

public enum NatureOfBusiness {

	Manufacturer("Manufacturer"), Distributor("Distributor/WholeSeller"), Retailer("Retailer"),Importer("Importer");

	private String value;

	private NatureOfBusiness(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}
}
