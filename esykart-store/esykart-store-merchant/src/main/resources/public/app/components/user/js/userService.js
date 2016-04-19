angular.module('altairApp').constant('userServiceUrl', 'users/')
.service('UserService',
['$http','userServiceUrl',
function($http, userServiceUrl) {
	var service = {};
	service.save = function (data){
    	return $http.post(userServiceUrl,role);
    };
    service.update = function(id,data){
		return $http.put(userServiceUrl+"/" +roleId ,role);
    };
    
    service.find = function(id,projection){
		return $http.get(userServiceUrl +"/" +id+"?projection="+projection);
    };
    service.findAll = function(page, size,sort,projection){
    	var finalUrl = userServiceUrl+"?projection="+projection;
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
		return $http.get(userServiceUrl +"/search?projection="+projection,filter);
    };
    
    service.changeStatus = function(id,status){
    	return $http.patch(userServiceUrl +"/" + id + "/changeStatus?status="+status);
    }
    return service;
} 
]);
