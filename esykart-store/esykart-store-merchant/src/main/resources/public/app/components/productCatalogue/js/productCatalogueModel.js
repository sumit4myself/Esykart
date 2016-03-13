var product.catalogue = {
		this.id : null,
		this.manufacture : null,
		this.model : null,
		this.name : null,
		this.isTaxable : null,
		this.taxCode : null,
	
		this.category : new Object(),
		this.details : new Array(),
	
		setCategory : function (categoryId){
			category.id = categoryId;
		}
		
		addDetail : function(detail){
			details.push(detail);
		}
		
		toJson : function(){
			return JSON.stringify(product.catalogue);
		}
}


var product.details = {
		this.id : null,
		this.description : null,
		this.longDescription: null,
		this.isDiscountable: null,
		this.isFeaturedProduct: null,
		this.status: null,

		this.weightUnitOfMeasure: null,
		this.weight: null,

		this.dimensionUnitOfMeasure: null,
		this.height: null,
		this.length: null,
		this.width: null,

		this.productDetailsAttrValueMaps = new Array(),
		this.productDetailsMediaMaps = new Array(),

		addAttr  : function(categoryAttrLable,categoryAttrValue,categoryAttrType){
			var attr = new Object();
			attr.categoryAttrLable = categoryAttrLable;
			attr.categoryAttrValue = categoryAttrValue;
			attr.categoryAttrType  = categoryAttrType;
			productDetailsAttrValueMaps.push(attr);
		},
		
		addMedia  : function(mapKey,url){
			var media = new Object();
			media.mapKey = mapKey;
			media.url = url;
			productDetailsMediaMaps.push(media);
		},
		toJson : function(){
			return JSON.stringify(product.details);
		}
}