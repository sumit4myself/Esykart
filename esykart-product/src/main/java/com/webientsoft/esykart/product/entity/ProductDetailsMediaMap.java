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
 * The persistent class for the product_details_media_map database table.
 * 
 */
@Entity
@Table(name = "product_details_media_map")
public class ProductDetailsMediaMap implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "map_key")
    private String mapKey;

    private String url;

    // bi-directional many-to-one association to ProductDetail
    @ManyToOne
    @JoinColumn(name = "product_details_id")
    private ProductDetail productDetail;

    public ProductDetailsMediaMap() {
    }

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getMapKey() {
	return this.mapKey;
    }

    public void setMapKey(String mapKey) {
	this.mapKey = mapKey;
    }

    public String getUrl() {
	return this.url;
    }

    public void setUrl(String url) {
	this.url = url;
    }

    public ProductDetail getProductDetail() {
	return this.productDetail;
    }

    public void setProductDetail(ProductDetail productDetail) {
	this.productDetail = productDetail;
    }

}