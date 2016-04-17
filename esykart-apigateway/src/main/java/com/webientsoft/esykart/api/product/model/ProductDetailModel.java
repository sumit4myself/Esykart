package com.webientsoft.esykart.api.product.model;

import java.util.List;

public class ProductDetailModel {

	private Integer id;

	private String description;
	private String longDescription;
	private String status;

	private String isDiscountable;
	private String isFeaturedProduct;

	private String dimensionUnitOfMeasure;
	private Float height;
	private Float length;
	private Float width;

	private Float weight;
	private String weightUnitOfMeasure;
	private ProductModel product;

	private List<ProductDetailAttrValueMapModel> productDetailsAttrValueMaps;
	private List<ProductDetailMediaMapModel> productDetailsMediaMaps;

	private List<SkuModel> skus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIsDiscountable() {
		return isDiscountable;
	}

	public void setIsDiscountable(String isDiscountable) {
		this.isDiscountable = isDiscountable;
	}

	public String getIsFeaturedProduct() {
		return isFeaturedProduct;
	}

	public void setIsFeaturedProduct(String isFeaturedProduct) {
		this.isFeaturedProduct = isFeaturedProduct;
	}

	public String getDimensionUnitOfMeasure() {
		return dimensionUnitOfMeasure;
	}

	public void setDimensionUnitOfMeasure(String dimensionUnitOfMeasure) {
		this.dimensionUnitOfMeasure = dimensionUnitOfMeasure;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Float getLength() {
		return length;
	}

	public void setLength(Float length) {
		this.length = length;
	}

	public Float getWidth() {
		return width;
	}

	public void setWidth(Float width) {
		this.width = width;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public String getWeightUnitOfMeasure() {
		return weightUnitOfMeasure;
	}

	public void setWeightUnitOfMeasure(String weightUnitOfMeasure) {
		this.weightUnitOfMeasure = weightUnitOfMeasure;
	}

	public ProductModel getProduct() {
		return product;
	}

	public void setProduct(ProductModel product) {
		this.product = product;
	}

	public List<ProductDetailAttrValueMapModel> getProductDetailsAttrValueMaps() {
		return productDetailsAttrValueMaps;
	}

	public void setProductDetailsAttrValueMaps(List<ProductDetailAttrValueMapModel> productDetailsAttrValueMaps) {
		this.productDetailsAttrValueMaps = productDetailsAttrValueMaps;
	}

	public List<ProductDetailMediaMapModel> getProductDetailsMediaMaps() {
		return productDetailsMediaMaps;
	}

	public void setProductDetailsMediaMaps(List<ProductDetailMediaMapModel> productDetailsMediaMaps) {
		this.productDetailsMediaMaps = productDetailsMediaMaps;
	}

	public List<SkuModel> getSkus() {
		return skus;
	}

	public void setSkus(List<SkuModel> skus) {
		this.skus = skus;
	}

}
