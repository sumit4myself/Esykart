angular.module('altairApp').constant('caServiceUrl', 'products/categoryAttributes')
.service('AttributeService', 
		['$http','caServiceUrl',
  function($http, caServiceUrl) {
	var service = {};
	service.save = function (data){
    	return $http.post(caServiceUrl,data);
    };
    service.update = function(id,data){
		return $http.put(caServiceUrl+"/" +id ,data);
    };
    
    service.find = function(id,projection){
		return $http.get(caServiceUrl +"/" +id+"?projection="+projection);
    };
    service.findAll = function(page, size,sort,projection){
    	var finalUrl = caServiceUrl+"?projection="+projection;
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
		return $http.get(caServiceUrl +"/search?projection="+projection,filter);
    };
    
    service.changeStatus = function(id,status){
    	return $http.patch(caServiceUrl +"/" + id + "/changeStatus?status="+status);
    }
    return service;
} 
]);
