angular.module('altairApp').constant('url', 'rest/merchant/')
.service('MerchantService',
		['$http','utils','url',
		function($http, utils, url) {
			var service = {};
	        service.save = _save;
	        service.update = _update;
	        service.updatePreference = _updatePreference;
	        service.find = _find;
	        service.search = _search;
	        service.changeStatus = _changeStatus;
	        return service;
			
//			private functions
			function _save(merchant){
				console.log('Merchant Service called');
				return $http.post(url,merchant)
							.then(utils.handleSuccess, utils.handleError('Error occurred while saving user.'));
			}
			function _update(merchantId,merchant){
				return $http.put(url+"/" +merchantId ,merchant)
							.then(utils.handleSuccess, utils.handleError('Error occurred while updating user.'));
			}
			function _updatePreference(merchantId,preference) {
	            return $http.put(url,preference)
	            			.then(utils.handleSuccess, utils.handleError('Error occurred while updaing user preferance.'));
	        }
			function _changeStatus(ids,status){
				/*return $http.delete(url +"/" + status )
							.then(utils.handleSuccess, utils.handleError('Somting went wrong please retry.'));*/
			}
			function _find(id){
				return $http.get(url +"/" +id)
							.then(utils.handleSuccess, utils.handleError('Error occurred while finding user.'));
			}
			function _search(filter){
				return $http.get(url +"/search",filter)
							.then(utils.handleSuccess, utils.handleError('Error occurred while searching user.'));
			}
		} 
]);
