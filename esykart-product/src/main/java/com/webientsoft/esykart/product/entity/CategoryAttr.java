package com.webientsoft.esykart.product.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the category_attr database table.
 * 
 */
@Entity
@Table(name = "category_attr")
public class CategoryAttr implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "display_order")
    private Integer displayOrder;

    @Column(name = "is_required")
    private String isRequired;

    @Column(name = "is_searchable")
    private String isSearchable;

    private String label;

    private String name;

    private String type;

    @Column(name = "ui_type")
    private String uiType;

    @Column(name = "validation_error_code")
    private String validationErrorCode;

    @Column(name = "validation_error_msg")
    private String validationErrorMsg;

    @Column(name = "validation_rule")
    private String validationRule;

    @Column(name = "validation_type")
    private String validationType;

    // bi-directional many-to-one association to CategoryAttrValue
    @OneToMany(mappedBy = "categoryAttr")
    private List<CategoryAttrValue> categoryAttrValues;

    // bi-directional many-to-many association to Category
    @ManyToMany
    @JoinTable(name = "category_category_attr_xref", joinColumns = {
	    @JoinColumn(name = "category_attr_id") }, inverseJoinColumns = { @JoinColumn(name = "category_id") })
    private List<Category> categories;

    public CategoryAttr() {
    }

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public Integer getDisplayOrder() {
	return this.displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
	this.displayOrder = displayOrder;
    }

    public String getIsRequired() {
	return this.isRequired;
    }

    public void setIsRequired(String isRequired) {
	this.isRequired = isRequired;
    }

    public String getIsSearchable() {
	return this.isSearchable;
    }

    public void setIsSearchable(String isSearchable) {
	this.isSearchable = isSearchable;
    }

    public String getLabel() {
	return this.label;
    }

    public void setLabel(String label) {
	this.label = label;
    }

    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getType() {
	return this.type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public String getUiType() {
	return this.uiType;
    }

    public void setUiType(String uiType) {
	this.uiType = uiType;
    }

    public String getValidationErrorCode() {
	return this.validationErrorCode;
    }

    public void setValidationErrorCode(String validationErrorCode) {
	this.validationErrorCode = validationErrorCode;
    }

    public String getValidationErrorMsg() {
	return this.validationErrorMsg;
    }

    public void setValidationErrorMsg(String validationErrorMsg) {
	this.validationErrorMsg = validationErrorMsg;
    }

    public String getValidationRule() {
	return this.validationRule;
    }

    public void setValidationRule(String validationRule) {
	this.validationRule = validationRule;
    }

    public String getValidationType() {
	return this.validationType;
    }

    public void setValidationType(String validationType) {
	this.validationType = validationType;
    }

    public List<CategoryAttrValue> getCategoryAttrValues() {
	return this.categoryAttrValues;
    }

    public void setCategoryAttrValues(List<CategoryAttrValue> categoryAttrValues) {
	this.categoryAttrValues = categoryAttrValues;
    }

    public CategoryAttrValue addCategoryAttrValue(CategoryAttrValue categoryAttrValue) {
	getCategoryAttrValues().add(categoryAttrValue);
	categoryAttrValue.setCategoryAttr(this);

	return categoryAttrValue;
    }

    public CategoryAttrValue removeCategoryAttrValue(CategoryAttrValue categoryAttrValue) {
	getCategoryAttrValues().remove(categoryAttrValue);
	categoryAttrValue.setCategoryAttr(null);

	return categoryAttrValue;
    }

    public List<Category> getCategories() {
	return this.categories;
    }

    public void setCategories(List<Category> categories) {
	this.categories = categories;
    }

}