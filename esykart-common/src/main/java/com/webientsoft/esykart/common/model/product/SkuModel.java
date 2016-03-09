package com.webientsoft.esykart.common.model.product;

import java.util.Date;
import java.util.List;

public class SkuModel {

	private Integer id;
	private Date activeEndDate;
	private Date activeStartDate;
	private String availableFlag;
	private String isDiscountable;
	private Integer merchantId;
	private Integer quantityAvailable;
	private Float retailPrice;
	private Float salePrice;
	private ProductDetailModel productDetail;
	private List<SkuAvailabilityModel> skuAvailabilities;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getActiveEndDate() {
		return activeEndDate;
	}

	public void setActiveEndDate(Date activeEndDate) {
		this.activeEndDate = activeEndDate;
	}

	public Date getActiveStartDate() {
		return activeStartDate;
	}

	public void setActiveStartDate(Date activeStartDate) {
		this.activeStartDate = activeStartDate;
	}

	public String getAvailableFlag() {
		return availableFlag;
	}

	public void setAvailableFlag(String availableFlag) {
		this.availableFlag = availableFlag;
	}

	public String getIsDiscountable() {
		return isDiscountable;
	}

	public void setIsDiscountable(String isDiscountable) {
		this.isDiscountable = isDiscountable;
	}

	public Integer getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	public Integer getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(Integer quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	public Float getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Float retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Float getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Float salePrice) {
		this.salePrice = salePrice;
	}

	public ProductDetailModel getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDetailModel productDetail) {
		this.productDetail = productDetail;
	}

	public List<SkuAvailabilityModel> getSkuAvailabilities() {
		return skuAvailabilities;
	}

	public void setSkuAvailabilities(List<SkuAvailabilityModel> skuAvailabilities) {
		this.skuAvailabilities = skuAvailabilities;
	}

}
