angular.module('altairApp').controller('AddUserController',
['$scope','$rootScope','$state','$stateParams','$timeout','UserService',
function($scope, $rootScope,$state,$stateParams, $timeout, UserService) {
			$scope.user = new User();
			
			
//			handling edit request
			if($stateParams.id != null){
				UserService.find(id).then(function(response){
                	$scope.user.copyProperties(response);
                	$scope.oldUser = $scope.user;
				});
			}
				
			//		event binding
			$scope.onSave = function() {
			//TODO validation 
				
				
				UserService.save($scope.user.toJson()).then(function(response){
					UIkit.notify({
	                    message: 'User saved successfully.',
	                    status: 'success',
	                    pos: 'top-right',
	            	});
	        	});
			}
			$scope.onCancel = function() {
				$state.go("restricted.user.manage");
			}
			$scope.onReset = function() {
				if($stateParams.id != null){
					$scope.user = oldUser;
				}else{
					$scope.user = new User();
				}
			}
} ])

.controller('ViewUserController',
[ '$scope', '$rootScope','$state','$stateParams', 'UserService',
function($scope, $rootScope,$state,$stateParams, UserService) {
	$scope.user = new User();
	if($stateParams.id != null){
		UserService.find(id).then(function(response){
        	$scope.user.copyProperties(response);
		});
	}
	$scope.onCancel = function() {
		$state.go("restricted.user.manage");
	}
} ])

.controller('ManageUserController',
[ '$scope', '$rootScope', 'utils', 'UserService',
function($scope, $rootScope, utils, UserService) {
			$scope.delete = function (id){
				UIkit.modal.confirm('Are you sure?', function(){ 
					UserService.changeStatus(id,"D").then(function(response){
						UIkit.notify({
		                    message: 'User deleted successfully.',
		                    status: 'success',
		                    pos: 'top-right',
		            	});
		        	});
				});
			};
			$scope.activate = function (id){
				UserService.changeStatus(id,"A").then(function(response){
					UIkit.notify({
		                message: 'User activated successfully.',
		                status: 'success',
		                pos: 'top-right',
		        	});
		    	});
			};
			$scope.deactivate = function(id){
				UIkit.modal.confirm('Are you sure?', function(){ 
					UserService.changeStatus(id,"I").then(function(response){
						UIkit.notify({
		                    message: 'User deactivated successfully.',
		                    status: 'success',
		                    pos: 'top-right',
		            	});
		        	});
				});
			};
}])

.controller('AssignRoleTableController',
		function($compile, $scope, $timeout, DTOptionsBuilder,
				DTColumnDefBuilder) {
			var vm = this;
			vm.dt_data = [];
			vm.dtOptions = DTOptionsBuilder
				.fromSource('data/dt_data.json')
					.withOption('initComplete', function() {
						$timeout(function() {
							$compile($('.dt-uikit .md-input'))($scope);
						})
					})
					.withOption('bProcessing', false)
					.withOption('bServerSide', false)
					.withOption("aLengthMenu",[ [ 5, 10, 25, 50, 100 ], [ 5, 10, 25, 50, 100 ] ])
					.withOption('fnDrawCallback',  function( oSettings ) {
		            	 $timeout(function() {
	                        $compile($('pw-switch'))($scope);
	                    })
					})
					.withDisplayLength(5)
			vm.dtColumnDefs = [
					DTColumnDefBuilder.newColumnDef(0).withTitle('Name')
					.renderWith(function(data) {
								return "<a>" + data + "</a>";
					}),
					DTColumnDefBuilder.newColumnDef(1).withTitle('Position'),
					DTColumnDefBuilder.newColumnDef(2).withTitle('Office'),
					DTColumnDefBuilder.newColumnDef(3).withTitle('Extn.'),
					DTColumnDefBuilder.newColumnDef(4).withTitle('Start date'),
					DTColumnDefBuilder.newColumnDef(5).withTitle('Assign').notSortable()
                   .renderWith(function(data){
                	   var 	html = "<pw-switch ng-model='user.roles[1].roleId' " ;
                	   		html +=	"ng-true-value='{{data}}' ng-false-value='null' ";
            	   			html +=	"data-checked='Yes' data-unchecked='No' ></pw-switch>";
	                	   return html;
                   })
				];
		})


.controller('ManageUserTableController',
function($compile, $scope, $timeout, DTOptionsBuilder, DTColumnDefBuilder) {
	var vm = this;
	vm.dt_data = [];
	vm.dtOptions = DTOptionsBuilder.fromSource('data/dt_data.json')
			.withOption('initComplete', function() {
				$timeout(function() {
					$compile($('.dt-uikit .md-input'))($scope);
				})
			})
			.withOption('bProcessing', false) //TODO change it to True for server side data fetch.
			.withOption('bServerSide', false)
			.withOption("aLengthMenu",
					[ [ 5, 10, 25, 50, 100 ], [ 5, 10, 25, 50, 100 ] ])
			.withDisplayLength(5)
			.withOption('fnDrawCallback',  function( oSettings ) {
        	 $timeout(function() {
                $compile($('user-permission'))($scope);
            })
        })

	vm.dtColumnDefs = [
			DTColumnDefBuilder.newColumnDef(0).withTitle('Name'),
			DTColumnDefBuilder.newColumnDef(1).withTitle('Position'),
			DTColumnDefBuilder.newColumnDef(2).withTitle('Office'),
			DTColumnDefBuilder.newColumnDef(3).withTitle('Extn.'),
			DTColumnDefBuilder.newColumnDef(4).withTitle('Start date'),
			DTColumnDefBuilder.newColumnDef(5).withTitle('Action').notSortable()
               .renderWith(function(data){
            	   return  '<user-permission data-permission-for="restricted.user.manage" data-id-value="1" data-id-field="id" data-permission-type="MANAGE"/>';
              })];
})