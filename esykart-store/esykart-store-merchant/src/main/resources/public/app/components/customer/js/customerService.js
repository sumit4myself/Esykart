angular.module('altairApp').constant('csServiceUrl', 'customers/')
.service('CustomerService',
		['$http','csServiceUrl',
		function($http, csServiceUrl) {
			var service = {};
			service.save = function (data){
		    	return $http.post(csServiceUrl,role);
		    };
		    service.update = function(id,data){
				return $http.put(csServiceUrl+"/" +roleId ,role);
		    };
		    
		    service.find = function(id,projection){
				return $http.get(csServiceUrl +"/" +id+"?projection="+projection);
		    };
		    service.findAll = function(page, size,sort,projection){
		    	var finalUrl = csServiceUrl+"?projection="+projection;
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
				return $http.get(csServiceUrl +"/search?projection="+projection,filter);
		    };
		    
		    service.changeStatus = function(id,status){
		    	return $http.patch(csServiceUrl +"/" + id + "/changeStatus?status="+status);
		    }
		    return service;
		} 
]);

