angular.module('altairApp').constant('categoryServiceUrl', '../products/categories')
.service('CategoryService',
['$http','categoryServiceUrl',
function($http, categoryServiceUrl) {
	var service = {};
	service.save = function (data){
    	return $http.post(categoryServiceUrl,data);
    };
    service.update = function(id,data){
		return $http.put(categoryServiceUrl+"/" +id ,data);
    };
    
    service.find = function(id,projection){
		return $http.get(categoryServiceUrl +"/" +id+"?projection="+projection);
    };
    service.findAll = function(page, size,sort,projection){
    	var finalUrl = categoryServiceUrl+"?projection="+projection;
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
		return $http.post(categoryServiceUrl +"/search?projection="+projection,filter);
    };
    
    service.changeStatus = function(id,status){
    	return $http.patch(categoryServiceUrl +"/" + id + "/changeStatus?status="+status);
    }
    return service;
} 
]);
