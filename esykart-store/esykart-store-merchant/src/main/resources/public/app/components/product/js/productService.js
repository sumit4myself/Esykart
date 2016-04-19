angular.module('altairApp').constant('url', 'products')
.service('ProductService',
[ '$http', 'utils', 'url', function($http, utils, url) {
	var service = {};
	service.save = function (data){
    	return $http.post(url,role);
    };
    service.update = function(id,data){
		return $http.put(url+"/" +roleId ,role);
    };
    
    service.find = function(id,projection){
		return $http.get(url +"/" +id+"?projection="+projection);
    };
    service.findAll = function(page, size,sort,projection){
    	var finalUrl = url+"?projection="+projection;
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
		return $http.get(url +"/search?projection="+projection,filter);
    };
    
    service.changeStatus = function(id,status){
    	return $http.patch(url +"/" + id + "/changeStatus?status="+status);
    }
    return service;
} ]);
