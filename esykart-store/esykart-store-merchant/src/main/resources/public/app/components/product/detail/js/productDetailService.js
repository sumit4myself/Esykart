angular.module('altairApp').constant('pdServiceUrl', '/products/details')
.service('ProductDetailService',
['$http','pdServiceUrl',
 function($http, pdServiceUrl) {
	var service = {};
	service.save = function (data){
    	return $http.post(pdServiceUrl,role);
    };
    service.update = function(id,data){
		return $http.put(pdServiceUrl+"/" +roleId ,role);
    };
    
    service.find = function(id,projection){
		return $http.get(pdServiceUrl +"/" +id+"?projection="+projection);
    };
    service.findAll = function(page, size,sort,projection){
    	var finalUrl = pdServiceUrl+"?projection="+projection;
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
		return $http.get(pdServiceUrl +"/search?projection="+projection,filter);
    };
    
    service.changeStatus = function(id,status){
    	return $http.patch(pdServiceUrl +"/" + id + "/changeStatus?status="+status);
    }
    return service;
} 
]);
