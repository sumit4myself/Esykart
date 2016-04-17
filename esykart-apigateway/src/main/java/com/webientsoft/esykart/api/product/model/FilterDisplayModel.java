package com.webientsoft.esykart.api.product.model;

import java.util.List;

public class FilterDisplayModel {

	private Integer categoryId;
	private Float priceMin;
	private Float priceMax;

	private CategoryAttributeModel categoryTab;
	private List<CategoryAttributeModel> categoryAttributes;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Float getPriceMin() {
		return priceMin;
	}

	public void setPriceMin(Float priceMin) {
		this.priceMin = priceMin;
	}

	public Float getPriceMax() {
		return priceMax;
	}

	public void setPriceMax(Float priceMax) {
		this.priceMax = priceMax;
	}

	public CategoryAttributeModel getCategoryTab() {
		return categoryTab;
	}

	public void setCategoryTab(CategoryAttributeModel categoryTab) {
		this.categoryTab = categoryTab;
	}

	public List<CategoryAttributeModel> getCategoryAttributes() {
		return categoryAttributes;
	}

	public void setCategoryAttributes(List<CategoryAttributeModel> categoryAttributes) {
		this.categoryAttributes = categoryAttributes;
	}

}
