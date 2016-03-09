package com.webientsoft.esykart.product.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the category_attr_value database table.
 * 
 */
@Entity
@Table(name = "category_attr_value")
public class CategoryAttrValue implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String label;

    private String value;

    // bi-directional many-to-one association to CategoryAttr
    @ManyToOne
    @JoinColumn(name = "category_attr_id")
    private CategoryAttr categoryAttr;

    public CategoryAttrValue() {
    }

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getLabel() {
	return this.label;
    }

    public void setLabel(String label) {
	this.label = label;
    }

    public String getValue() {
	return this.value;
    }

    public void setValue(String value) {
	this.value = value;
    }

    public CategoryAttr getCategoryAttr() {
	return this.categoryAttr;
    }

    public void setCategoryAttr(CategoryAttr categoryAttr) {
	this.categoryAttr = categoryAttr;
    }

}