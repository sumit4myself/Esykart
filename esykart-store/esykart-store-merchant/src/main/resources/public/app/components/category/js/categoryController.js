angular.module('altairApp')
.controller(
		'AddCategoryController',
		[ '$scope', '$rootScope', 'utils', 'CategoryService',
		function($scope, $rootScope, utils, CategoryService) {
			$scope.category = new Category();
			
			
//			event binding
			$scope.onParentCategorySelect = function(){
				if($scope.category.parentCategory.id != null){
					
				}
			}
			
			
//			UI Configuration
			$scope.parent_category = {
					options: [ {
                        id: 1,
                        name: "Item A1",
                        value: "a1",
                    }],
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
					options: [ 
		           {
                        id: 1,
                        name: "Always Available",
                        value: "ALWAYS_AVAILABLE",
                    },
                    {
                        id: 2,
                        name: "Check Quantity",
                        value: "CHECK_QUANTITY",
                    },
                    {
                        id: 3,
                        name: "Unavailable",
                        value: "UNAVAILABLE",
                    },
                    
                    
                    ],
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
				options: [ 
		           {
                        id: 1,
                        name: "Digital",
                        value: "DIGITAL",
                    },
                    {
                        id: 2,
                        name: "Gift Card",
                        value: "GIFT_CARD",
                    },
                    {
                        id: 3,
                        name: "Physical Pickup",
                        value: "PHYSICAL_PICKUP",
                    },
                    {
                        id: 4,
                        name: "Physical Pickup or Ship",
                        value: "PHYSICAL_PICKUP_OR_SHIP",
                    },
                    {
                        id: 5,
                        name: "Physical Ship",
                        value: "PHYSICAL_SHIP",
                    }],
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
					options: [ {
                        id: 1,
                        name: "Item A1",
                        value: "a1",
                    }],
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
					options: [ {
                        id: 1,
                        name: "Item A1",
                        value: "a1",
                    }],
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
		} ])

.controller(
		'ManageCategoryController',
		[ '$scope', '$rootScope', 'utils', 'CategoryService',
		function($scope, $rootScope, utils, CategoryService) {

			
			
			
			
		} ])