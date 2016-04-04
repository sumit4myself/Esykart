var product_media_row_template = '<tr><td><input type="file" class="dropify" data-height="150"/></td> ' +
                                 '<td><input type="text" config="image.config" options="image.options"  ng-model="product.fulfillmentType" selectize /></td> ' +
	                             '<td><a href="javascript:void(0)"  class="md-btn md-btn-danger md-btn-wave-light waves-effect waves-button waves-light remove-row"> <i class="material-icons md-color-white">&#xE15D;</i> Remove </a></td></tr>';
angular.module('altairApp')
.constant('productMediaRowTemplate',product_media_row_template)
.controller('AddProductController',
['$scope', '$rootScope', '$compile','$state','$stateParams','ProductService', 'CategoryService','InventoryService','FulfillmentService', 'productMediaRowTemplate',
function($scope, $rootScope, $compile,$state,$stateParams, ProductService,  CategoryService,   InventoryService,  FulfillmentService , productMediaRowTemplate) {
	$scope.product =  new Product();
		   
		
//		handling edit request
	if($stateParams.id != null){
		ProductService.find(id).then(function(response){
        	$scope.product.copyProperties(response);
        	$scope.oldProduct = $scope.product;
		});
	}
		
	//		event binding
	$scope.onSave = function() {
//			TODO validation
		var $role_form = $("#role_form");
		// var parsleyForm = $role_form.parsley();
		ProductService.save($scope.product.toJson()).then(function(response){
			UIkit.notify({
                message: 'Product saved successfully.',
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
			$scope.product = $scope.oldProduct
		}else{
			$scope.product =  new Product();
		}
	}
	
	$("#product_media_table").on("click",".add-row",function(){
		$("#product_media_table").append(productMediaRowTemplate);  
		initDropify($("#product_media_table").find("tr:last-child"));
		$compile($("#product_media_table").find("tr:last-child"))($scope);
	});
	
	$("#product_media_table").on("click",".remove-row",function(){
		$(this).closest("tr").remove();
	});
	
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

	$scope.tax = {
			options: [],
            config : {
                create: false,
                maxItems: 1,
                placeholder: 'Tax Code',
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
                placeholder: 'Inventory Type',
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
                placeholder: 'Fulfillment Type',
                valueField: 'value',
                labelField: 'name',
                searchField: 'name'
            }
    }
	
	$scope.image = {
			options:  [ {
				name : "Primary",
				value : "Primary",
			}, {
				name : "Alt1",
				value : "Alt1",
			}, {
				name : "Alt2",
				value : "Alt2",
			} ,{
				name : "Alt3",
				value : "Alt3",
			},{
				name : "Alt4",
				value : "Alt4",
			}],
            config : {
                create: false,
                maxItems: 1,
                placeholder: 'Image Key',
                valueField: 'value',
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
	
	
	
//			init
	initDropify();
	FulfillmentService.findAll().then(function (response) {
    	$scope.fulfillment_type.options = response;
    });
	InventoryService.findAll().then(function (response) {
    	$scope.inventory_type.options = response;
    });

	
	
//			helper functions

	function initDropify(container){
		if(container){
			$(container).find('.dropify').dropify({
				   messages: {
				        'default': 'Upload File',
				        'replace': 'Drag and drop or click to replace',
				        'remove':  'Remove',
				        'error':   'Ooops, something wrong appended.'
				    }
		   });
		}else{
			$('.dropify').dropify({
				   messages: {
				        'default': 'Upload File',
				        'replace': 'Drag and drop or click to replace',
				        'remove':  'Remove',
				        'error':   'Ooops, something wrong appended.'
				    }
		   });
		}
	}
}])
		
		
.controller('ViewProductController', 
[ '$scope', '$rootScope', '$stateParams', 'ProductService',
function($scope, $rootScope, $stateParams, ProductService) {
	$scope.product = new Product();
	if($stateParams.id != null){
		ProductService.find(id).then(function(response){
        	$scope.product.copyProperties(response);
		});
	}
	$scope.onCancel = function() {
		$state.go("restricted.product.manage");
	}
}])
		
		
.controller('ManageProductController',
[ '$scope', '$rootScope', 'utils', 'ProductService',
function($scope, $rootScope, utils, ProductService) {

	
	
	
	
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