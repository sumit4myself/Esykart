angular.module('altairApp').constant('pageServiceUrl', 'stores/pages')
.service('StoreService',
		['$http','pageServiceUrl',
		function($http,pageServiceUrl) {
			var service = {};
			service.save = function (data){
		    	return $http.post(pageServiceUrl,role);
		    };
		    service.update = function(id,data){
				return $http.put(pageServiceUrl+"/" +roleId ,role);
		    };
		    
		    service.find = function(id,projection){
				return $http.get(pageServiceUrl +"/" +id+"?projection="+projection);
		    };
		    service.findAll = function(page, size,sort,projection){
		    	var finalUrl = pageServiceUrl+"?projection="+projection;
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
				return $http.get(pageServiceUrl +"/search?projection="+projection,filter);
		    };
		    
		    service.changeStatus = function(id,status){
		    	return $http.patch(pageServiceUrl +"/" + id + "/changeStatus?status="+status);
		    }
		    return service;
		} 
]);
