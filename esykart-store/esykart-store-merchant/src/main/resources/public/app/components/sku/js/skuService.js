angular.module('altairApp').constant('skuServiceUrl', 'products/skus')
.service('SkuService',
		['$http','skuServiceUrl',
		function($http, skuServiceUrl) {
			var service = {};
			service.save = function (data){
		    	return $http.post(skuServiceUrl,role);
		    };
		    service.update = function(id,data){
				return $http.put(skuServiceUrl+"/" +roleId ,role);
		    };
		    
		    service.find = function(id,projection){
				return $http.get(skuServiceUrl +"/" +id+"?projection="+projection);
		    };
		    service.findAll = function(page, size,sort,projection){
		    	var finalUrl = skuServiceUrl+"?projection="+projection;
	    		finalUrl += "&page="+page;
	    		finalUrl += "&size="+size;
		     	if(sort!= null && sort.length > 0){
		    		$(sort).each(function(){
		    			finalUrl += "&sort=";
		    			finalUrl += this;
		    		});
		    	}
				return $http.get(finalUrl);
		    };

		    service.search = function(filter,projection){
				return $http.get(skuServiceUrl +"/search?projection="+projection,filter);
		    };
		    
		    service.changeStatus = function(id,status){
		    	return $http.patch(skuServiceUrl +"/" + id + "/changeStatus?status="+status);
		    }
		    return service;
		} 
]);
