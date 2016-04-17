package com.webientsoft.esykart.api.product.model;

public class CategoryAttributeValueModel {

	private Integer id;

	private String label;

	private String value;

	private Integer availableProducts;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getAvailableProducts() {
		return availableProducts;
	}

	public void setAvailableProducts(Integer availableProducts) {
		this.availableProducts = availableProducts;
	}

}
