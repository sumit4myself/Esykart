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
			
			
			$scope.roles = {
					options: [],
	                config : {
	                	 plugins: {
	                         'remove_button': {
	                             label     : ''
	                         }
	                     },
		                create: false,
		                maxItems: 5,
		                placeholder: 'Assign Roles',
		                valueField: 'roleId',
		                labelField: 'roleName',
		                searchField: 'roleName'
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
.controller('ManageUserTableController', function($compile, $scope, $timeout,UserService,utils, DTOptionsBuilder, DTColumnBuilder) {
    var vm = this;
    vm.dt_data = [];
    vm.dtOptions = DTOptionsBuilder
    .newOptions()
    .withFnServerData(function (sSource, aaData, fnCallback, oSettings) {
    	var filter = utils.preparefilterDataFromDatatableData(aaData);
    	UserService.search(filter,'search').then(function(response){
    		fnCallback(utils.prepareDatatableDataFromResponse(response));
    	},function(response){
    		fnCallback(utils.prepareDatatableDataFromResponse(response));
    	});
    })
    .withOption('processing', true)
    .withOption('serverSide', true)
    .withOption('initComplete', function() {
		$timeout(function() {
			$compile($('.dt-uikit .md-input'))($scope);
		})
	})
	.withOption('fnDrawCallback',  function( oSettings ) {
    	 $timeout(function() {
                $compile($('user-permission'))($scope);
        })
	})
	.withOption("aLengthMenu", [ [ 5, 10, 25, 50, 100 ], [ 5, 10, 25, 50, 100 ] ])
    .withPaginationType('full_numbers')
    .withDisplayLength(5);	
    vm.dtColumns = [
        DTColumnBuilder.newColumn("userName").withTitle('User Name'),
        DTColumnBuilder.newColumn("name").withTitle('Name'),
        DTColumnBuilder.newColumn("mobile").withTitle('Mobile'),
        DTColumnBuilder.newColumn("email").withTitle('Email'),
        DTColumnBuilder.newColumn("userId").withTitle('Action').notSortable().notSearchable()
           .renderWith(function(data){
        	   return  '<user-permission data-permission-for="restricted.user.manage" data-id-value="1" data-id-field="id" data-permission-type="MANAGE"/>';
         })
    ];
});