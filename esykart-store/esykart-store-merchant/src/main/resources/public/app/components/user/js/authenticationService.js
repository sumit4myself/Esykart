angular.module('altairApp').constant('url', 'rest/user/')
.service('AuthenticationService',
		['$http','$sessionStorage','utils','url',
		function($http,$sessionStorage, utils, url) {
			
//			mapping private function to public 
			var service = {};
	        service.authenticate = _authenticate;
	        return service;
			
//			private functions
	        function _authenticate(authenticationModel) {
	            return $http.post(url +"/authenticate",authenticationModel)
	            .then(utils.handleSuccess, utils.handleError('Error occurred while authenticating user.'));
	        }
		} 
]);