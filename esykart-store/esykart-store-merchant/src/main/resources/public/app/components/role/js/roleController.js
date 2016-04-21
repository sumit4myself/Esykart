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

.controller('ManageRoleTableController',
function($compile, $scope, $timeout, DTOptionsBuilder, DTColumnBuilder) {
	var vm = this;
	vm.dtOptions = DTOptionsBuilder
		.fromSource('/roles/search')
		.withFnServerData(function (sSource, aaData, fnCallback, oSettings) {
			oSettings.jqXHR = $.ajax( {
                    'dataType': 'json',
                    'type': 'GET',
                    'url': sSource,
                    'data': aaData,
                    'success': function(json){ 
                        fnCallback(data);
                    },
                    'error' : function(jqXHR, textStatus, errorThrown) {
                    	  console.log(textStatus, errorThrown);
                    	  fnCallback(data);
                	}
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
	                DTColumnBuilder.newColumn("Name").withTitle('Role name'),
	                DTColumnBuilder.newColumn("EmailAddress").withTitle('Decription'),
	                DTColumnBuilder.newColumn("StudentId").withTitle('Action').notSortable()
	                   .renderWith(function(data){
	                	   return  '<user-permission data-permission-for="restricted.role.manage" data-id-value="1" data-id-field="id" data-permission-type="MANAGE"/>';
                     })
	            ];
})