angular.module('altairApp').constant('url', 'rest/user/')
.service('UserService',
		['$http','utils','url',
		function($http, utils, url) {
			
			
//			mapping private function to public 
			var service = {};
	        service.save = _save;
	        service.update = _update;
	        service.updatePreference = _updatePreference;
	        service.find = _find;
	        service.search = _search;
	        service.changeStatus = _changeStatus;
	        return service;
			
//			private functions
			function _save(user){
				return $http.post(url,user)
							.then(utils.handleSuccess, utils.handleError('Error occurred while saving user.'));
			}
			function _update(userId,user){
				return $http.put(url+"/" +userId ,user)
							.then(utils.handleSuccess, utils.handleError('Error occurred while updating user.'));
			}
			function _updatePreference(userId,preference) {
	            return $http.put(url,preference)
	            			.then(utils.handleSuccess, utils.handleError('Error occurred while updaing user preferance.'));
	        }
			function _changeStatus(ids,status){
				return $http.delete(url +"/" + status )
							.then(utils.handleSuccess, utils.handleError('Somting went wrong please retry.'));
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
