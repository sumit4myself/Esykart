package com.webientsoft.esykart.product.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.webientsoft.esykart.common.model.Status;

/**
 * The persistent class for the sku database table.
 * 
 */
@Entity
public class Sku implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String uuid;

	@Column(name = "active_end_date")
	private Timestamp activeEndDate;

	@Column(name = "active_start_date")
	private Timestamp activeStartDate;

	@Column(name = "available_flag")
	private String availableFlag;

	@Column(length = 1)
	@Enumerated(EnumType.STRING)
	private Status status;

	@Column(name = "is_discountable")
	private String isDiscountable;

	@Column(name = "merchant_id")
	private Integer merchantId;

	@Column(name = "quantity_available")
	private Integer quantityAvailable;

	@Column(name = "retail_price")
	private Float retailPrice;

	@Column(name = "sale_price")
	private Float salePrice;

	@ManyToOne
	@JoinColumn(name = "product_details_id")
	private ProductDetail productDetail;

	@OneToMany(mappedBy = "sku")
	private List<SkuAvailability> skuAvailabilities;

	public Sku() {
	}

	public Sku(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getActiveEndDate() {
		return activeEndDate;
	}

	public void setActiveEndDate(Timestamp activeEndDate) {
		this.activeEndDate = activeEndDate;
	}

	public Timestamp getActiveStartDate() {
		return activeStartDate;
	}

	public void setActiveStartDate(Timestamp activeStartDate) {
		this.activeStartDate = activeStartDate;
	}

	public String getAvailableFlag() {
		return availableFlag;
	}

	public void setAvailableFlag(String availableFlag) {
		this.availableFlag = availableFlag;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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

	public ProductDetail getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}

	public List<SkuAvailability> getSkuAvailabilities() {
		return skuAvailabilities;
	}

	public void setSkuAvailabilities(List<SkuAvailability> skuAvailabilities) {
		this.skuAvailabilities = skuAvailabilities;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}