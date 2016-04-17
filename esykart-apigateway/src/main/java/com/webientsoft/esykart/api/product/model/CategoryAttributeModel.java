package com.webientsoft.esykart.api.product.model;

import java.util.List;

public class CategoryAttributeModel {

	private Integer id;
	private Integer displayOrder;
	private boolean isRequired;
	private boolean isSearchable;
	private String label;
	private String name;
	private String attributeType;
	private String attributeDisplayType;
	private String validationErrorCode;
	private String validationErrorMsg;
	private String validationRule;
	private String validationType;

	private List<CategoryAttributeValueModel> values;

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

	public String getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}

	public String getAttributeDisplayType() {
		return attributeDisplayType;
	}

	public void setAttributeDisplayType(String attributeDisplayType) {
		this.attributeDisplayType = attributeDisplayType;
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

	public String getValidationType() {
		return validationType;
	}

	public void setValidationType(String validationType) {
		this.validationType = validationType;
	}

	public List<CategoryAttributeValueModel> getValues() {
		return values;
	}

	public void setValues(List<CategoryAttributeValueModel> values) {
		this.values = values;
	}

}
