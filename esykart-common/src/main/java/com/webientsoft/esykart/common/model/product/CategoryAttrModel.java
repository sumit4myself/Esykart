package com.webientsoft.esykart.common.model.product;

public class CategoryAttrModel {

	private Integer id;
	private Integer displayOrder;
	private boolean isRequired;
	private boolean isSearchable;
	private String label;
	private String name;
	private String type;
	private String uiType;
	private String validationErrorCode;
	private String validationErrorMsg;
	private String validationRule;
	private String validationType;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUiType() {
		return uiType;
	}

	public void setUiType(String uiType) {
		this.uiType = uiType;
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

}
