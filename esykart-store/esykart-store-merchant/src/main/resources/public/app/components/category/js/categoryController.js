angular.module('altairApp')
.controller(
		'AddCategoryController',
		[ '$scope', '$rootScope','$stateParams', 'utils', 'CategoryService','BannerService','InventoryService','FulfillmentService',
		function($scope, $rootScope,$stateParams, utils, CategoryService,BannerService,InventoryService,FulfillmentService) {
			$scope.category = new Category();
			console.log($stateParams);
			
			CategoryService.save($scope.category.toJson()).then(function(){
				if (!response.success) {
                	UIkit.notify({
                        message: response.message,
                        status: 'danger',
                        pos: 'top-right',
                	});
                } else {
                	
                }
			});
			
			
//			event binding
			
			$scope.onSave = function (){
				
				console.log(this);
				
			};
			
			$scope.onReset = function (){
				console.log(this);
				
			};
			
			$scope.onCancel = function (){
				console.log(this);
				
			};
			
			
			$scope.onParentCategorySelect = function(){
				if($scope.category.parentCategory.id != null){
					
				}
			}
			
			
//			UI Configuration
			$scope.parent_category = {
				options: [],
				config : {
		                create: false,
		                maxItems: 1,
		                placeholder: 'Parent Category',
		                valueField: 'id',
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
	                valueField: 'id',
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
	                valueField: 'id',
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
			
			BannerService.findAll().then(function(response){
				 if (!response.success) {
	                	UIkit.notify({
	                        message: response.message,
	                        status: 'danger',
	                        pos: 'top-right',
	                	});
	                } else {
	                	$scope.parent_category.options = response;
	                }
			});
			
			CategoryService.findAll().then(function (response) {
                if (!response.success) {
                	UIkit.notify({
                        message: response.message,
                        status: 'danger',
                        pos: 'top-right',
                	});
                } else {
                	$scope.parent_category.options = response;
                }
            });
			
			FulfillmentService.findAll().then(function (response) {
            	$scope.fulfillment_type.options = response;
            });
			InventoryService.findAll().then(function (response) {
            	$scope.inventory_type.options = response;
            });
			
		} ])

.controller(
		'ManageCategoryController',
		[ '$scope', '$rootScope', 'utils', 'CategoryService',
		function($scope, $rootScope, utils, CategoryService) {
			
			$scope.delete = function (id){
				console.log(this);
				console.log(id);
			};
			
			$scope.activate = function (id){
				console.log(this);
				console.log(id);
			};
			
			
			$scope.deactivate = function(id){
				console.log(this);
				console.log(id);
			};
		} ])
		
.controller('ManageCategoryTableController', function($compile, $scope, $timeout, DTOptionsBuilder, DTColumnDefBuilder) {
            var vm = this;
            vm.dt_data = [];
            vm.dtOptions = DTOptionsBuilder
                .fromSource('data/dt_data.json')
                .withOption('initComplete', function() {
                    $timeout(function() {
                        $compile($('.dt-uikit .md-input'))($scope);
                    })
                })
	            .withOption('bProcessing',  false)
	            .withOption('bServerSide',  false)
	            .withOption( "aLengthMenu" , [ [ 5, 10, 25, 50, 100 ],[ 5, 10, 25, 50, 100 ] ])
	            .withOption('fnDrawCallback',  function( oSettings ) {
	            	 $timeout(function() {
	                        $compile($('user-permission'))($scope);
                    })
	            })
	            .withDisplayLength(5)	           
	            
            vm.dtColumnDefs = [
                   DTColumnDefBuilder.newColumnDef(0).withTitle('Name'),
                   DTColumnDefBuilder.newColumnDef(1).withTitle('Position'),
                   DTColumnDefBuilder.newColumnDef(2).withTitle('Office'),
                   DTColumnDefBuilder.newColumnDef(3).withTitle('Extn.'),
                   DTColumnDefBuilder.newColumnDef(4).withTitle('Start date'),
                   DTColumnDefBuilder.newColumnDef(5).withTitle('Action').notSortable()
                   .renderWith(function(data){
                	   return  '<user-permission data-permission-for="restricted.category.manage" data-id-value="1" data-id-field="id" data-permission-type="MANAGE"/>';
                  })
            ];
        });