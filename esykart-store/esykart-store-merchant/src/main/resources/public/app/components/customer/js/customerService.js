angular.module('altairApp').constant('url', 'rest/customer/')
.service('CustomerService',
		['$http','utils','url',
		function($http, utils, url) {

			var service = {};
	        service.save = function (category){
	        	return $http.post(url,category)
				.then(utils.handleSuccess, utils.handleError('Error occurred while saving customer.'));
	        };
	        service.update = function(categoryId,category){
				return $http.put(url+"/" +categoryId ,category)
				.then(utils.handleSuccess, utils.handleError('Error occurred while updating customer.'));
	        };
	        
	        service.find = function(id){
				return $http.get(url +"/" +id)
				.then(utils.handleSuccess, utils.handleError('Error occurred while finding customer.'));
	        };
	        service.findAll = function(){
				return $http.get(url +"/findAll")
				.then(utils.handleSuccess, utils.handleError('Error occurred while finding customer.'));
	        };
	        service.search = function(filter){
				return $http.get(url +"/search",filter)
				.then(utils.handleSuccess, utils.handleError('Error occurred while searching customer.'));
	        };
	        service.changeStatus = function(ids,status){
				return $http.delete(url +"/" + status )
				.then(utils.handleSuccess, utils.handleError('Somting went wrong please customer.'));
	        }
	        return service;
		} 
]);

