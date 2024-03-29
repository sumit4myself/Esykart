﻿angular.module('altairApp').constant('orderServiceUrl', 'orders')
.service('OrderService',
		['$http','orderServiceUrl',
		function($http, orderServiceUrl) {
			var service = {};
			service.save = function (data){
		    	return $http.post(orderServiceUrl,role);
		    };
		    
		    service.update = function(id,data){
				return $http.put(orderServiceUrl+"/" +roleId ,role);
		    };
		    
		    service.find = function(id,projection){
				return $http.get(orderServiceUrl +"/" +id+"?projection="+projection);
		    };
		    service.findAll = function(page, size,sort,projection){
		    	var finalUrl = orderServiceUrl+"?projection="+projection;
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
				return $http.get(orderServiceUrl +"/search?projection="+projection,filter);
		    };
		    
		    service.changeStatus = function(id,status){
		    	return $http.patch(orderServiceUrl +"/" + id + "/changeStatus?status="+status);
		    }
		    return service;
		} 
]);
