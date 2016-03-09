package com.webientsoft.esykart.product.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the product_details database table.
 * 
 */
@Entity
@Table(name = "product_details")
@NamedQuery(name = "ProductDetail.findAll", query = "SELECT p FROM ProductDetail p")
public class ProductDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;

    @Column(name = "dimension_unit_of_measure")
    private String dimensionUnitOfMeasure;

    private Float height;

    @Column(name = "is_discountable")
    private String isDiscountable;

    @Column(name = "is_featured_product")
    private String isFeaturedProduct;

    private Float length;

    @Column(name = "long_description")
    private String longDescription;

    private String status;

    private Float weight;

    @Column(name = "weight_unit_of_measure")
    private String weightUnitOfMeasure;

    private Float width;

    @JoinColumn(name = "product_id")
    @OneToOne
    private Product product;

    @OneToMany(mappedBy = "productDetail" ,fetch = FetchType.LAZY)
    private List<ProductDetailsAttrValueMap> productDetailsAttrValueMaps;

    @OneToMany(mappedBy = "productDetail")
    private List<ProductDetailsMediaMap> productDetailsMediaMaps;

    @OneToMany(mappedBy = "productDetail")
    private List<Sku> skus;

    public ProductDetail() {
    }

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getDescription() {
	return this.description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getDimensionUnitOfMeasure() {
	return this.dimensionUnitOfMeasure;
    }

    public void setDimensionUnitOfMeasure(String dimensionUnitOfMeasure) {
	this.dimensionUnitOfMeasure = dimensionUnitOfMeasure;
    }

    public Float getHeight() {
	return this.height;
    }

    public void setHeight(Float height) {
	this.height = height;
    }

    public String getIsDiscountable() {
	return this.isDiscountable;
    }

    public void setIsDiscountable(String isDiscountable) {
	this.isDiscountable = isDiscountable;
    }

    public String getIsFeaturedProduct() {
	return this.isFeaturedProduct;
    }

    public void setIsFeaturedProduct(String isFeaturedProduct) {
	this.isFeaturedProduct = isFeaturedProduct;
    }

    public Float getLength() {
	return this.length;
    }

    public void setLength(Float length) {
	this.length = length;
    }

    public String getLongDescription() {
	return this.longDescription;
    }

    public void setLongDescription(String longDescription) {
	this.longDescription = longDescription;
    }

    public String getStatus() {
	return this.status;
    }

    public void setStatus(String status) {
	this.status = status;
    }

    public Float getWeight() {
	return this.weight;
    }

    public void setWeight(Float weight) {
	this.weight = weight;
    }

    public String getWeightUnitOfMeasure() {
	return this.weightUnitOfMeasure;
    }

    public void setWeightUnitOfMeasure(String weightUnitOfMeasure) {
	this.weightUnitOfMeasure = weightUnitOfMeasure;
    }

    public Float getWidth() {
	return this.width;
    }

    public void setWidth(Float width) {
	this.width = width;
    }

    public Product getProduct() {
	return this.product;
    }

    public void setProduct(Product product) {
	this.product = product;
    }

    public List<ProductDetailsAttrValueMap> getProductDetailsAttrValueMaps() {
	return this.productDetailsAttrValueMaps;
    }

    public void setProductDetailsAttrValueMaps(List<ProductDetailsAttrValueMap> productDetailsAttrValueMaps) {
	this.productDetailsAttrValueMaps = productDetailsAttrValueMaps;
    }

    public ProductDetailsAttrValueMap addProductDetailsAttrValueMap(
	    ProductDetailsAttrValueMap productDetailsAttrValueMap) {
	getProductDetailsAttrValueMaps().add(productDetailsAttrValueMap);
	productDetailsAttrValueMap.setProductDetail(this);

	return productDetailsAttrValueMap;
    }

    public ProductDetailsAttrValueMap removeProductDetailsAttrValueMap(
	    ProductDetailsAttrValueMap productDetailsAttrValueMap) {
	getProductDetailsAttrValueMaps().remove(productDetailsAttrValueMap);
	productDetailsAttrValueMap.setProductDetail(null);

	return productDetailsAttrValueMap;
    }

    public List<ProductDetailsMediaMap> getProductDetailsMediaMaps() {
	return this.productDetailsMediaMaps;
    }

    public void setProductDetailsMediaMaps(List<ProductDetailsMediaMap> productDetailsMediaMaps) {
	this.productDetailsMediaMaps = productDetailsMediaMaps;
    }

    public ProductDetailsMediaMap addProductDetailsMediaMap(ProductDetailsMediaMap productDetailsMediaMap) {
	getProductDetailsMediaMaps().add(productDetailsMediaMap);
	productDetailsMediaMap.setProductDetail(this);

	return productDetailsMediaMap;
    }

    public ProductDetailsMediaMap removeProductDetailsMediaMap(ProductDetailsMediaMap productDetailsMediaMap) {
	getProductDetailsMediaMaps().remove(productDetailsMediaMap);
	productDetailsMediaMap.setProductDetail(null);

	return productDetailsMediaMap;
    }

    public List<Sku> getSkus() {
	return this.skus;
    }

    public void setSkus(List<Sku> skus) {
	this.skus = skus;
    }

    public Sku addSkus(Sku skus) {
	getSkus().add(skus);
	skus.setProductDetail(this);

	return skus;
    }

    public Sku removeSkus(Sku skus) {
	getSkus().remove(skus);
	skus.setProductDetail(null);

	return skus;
    }

}