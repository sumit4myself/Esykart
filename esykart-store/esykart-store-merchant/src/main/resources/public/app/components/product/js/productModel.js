function Product() {
	this.id = null;
	this.manufacture = null;
	this.model = null;
	this.name = null;
	this.isTaxable = false;
	this.taxDetailId = null;
	this.fulfillmentType = null;
	this.inventoryType = null;
	this.productMediaMaps = new Array();
	this.category = new Category();

	this.setCategory = function(categoryId) {
		category.id = categoryId;
	}

	this.addMedia = function(mapKey, url) {
		var media = new Object();
		media.mapKey = mapKey;
		media.url = url;
		this.productMediaMaps.push(media);
	};

	this.toJson = function() {
		return JSON.stringify(this);
	}
}