package com.webientsoft.esykart.product.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the product_details_attr_value_map database table.
 * 
 */
@Entity
@Table(name = "product_details_attr_value_map")
public class ProductDetailsAttrValueMap implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category_attr_lable")
    private String categoryAttrLable;

    @Column(name = "category_attr_type")
    private String categoryAttrType;

    @Column(name = "category_attr_value")
    private String categoryAttrValue;

    // bi-directional many-to-one association to ProductDetail
    @ManyToOne
    @JoinColumn(name = "product_details_id")
    private ProductDetail productDetail;

    public ProductDetailsAttrValueMap() {
    }

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getCategoryAttrLable() {
	return this.categoryAttrLable;
    }

    public void setCategoryAttrLable(String categoryAttrLable) {
	this.categoryAttrLable = categoryAttrLable;
    }

    public String getCategoryAttrType() {
	return this.categoryAttrType;
    }

    public void setCategoryAttrType(String categoryAttrType) {
	this.categoryAttrType = categoryAttrType;
    }

    public String getCategoryAttrValue() {
	return this.categoryAttrValue;
    }

    public void setCategoryAttrValue(String categoryAttrValue) {
	this.categoryAttrValue = categoryAttrValue;
    }

    public ProductDetail getProductDetail() {
	return this.productDetail;
    }

    public void setProductDetail(ProductDetail productDetail) {
	this.productDetail = productDetail;
    }

}