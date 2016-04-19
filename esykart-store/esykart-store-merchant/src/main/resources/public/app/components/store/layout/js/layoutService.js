angular.module('altairApp').constant('storeServiceUrl', 'stores/layouts')
.service('StoreService',
		['$http','storeServiceUrl',
		function($http, storeServiceUrl) {
			var service = {};
			service.save = function (data){
		    	return $http.post(storeServiceUrl,role);
		    };
		    service.update = function(id,data){
				return $http.put(storeServiceUrl+"/" +roleId ,role);
		    };
		    
		    service.find = function(id,projection){
				return $http.get(storeServiceUrl +"/" +id+"?projection="+projection);
		    };
		    service.findAll = function(page, size,sort,projection){
		    	var finalUrl = storeServiceUrl+"?projection="+projection;
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
				return $http.get(storeServiceUrl +"/search?projection="+projection,filter);
		    };
		    
		    service.changeStatus = function(id,status){
		    	return $http.patch(storeServiceUrl +"/" + id + "/changeStatus?status="+status);
		    }
		    return service;
		} 
]);
