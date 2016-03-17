angular.module('altairApp').constant('url', 'rest/user/')
.service('BannerService',
		['$http','utils','url',
		function($http, utils, url) {
			var service = {};
	        service.save = function (){
	        	return $http.post(url,banner)
				.then(utils.handleSuccess, utils.handleError('Error occurred while saving banner.'));
	        };
	        service.update = function(bannerId,banner){
				return $http.put(url+"/" +bannerId ,banner)
				.then(utils.handleSuccess, utils.handleError('Error occurred while updating banner.'));
	        };
	        
	        service.find = function(id){
				return $http.get(url +"/" +id)
				.then(utils.handleSuccess, utils.handleError('Error occurred while finding banner.'));
	        };
	        service.findAll = function(){
				return $http.get(url +"/findAll")
				.then(utils.handleSuccess, utils.handleError('Error occurred while finding banner.'));
	        };
	        service.search = function(filter){
				return $http.get(url +"/search",filter)
				.then(utils.handleSuccess, utils.handleError('Error occurred while searching banner.'));
	        };
	        service.changeStatus = function(ids,status){
				return $http.delete(url +"/" + status )
				.then(utils.handleSuccess, utils.handleError('Somting went wrong please retry.'));
	        }
	        return service;
		} 
]);
