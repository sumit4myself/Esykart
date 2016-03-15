function Product(){
	this.id = null;
	this.manufacture = null;
	this.model = null;
	this.name = null;
	this.isTaxable = null;
	this.taxCode = null;
	
	this.category = new Object();
	this.details = new Array();
	
	this.setCategory = function (categoryId){
		var category = new Category();
		category.id = categoryId;
		this.category = category;
		
	}
	
	this.addDetail = function(detail){
		this.details.push(detail);
	}
	
	this.toJson = function(){
		return JSON.stringify(this);
	}	
}

function ProductDetail(){
	this.id = null;
	this.description = null;
	this.longDescription= null;
	this.isDiscountable= null;
	this.isFeaturedProduct= null;
	this.status= null;
	
	this.weightUnitOfMeasure= null;
	this.weight= null;
	
	this.dimensionUnitOfMeasure= null;
	this.height= null;
	this.length= null;
	this.width= null;
	
	this.productDetailsAttrValueMaps = new Array();
	this.productDetailsMediaMaps = new Array();
	
	this.addAttribute  = function(lable,value,type){
		var attr = new ProductDetailAttributeValue()
		attr.lable = lable;
		attr.value = value;
		attr.type  = type;
		this.productDetailsAttrValueMaps.push(attr);
	};
	
	this.addMedia  = function(mapKey;url){
		var media = new Object();
		media.mapKey = mapKey;
		media.url = url;
		this.productDetailsMediaMaps.push(media);
	};
	this.toJson = function(){
		return JSON.stringify(this);
	}
}

function ProductDetailAttributeValue(){
	this.id;
	this.lable;
	this.type;
	this.value;
}