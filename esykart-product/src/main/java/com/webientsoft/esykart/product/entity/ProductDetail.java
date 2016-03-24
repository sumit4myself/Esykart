package com.webientsoft.esykart.product.entity;

import java.io.Serializable;
import java.sql.Date;
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
import javax.persistence.Table;

import com.webientsoft.esykart.common.model.Status;

/**
 * The persistent class for the product_details database table.
 * 
 */
@Entity
@Table(name = "product_detail")
public class ProductDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String description;

	@Column(name = "retail_price")
	private Float retailPrice;

	@Column(name = "sale_price")
	private Float salePrice;

	@Column(name = "long_description")
	private String longDescription;

	@Column(name = "use_product_media")
	private boolean useProductMedia;

	@Column(name = "is_discountable")
	private boolean isDiscountable;

	@Column(name = "is_featured_product")
	private boolean isFeaturedProduct;

	@Column(name = "is_actionable")
	private boolean isActionable;

	@Column(name = "dimension_unit_of_measure")
	private String dimensionUnitOfMeasure;

	private Float height;
	private Float length;
	private Float width;

	@Column(name = "weight_unit_of_measure")
	private String weightUnitOfMeasure;

	private Float weight;

	@Column(length = 1)
	@Enumerated(EnumType.STRING)
	private Status status;

	@Column(name = "active_end_date")
	private Date activeEndDate;

	@Column(name = "active_start_date")
	private Date activeStartDate;

	@JoinColumn(name = "product_id")
	@ManyToOne
	private Product product;

	@JoinColumn(name = "product_detail_id")
	@OneToMany()
	private List<ProductDetailAttributeValueMap> productDetailAttrValueMaps;

	@JoinColumn(name = "product_detail_id")
	@OneToMany()
	private List<ProductDetailMediaMap> productDetailMediaMaps;

	@OneToMany(mappedBy = "productDetail")
	private List<Sku> skus;

	public ProductDetail() {
	}

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

	public boolean isUseProductMedia() {
		return useProductMedia;
	}

	public void setUseProductMedia(boolean useProductMedia) {
		this.useProductMedia = useProductMedia;
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

	public boolean isDiscountable() {
		return isDiscountable;
	}

	public void setDiscountable(boolean isDiscountable) {
		this.isDiscountable = isDiscountable;
	}

	public boolean isFeaturedProduct() {
		return isFeaturedProduct;
	}

	public void setFeaturedProduct(boolean isFeaturedProduct) {
		this.isFeaturedProduct = isFeaturedProduct;
	}

	public Float getLength() {
		return length;
	}

	public void setLength(Float length) {
		this.length = length;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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

	public Float getWidth() {
		return width;
	}

	public void setWidth(Float width) {
		this.width = width;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<ProductDetailAttributeValueMap> getProductDetailAttrValueMaps() {
		return productDetailAttrValueMaps;
	}

	public void setProductDetailAttrValueMaps(List<ProductDetailAttributeValueMap> productDetailAttrValueMaps) {
		this.productDetailAttrValueMaps = productDetailAttrValueMaps;
	}

	public List<ProductDetailMediaMap> getProductDetailMediaMaps() {
		return productDetailMediaMaps;
	}

	public void setProductDetailMediaMaps(List<ProductDetailMediaMap> productDetailMediaMaps) {
		this.productDetailMediaMaps = productDetailMediaMaps;
	}

	public List<Sku> getSkus() {
		return skus;
	}

	public void setSkus(List<Sku> skus) {
		this.skus = skus;
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

	public boolean isActionable() {
		return isActionable;
	}

	public void setActionable(boolean isActionable) {
		this.isActionable = isActionable;
	}

}