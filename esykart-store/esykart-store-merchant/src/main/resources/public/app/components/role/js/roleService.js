﻿angular.module('altairApp').constant('roleServiceUrl', 'roles/')
.service('RoleService',
['$http','roleServiceUrl',
function($http,roleServiceUrl) {
	var service = {};
	service.save = function (data){
    	return $http.post(roleServiceUrl,data);
    };
    service.update = function(id,data){
		return $http.put(roleServiceUrl+id ,data);
    };
    
    service.find = function(id,projection){
		return $http.get(roleServiceUrl+id+"?projection="+projection);
    };
    service.findAll = function(page, size,sort,projection){
    	var finalUrl = roleServiceUrl+"?projection="+projection;
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
		return $http.post(roleServiceUrl +"search?projection="+projection,filter);
    };
    
    service.changeStatus = function(id,status){
    	return $http.patch(roleServiceUrl + id + "/changeStatus?status="+status);
    }
    return service;
} 
]);
