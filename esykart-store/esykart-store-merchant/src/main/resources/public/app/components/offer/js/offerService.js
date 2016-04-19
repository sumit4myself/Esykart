angular.module('altairApp').constant('OfferServiceUrl', 'offers/')
.service('OfferService',
		['$http','OfferServiceUrl',
		function($http, OfferServiceUrl) {
			var service = {};
			service.save = function (data){
		    	return $http.post(OfferServiceUrl,role);
		    };
		    service.update = function(id,data){
				return $http.put(OfferServiceUrl+"/" +roleId ,role);
		    };
		    
		    service.find = function(id,projection){
				return $http.get(OfferServiceUrl +"/" +id+"?projection="+projection);
		    };
		    service.findAll = function(page, size,sort,projection){
		    	var finalUrl = OfferServiceUrl+"?projection="+projection;
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
				return $http.get(OfferServiceUrl +"/search?projection="+projection,filter);
		    };
		    
		    service.changeStatus = function(id,status){
		    	return $http.patch(OfferServiceUrl +"/" + id + "/changeStatus?status="+status);
		    }
		    return service;
		} 
]);
