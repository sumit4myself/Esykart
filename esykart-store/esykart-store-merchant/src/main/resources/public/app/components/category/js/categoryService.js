angular.module('altairApp').constant('url', 'categories')
.service('CategoryService',
['$http','utils','url',
function($http, utils, url) {
	var service = {};
	service.save = function (role){
    	return $http.post(url,role);
    };
    service.update = function(roleId,role){
		return $http.put(url+"/" +roleId ,role);
    };
    
    service.find = function(id){
		return $http.get(url +"/" +id);
    };
    service.findAll = function(){
		return $http.get(url +"/findAll");
    };
    service.search = function(filter){
		return $http.get(url +"/search",filter);
    };
    service.changeStatus = function(id,status){
    	return $http.delete(url +"/" + id + "?status="+status);
    }
return service;
} 
]);
