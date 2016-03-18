angular.module('altairApp')
.controller('AddProductCatalogueController',
		['$scope', '$rootScope', 'utils', 'ProductCatalogueService', 'CategoryService','InventoryService','FulfillmentService',
		function($scope, $rootScope, utils, ProductCatalogueService,  CategoryService,   InventoryService,  FulfillmentService) {
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			validation 
			$scope.validateStep1 = function(){
				
			}
			$scope.validateStep2 = function(){
				
			}
			$scope.validateStep3 = function(){
				
			}
			
			
//			event bindings
			$scope.onCategoryChange = function(){
				
				
				
				
			}
			
			
			
//			UI Configuration 
			$scope.category = {
					options: [],
	                config : {
		                create: false,
		                maxItems: 1,
		                placeholder: 'Category',
		                valueField: 'id',
		                labelField: 'name',
		                searchField: 'name'
		            }
            }
			
			$scope.brand = {
					options: [],
	                config : {
		                create: false,
		                maxItems: 1,
		                placeholder: 'Brand',
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
		
			CategoryService.findAll().then(function (response) {
                if (!response.success) {
                	UIkit.notify({
                        message: response.message,
                        status: 'danger',
                        pos: 'top-right',
                	});
                } else {
                	$scope.category.options = response;
                }
            });
			
			FulfillmentService.findAll().then(function (response) {
            	$scope.fulfillment_type.options = response;
            });
			InventoryService.findAll().then(function (response) {
            	$scope.inventory_type.options = response;
            });
			
			$scope.tinymce_options = {
	                skin_url: 'assets/skins/tinymce/material_design',
	                plugins: [
	                    "advlist autolink lists link image charmap print preview anchor",
	                    "searchreplace visualblocks code fullscreen",
	                    "insertdatetime media table contextmenu paste"
	                ],
	                toolbar: "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image"
            }
			
			 // masked inputs
            var $maskedInput = $('.masked_input');
            if($maskedInput.length) {
                $maskedInput.inputmask();
            }
		
		
		} ])

.controller(
		'ManageProductCatalogueController',
		[ '$scope', '$rootScope', 'utils', 'ProductCatalogueService',
		function($scope, $rootScope, utils, ProductCatalogueService) {

			
			
			
			
		} ])
.controller('ManageProductController', function($compile, $scope, $timeout, DTOptionsBuilder, DTColumnDefBuilder) {
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
                   DTColumnDefBuilder.newColumnDef(0).withTitle('<input type="checkbox" ng-model="input_g_checkbox" icheck/>').notSortable()
                   .renderWith(function(data){
//                	   console.log($('[type="checkbox"]'));
//                	   $compile($('[type="checkbox"]'))($scope);
                      	return '<input type="checkbox" icheck ng-model="checkbox_demo_1" />';
                   }),
                   DTColumnDefBuilder.newColumnDef(0).withTitle('Name').renderWith(function(data){
                   	return "<a>" +data+ "</a>";

                   }),
                   DTColumnDefBuilder.newColumnDef(1).withTitle('Position'),
                   DTColumnDefBuilder.newColumnDef(2).withTitle('Office'),
                   DTColumnDefBuilder.newColumnDef(3).withTitle('Extn.'),
                   DTColumnDefBuilder.newColumnDef(4).withTitle('Start date'),
                   DTColumnDefBuilder.newColumnDef(5).withTitle('Action').notSortable()
                   .renderWith(function(data){
                	   var html = '';
                	   	html += '<a href="#"><i class="md-icon material-icons">&#xE254;</i></a>';
                	   	html += ' <a href="#"><i class="md-icon material-icons">&#xE88F;</i></a>'
            		   return html;
                  })
                   
                   
                   
                   
                   
                   
            ];
        });