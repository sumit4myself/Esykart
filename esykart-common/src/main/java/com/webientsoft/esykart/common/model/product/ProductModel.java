package com.webientsoft.esykart.common.model.product;

public class ProductModel {

	private Integer id;
	private boolean isTaxable;
	private String taxCode;
	private String manufacture;
	private String model;
	private String name;
	private CategoryModel category;
	private ProductDetailModel detail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isTaxable() {
		return isTaxable;
	}

	public void setTaxable(boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CategoryModel getCategory() {
		return category;
	}

	public void setCategory(CategoryModel category) {
		this.category = category;
	}

	public ProductDetailModel getDetail() {
		return detail;
	}

	public void setDetail(ProductDetailModel detail) {
		this.detail = detail;
	}

}
