angular.module('altairApp')
.controller(
		'AddRoleController',
		[ '$scope', '$rootScope', 'utils', 'RoleService',
		function($scope, $rootScope, utils, RoleService) {
			var $role_form = $("#role_form");
			var parsleyForm = $role_form.parsley();
			$scope.role = {};
			$scope.validateRoleDetails = function(context){
/*				var d = $q.defer()
			    $timeout(function(){
			        return d.resolve(true);
			    }, 2000);
			    return d.promise;*/
				
				var result  = parsleyForm.validate({group: 'block1', force: true})
				console.log("result = "+result);
				return result;
			}
			
			$scope.saveRole = function(){
				var result  = parsleyForm.validate({group: 'block2', force: true})
				
				var form_serialized = JSON.stringify( utils.serializeObject($role_form), null, 2 );
                UIkit.modal.alert('<p>Wizard data:</p><pre>' + form_serialized + '</pre>');
                console.log($scope.role );
                
				return true;
			}
		} ])
		.controller('permission_table', function($compile, $scope, $timeout, DTOptionsBuilder, DTColumnDefBuilder) {
            var vm = this;
            vm.dt_data = [];
            vm.dtOptions = DTOptionsBuilder
                .fromSource('data/dt_data.json')
                .withOption('initComplete', function() {
                    $timeout(function() {
                        $compile($('.dt-uikit .md-input'))($scope);
                    })
                })
	            .withOption('bProcessing',  true)
	            .withOption('bServerSide',  true)
	            .withOption( "aLengthMenu" , [ [ 5, 10, 25, 50, 100 ],[ 5, 10, 25, 50, 100 ] ])
	            .withDisplayLength(5)	           
	            
            vm.dtColumnDefs = [
                   DTColumnDefBuilder.newColumnDef(0).withTitle('Name').renderWith(function(data){
//                   	console.log(data);
                   	return "<a>" +data+ "</a>";
                   }),
                   DTColumnDefBuilder.newColumnDef(1).withTitle('Position'),
                   DTColumnDefBuilder.newColumnDef(2).withTitle('Office'),
                   DTColumnDefBuilder.newColumnDef(3).withTitle('Extn.'),
                   DTColumnDefBuilder.newColumnDef(4).withTitle('Start date'),
                   DTColumnDefBuilder.newColumnDef(5).withTitle('Salary')
            ];
})
        
.controller('ViewRoleController', [ '$scope', '$rootScope', '$stateParams', 'RoleService',
function($scope, $rootScope, $stateParams, RoleService) {

	
	
	
	
}])

.controller(
		'ManageRoleController',
		[ '$scope', '$rootScope', 'utils', 'RoleService',
		function($scope, $rootScope, utils, RoleService) {

			
			
			
			
		} ])