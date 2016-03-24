function ProductDetail() {
	this.id = null;
	this.description = null;
	this.longDescription = null;
	this.isDiscountable = false;
	this.isFeaturedProduct = false;
	this.isActionable = false;
	this.useProductMedia = false
	this.status = null;

	this.weightUnitOfMeasure = null;
	this.weight = null;

	this.dimensionUnitOfMeasure = null;
	this.height = null;
	this.length = null;
	this.width = null;
	
	this.activeEndDate = null;
	this.activeStartDate = null;

	this.productDetailsAttrValueMaps = new Array();
	this.productDetailsMediaMaps = new Array();
	this.product = new Product();

	this.setProduct = function(productId) {
		product.id = productId;
	}
	
	this.addAttribute = function(lable, value, type) {
		var attr = new ProductDetailAttributeValue()
		attr.lable = lable;
		attr.value = value;
		attr.type = type;
		this.productDetailsAttrValueMaps.push(attr);
	};

	this.addMedia = function(mapKey, data) {
		var media = new Object();
		media.mapKey = mapKey;
//		media.url = url;
		media.data = data;
		this.productDetailsMediaMaps.push(media);
	};
	
	this.toJson = function() {
		return JSON.stringify(this);
	}
}

function ProductDetailAttributeValue() {
	this.id;
	this.lable;
	this.type;
	this.value;
}
