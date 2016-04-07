package com.webientsoft.esykart.common.model.store;

public class LayoutSectionModel {

	private Integer id;
	private String name;
	private String size;
	private Integer index;
	private String allProductSelectionRule;
	private String productSelectionRule;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getProductSelectionRule() {
		return productSelectionRule;
	}

	public void setProductSelectionRule(String productSelectionRule) {
		this.productSelectionRule = productSelectionRule;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getAllProductSelectionRule() {
		return allProductSelectionRule;
	}

	public void setAllProductSelectionRule(String allProductSelectionRule) {
		this.allProductSelectionRule = allProductSelectionRule;
	}

}
