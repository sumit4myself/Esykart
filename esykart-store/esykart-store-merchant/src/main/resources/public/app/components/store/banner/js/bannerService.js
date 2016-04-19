angular.module('altairApp').constant('bannerServiceUrl', 'stores/banners')
.service('BannerService',
		['$http','bannerServiceUrl',
		function($http, bannerServiceUrl) {
			var service = {};
			service.save = function (data){
		    	return $http.post(bannerServiceUrl,role);
		    };
		    service.update = function(id,data){
				return $http.put(bannerServiceUrl+"/" +roleId ,role);
		    };
		    
		    service.find = function(id,projection){
				return $http.get(bannerServiceUrl +"/" +id+"?projection="+projection);
		    };
		    service.findAll = function(page, size,sort,projection){
		    	var finalUrl = bannerServiceUrl+"?projection="+projection;
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
				return $http.get(bannerServiceUrl +"/search?projection="+projection,filter);
		    };
		    
		    service.changeStatus = function(id,status){
		    	return $http.patch(bannerServiceUrl +"/" + id + "/changeStatus?status="+status);
		    }
		    return service;
		} 
]);
