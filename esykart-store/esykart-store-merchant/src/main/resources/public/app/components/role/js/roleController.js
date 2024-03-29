angular.module('altairApp').controller('AddRoleController',
['$scope', '$rootScope','$state','$stateParams','RoleService','AuthorizationService',
function($scope, $rootScope,$state,$stateParams, RoleService,AuthorizationService) {
//		UI Models 
		$scope.role = new Role();
		$scope.permissions = new Array();
		$scope.menus = AuthorizationService.getGrantedSections();
		
		//		handling edit request
		if($stateParams.id != null){
			RoleService.find(id).then(function(response){
            	$scope.role.copyProperties(response);
            	$scope.permissions = $scope.role.getPermissions();
            	$scope.oldRole = $scope.role;
			});
		}
			
		//		event binding
		$scope.onSave = function() {
//			TODO validation
			
			
			var $role_form = $("#role_form");
			// var parsleyForm = $role_form.parsley();

			
			$scope.role.setPermissions($scope.permissions);
			RoleService.save($scope.role.toJson()).then(function(response){
				UIkit.notify({
                    message: 'Role saved successfully.',
                    status: 'success',
                    pos: 'top-right',
            	});
        	});
		}
		
		$scope.onCancel = function() {
			$state.go("restricted.role.manage");
		}
		
		$scope.onReset = function() {
			if($stateParams.id != null){
				$scope.role = $scope.oldRole
				$scope.permissions = $scope.oldRole.getPermissions();
			}else{
				$scope.role = new Role();
				$scope.permissions = new Array();
			}
		}
} ])

.controller('ViewRoleController',
[ '$scope', '$rootScope', '$stateParams', 'RoleService',
function($scope, $rootScope, $stateParams, RoleService) {
	$scope.role = new Role();
//	handling edit request
	if($stateParams.id != null){
		RoleService.find(id).then(function(response){
            	$scope.role.copyProperties(response);
            	$scope.permissions = $scope.role.getPermissions();
		});
	}
	$scope.onCancel = function() {
		$state.go("restricted.role.manage");
	}
} ])

.controller('ManageRoleController', 
['$scope', '$rootScope', 'utils', 'RoleService',
function($scope, $rootScope, utils, RoleService) {
	$scope.delete = function (id){
		UIkit.modal.confirm('Are you sure?', function(){ 
			RoleService.changeStatus(id,"D").then(function(response){
				UIkit.notify({
                    message: 'Role deleted successfully.',
                    status: 'success',
                    pos: 'top-right',
            	});
        	});
		});
	};
	$scope.activate = function (id){
		RoleService.changeStatus(id,"A").then(function(response){
			UIkit.notify({
                message: 'Role activated successfully.',
                status: 'success',
                pos: 'top-right',
        	});
    	});
	};
	$scope.deactivate = function(id){
		UIkit.modal.confirm('Are you sure?', function(){ 
			RoleService.changeStatus(id,"I").then(function(response){
				UIkit.notify({
                    message: 'Role deactivated successfully.',
                    status: 'success',
                    pos: 'top-right',
            	});
        	});
		});
	};
} ])

.controller('ManageRoleTableController', function($compile, $scope, $timeout,RoleService,utils, DTOptionsBuilder, DTColumnBuilder) {
    var vm = this;
    vm.dt_data = [];
    vm.dtOptions = DTOptionsBuilder
    .newOptions()
    .withFnServerData(function (sSource, aaData, fnCallback, oSettings) {
    	var filter = utils.preparefilterDataFromDatatableData(aaData);
    	console.log(filter);
    	RoleService.search(filter,'search').then(function(response){
    		fnCallback(utils.prepareDatatableDataFromResponse(response));
    	},function(response){
    		fnCallback(utils.prepareDatatableDataFromResponse(null));
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
        DTColumnBuilder.newColumn("roleName").withTitle('Name'),
        DTColumnBuilder.newColumn("description").withTitle('Description'),
        DTColumnBuilder.newColumn("roleId").withTitle('Action').notSortable().notSearchable()
           .renderWith(function(data){
        	   return  '<user-permission data-permission-for="restricted.role.manage" data-id-value="1" data-id-field="id" data-permission-type="MANAGE"/>';
         })
    ];
});