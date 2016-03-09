package com.webientsoft.esykart.product.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * The persistent class for the product database table.
 * 
 */
@Entity
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "is_taxable")
    private String isTaxable;

    private String manufacture;

    private String model;

    private String name;

    @Column(name = "tax_code")
    private String taxCode;

    @ManyToOne
    private Category category;

    
    @OneToOne(mappedBy = "product",fetch = FetchType.LAZY)
    private ProductDetail detail;

    public Product() {
    }

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getIsTaxable() {
	return this.isTaxable;
    }

    public void setIsTaxable(String isTaxable) {
	this.isTaxable = isTaxable;
    }

    public String getManufacture() {
	return this.manufacture;
    }

    public void setManufacture(String manufacture) {
	this.manufacture = manufacture;
    }

    public String getModel() {
	return this.model;
    }

    public void setModel(String model) {
	this.model = model;
    }

    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getTaxCode() {
	return this.taxCode;
    }

    public void setTaxCode(String taxCode) {
	this.taxCode = taxCode;
    }

    public Category getCategory() {
	return this.category;
    }

    public void setCategory(Category category) {
	this.category = category;
    }

    public ProductDetail getDetail() {
	return detail;
    }

    public void setDetail(ProductDetail detail) {
	this.detail = detail;
    }
}