angular.module('altairApp')
.controller('AddCategoryController',
[ '$scope', '$rootScope','$state','$stateParams', 'utils', 'CategoryService','BannerService','InventoryService','FulfillmentService',
function($scope, $rootScope,$state,$stateParams, utils, CategoryService,BannerService,InventoryService,FulfillmentService) {
		$scope.category = new Category();
		//		handling edit request
		if($stateParams.id != null){
			CategoryService.find(id).then(function(response){
            	$scope.category.copyProperties(response);
            	$scope.oldCategory = $scope.category;
			});
		}

		
		
		//		event binding
		$scope.onSave = function() {
			console.log($scope.category.toJson());
			
//				TODO validation
			var $role_form = $("#role_form");
			CategoryService.save($scope.category.toJson()).then(function(response){
				UIkit.notify({
                    message: 'Category saved successfully.',
                    status: 'success',
                    pos: 'top-right',
            	});
        	});
		}
		
		$scope.onCancel = function() {
			$state.go("restricted.category.manage");
		}
		$scope.onReset = function() {
			if($stateParams.id != null){
				$scope.category = $scope.oldCategory;
			}else{
				$scope.category = new Category();
			}
		}

		//			UI Configuration
		$scope.parent_category = {
			options: [],
			config : {
	                create: false,
	                maxItems: 1,
	                placeholder: 'Parent Category',
	                valueField: 'categoryId',
	                labelField: 'name',
	                searchField: 'name'
	            }
        }
		
		$scope.inventory_type = {
			options: [],
            config : {
                create: false,
                maxItems: 1,
                placeholder: 'Select Inventory Type',
                valueField: 'value',
                labelField: 'name',
                searchField: 'name'
            }
        }
		
		$scope.fulfillment_type = {
			options: [],
		    config : {
                create: false,
                maxItems: 1,
                placeholder: 'Select Fulfillment Type',
                valueField: 'value',
                labelField: 'name',
                searchField: 'name'
            }
        }
		
		$scope.attribute = {
				options: [],
                config : {
                	 plugins: {
                         'remove_button': {
                             label     : ''
                         }
                     },
	                create: false,
	                maxItems: null,
	                placeholder: 'Select Attribute',
	                valueField: 'id',
	                labelField: 'name',
	                searchField: 'name'
	            }
        }
		
		$scope.banner = {
				options: [],
                config : {
                	 plugins: {
                         'remove_button': {
                             label     : ''
                         }
                     },
	                create: false,
	                maxItems: 1,
	                placeholder: 'Select Banner',
	                valueField: 'id',
	                labelField: 'name',
	                searchField: 'name'
	            }
        }
		
		$scope.tinymce_options = {
                skin_url: 'assets/skins/tinymce/material_design',
                plugins: [
                    "advlist autolink lists link image charmap print preview anchor",
                    "searchreplace visualblocks code fullscreen",
                    "insertdatetime media table contextmenu paste"
                ],
                toolbar: "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image"
        }
		
		BannerService.findAll(0,100,null,'NameAndId').then(function(response){
        	$scope.banner.options = response._embedded.banners;
		});
		
		CategoryService.findAll(0,100,null,'NameAndId').then(function (response) {
        	$scope.parent_category.options = response.data._embedded.categoryModels;
        });
		
		FulfillmentService.findAll().then(function (response) {
        	$scope.fulfillment_type.options = response;
        });
		InventoryService.findAll().then(function (response) {
        	$scope.inventory_type.options = response;
        });
			
} ])
		
		
.controller('ViewCategoryController',
[ '$scope', '$rootScope','$state','$stateParams', 'CategoryService',
function($scope, $rootScope,$state,$stateParams, CategoryService) {
	$scope.category = new Category();
	if($stateParams.id != null){
		CategoryService.find(id).then(function(response){
        	$scope.category.copyProperties(response);
		});
	}			
	$scope.onCancel = function (){
		$state.go("restricted.category.manage");
	};
} ])

.controller('ManageCategoryController',
[ '$scope', '$rootScope', 'CategoryService',
function($scope, $rootScope, CategoryService) {
	$scope.delete = function (id){
		UIkit.modal.confirm('Are you sure?', function(){ 
			CategoryService.changeStatus(id,"D").then(function(response){
				UIkit.notify({
                    message: 'Category deleted successfully.',
                    status: 'success',
                    pos: 'top-right',
            	});
        	});
		});
	};
	$scope.activate = function (id){
		CategoryService.changeStatus(id,"A").then(function(response){
			UIkit.notify({
                message: 'Category activated successfully.',
                status: 'success',
                pos: 'top-right',
        	});
    	});
	};
	$scope.deactivate = function(id){
		UIkit.modal.confirm('Are you sure?', function(){ 
			CategoryService.changeStatus(id,"I").then(function(response){
				UIkit.notify({
                    message: 'Category deactivated successfully.',
                    status: 'success',
                    pos: 'top-right',
            	});
        	});
		});
	};
} ])
		
.controller('ManageCategoryTableController', function($compile, $scope, $timeout,CategoryService,utils, DTOptionsBuilder, DTColumnBuilder) {
	    var vm = this;
	    vm.dt_data = [];
	    vm.dtOptions = DTOptionsBuilder
	    .newOptions()
	    .withFnServerData(function (sSource, aaData, fnCallback, oSettings) {
	    	var filter = utils.preparefilterDataFromDatatableData(aaData);
	    	CategoryService.search(filter,'search').then(function(response){
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
            DTColumnBuilder.newColumn("name").withTitle('Name').withOption("order",[[ 0, "desc" ]]),
            DTColumnBuilder.newColumn("fulfillmentType").withTitle('Fulfillment Type'),
            DTColumnBuilder.newColumn("inventoryType").withTitle('Inventory Type'),
            DTColumnBuilder.newColumn("categoryId").withTitle('Action').notSortable().notSearchable()
               .renderWith(function(data){
            	   return  '<user-permission data-permission-for="restricted.category.manage" data-id-value="'+data+'" data-id-field="id" data-permission-type="MANAGE"/>';
             })
        ];
});