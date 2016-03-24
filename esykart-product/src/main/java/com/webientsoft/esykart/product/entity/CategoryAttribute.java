package com.webientsoft.esykart.product.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
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
@Table(name = "category_attribute")
public class CategoryAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "display_order")
	private Integer displayOrder;

	@Column(name = "is_required")
	private boolean isRequired;

	@Column(name = "is_searchable")
	private boolean isSearchable;

	private String label;

	private String name;

	@Enumerated
	@Column(name = "attribute_type")
	private AttributeType attributeType;

	@Enumerated
	@Column(name = "display_type")
	private AttributeDisplayType attributeDisplayType;

	@Column(name = "validation_error_code")
	private String validationErrorCode;

	@Column(name = "validation_error_msg")
	private String validationErrorMsg;

	@Column(name = "validation_rule")
	private String validationRule;

	@OneToMany(mappedBy = "categoryAttribute")
	private List<CategoryAttributeValue> categoryAttributeValues;

	@ManyToMany
	@JoinTable(name = "category_attribute_xref", joinColumns = {
			@JoinColumn(name = "category_attribute_id") }, inverseJoinColumns = { @JoinColumn(name = "category_id") })
	private List<Category> categories;

	public CategoryAttribute() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AttributeType getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(AttributeType attributeType) {
		this.attributeType = attributeType;
	}

	public String getValidationErrorCode() {
		return validationErrorCode;
	}

	public void setValidationErrorCode(String validationErrorCode) {
		this.validationErrorCode = validationErrorCode;
	}

	public String getValidationErrorMsg() {
		return validationErrorMsg;
	}

	public void setValidationErrorMsg(String validationErrorMsg) {
		this.validationErrorMsg = validationErrorMsg;
	}

	public String getValidationRule() {
		return validationRule;
	}

	public void setValidationRule(String validationRule) {
		this.validationRule = validationRule;
	}

	public List<CategoryAttributeValue> getCategoryAttributeValues() {
		return categoryAttributeValues;
	}

	public void setCategoryAttributeValues(List<CategoryAttributeValue> categoryAttributeValues) {
		this.categoryAttributeValues = categoryAttributeValues;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public AttributeDisplayType getAttributeDisplayType() {
		return attributeDisplayType;
	}

	public void setAttributeDisplayType(AttributeDisplayType attributeDisplayType) {
		this.attributeDisplayType = attributeDisplayType;
	}

	public boolean isRequired() {
		return isRequired;
	}

	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}

	public boolean isSearchable() {
		return isSearchable;
	}

	public void setSearchable(boolean isSearchable) {
		this.isSearchable = isSearchable;
	}
	
	

}