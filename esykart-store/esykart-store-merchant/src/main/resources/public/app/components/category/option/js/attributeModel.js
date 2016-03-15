function CategoryAttribute() {
	
	this.id = null;
	this.name = null;
	this.label = null;
	this.displayOrder = null;
	
	this.isRequired = null;
	this.isSearchable = null;
	
	this.attributeType = null;
	this.attributeDisplayType = null;
	
	this.validationErrorCode = null;
	this.validationErrorMsg = null;
	this.validationRule = null;
	this.validationType = null;
	
	this.categoryAttributeValues = new Array();

	this.appValue(id, label, value) {
		CategoryAttributeValue categoryAttributeValue = new CategoryAttributeValue();
		categoryAttributeValue.id = id;
		categoryAttributeValue.lable = label;
		categoryAttributeValue.value = value;
		categoryAttributeValues.push(categoryAttributeValue);
	}
	
	this.toJson : function(){
		return JSON.stringify(this);
	}
}

function CategoryAttributeValue() {
	this.id = null;
	this.label = null;
	this.value = null;
}
