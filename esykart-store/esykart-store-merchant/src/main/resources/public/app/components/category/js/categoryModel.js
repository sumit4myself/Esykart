function Category() {

	this.categoryId = null;
	this.name = null;
	this.longDescription = null;
	this.description = null;

	this.activeEndDate = null;
	this.activeStartDate = null;

	this.fulfillmentType = null;
	this.inventoryType = null;
	this.imageUrl = null;

	this.status = null;

	this.template = null;
	this.bannerId = null;
	this.url = null;
	this.parentCategory = new Object();

	this.categoryAttributes = new Array();

	this.setParentCategory = function(parentCategoryId) {
		var parentCategory = new Category();
		parentCategory.id = parentCategoryId;
		this.parentCategory = parentCategory;
	}
	
	this.addAttribute = function(id){
		var categoryAttribute = new CategoryAttribute();
		categoryAttribute.id = id;
		this.categoryAttributes.push(categoryAttribute);
	}

	this.toJson = function() {
		return JSON.stringify(this);
	}
	
	
}
