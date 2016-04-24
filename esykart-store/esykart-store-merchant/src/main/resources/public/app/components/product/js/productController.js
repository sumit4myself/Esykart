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
	$scope.delete = function (id){
		UIkit.modal.confirm('Are you sure?', function(){ 
			ProductService.changeStatus(id,"D").then(function(response){
				UIkit.notify({
                    message: 'Category deleted successfully.',
                    status: 'success',
                    pos: 'top-right',
            	});
        	});
		});
	};
	$scope.activate = function (id){
		ProductService.changeStatus(id,"A").then(function(response){
			UIkit.notify({
                message: 'Category activated successfully.',
                status: 'success',
                pos: 'top-right',
        	});
    	});
	};
	$scope.deactivate = function(id){
		UIkit.modal.confirm('Are you sure?', function(){ 
			ProductService.changeStatus(id,"I").then(function(response){
				UIkit.notify({
                    message: 'Category deactivated successfully.',
                    status: 'success',
                    pos: 'top-right',
            	});
        	});
		});
	};
} ])
.controller('ManageProductTableController', function($compile, $scope, $timeout,ProductService,utils, DTOptionsBuilder, DTColumnBuilder) {
	    var vm = this;
	    vm.dt_data = [];
	    vm.dtOptions = DTOptionsBuilder
	    .newOptions()
	    .withFnServerData(function (sSource, aaData, fnCallback, oSettings) {
	    	var filter = utils.preparefilterDataFromDatatableData(aaData);
	    	ProductDetailService.search(filter,'search').then(function(response){
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
            	   return  '<user-permission data-permission-for="restricted.product.manage" data-id-value="1" data-id-field="id" data-permission-type="MANAGE"/>';
             })
        ];
});