angular.module('altairApp')
.controller('ErrorController',[ '$scope', '$state','AuthorizationService',
function($scope, $state,AuthorizationService) {
	
	$scope.goToHome = function(){
		console.log("Error = > " + AuthorizationService.getDefaultPage());

		$state.go(AuthorizationService.getDefaultPage());
	}
} ])

