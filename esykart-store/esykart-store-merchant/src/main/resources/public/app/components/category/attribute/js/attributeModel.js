function CategoryAttribute() {
	
	this.attributeId = null;
	this.name = null;
	this.label = null;
	this.displayOrder = null;
	
	this.isRequired = true;
	this.isSearchable = false;
	
	this.attributeType = null;
	this.attributeDisplayType = null;
	
	this.validationErrorCode = null;
	this.validationErrorMsg = null;
	this.validationRule = null;
	
	this.categoryAttributeValues = new Array();

	this.addValue = function(attributeValueId, label, value) {
		var categoryAttributeValue = new Object();
		categoryAttributeValue.attributeValueId = attributeValueId;
		categoryAttributeValue.lable = label;
		categoryAttributeValue.value = value;
		categoryAttributeValues.push(categoryAttributeValue);
	}
	
	this.toJson = function(){
		return JSON.stringify(this);
	}
}

