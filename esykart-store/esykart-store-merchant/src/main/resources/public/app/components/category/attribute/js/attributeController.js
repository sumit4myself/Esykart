var attribute_value_template = '<tr>'+
									'<td><input type="text" class="md-input" md-input ng-model="attribute.categoryAttributeValues[index].label" /></td>'+
									'<td><input type="text" class="md-input" md-input ng-model="attribute.categoryAttributeValues[index].value" /></td>'+
									'<td><input type="text" config="displayOrder.config" options="displayOrder.options" ng-model="attribute.categoryAttributeValues[index].displayOrder" selectize /> </td>'+
									'<td><a href="javascript:void(0)" class="md-btn md-btn-danger md-btn-wave-light waves-effect waves-button waves-light remove-row"> <i class="material-icons md-color-white">&#xE15D;</i> Remove </a></td>'+
								'</tr>';
angular.module('altairApp')
.constant('attributeValueTemplate',attribute_value_template)
.controller('AddAttributeController',
		[ '$scope', '$rootScope','$compile', 'utils', 'AttributeService','attributeValueTemplate',
		function($scope, $rootScope,$compile,$state,$stateParams, utils, AttributeService,attributeValueTemplate) {
			$scope.attribute = new CategoryAttribute();
			
			
			/*var result  = parsleyForm.validate({group: 'block1', force: true})
			console.log("result = "+result);
			return result;*/
			
			
//			Event binding
			$("#attribute_value_table").on("click",".add-row",function(){
				var _$lastTr = $("#attribute_value_table").find("tbody > tr:last-child");
				var count = parseInt(_$lastTr.attr("id")) + 1;
				$("#attribute_value_table").append(attributeValueTemplate.replace(new RegExp("index", "g"),count));  
				var _$newTr = $("#attribute_value_table").find("tbody > tr:last-child");
					_$newTr.attr("id",count);
				$compile(_$newTr)($scope);
			});
			
			$("#attribute_value_table").on("click",".remove-row",function(){
				var _$targetTr = $(this).closest("tr");
				var index = parseInt(_$targetTr.attr("id"));
				_$targetTr.remove();
				$scope.attribute.categoryAttributeValues.splice(index, 1);
			});
			
			
//			event binding
			$scope.onSave = function() {
				console.log($scope.attribute.toJson());
				
//					TODO validation
				var $role_form = $("#role_form");
				AttributeService.save($scope.attribute.toJson()).then(function(response){
					UIkit.notify({
	                    message: 'Category attribute saved successfully.',
	                    status: 'success',
	                    pos: 'top-right',
	            	});
	        	});
			};
			
			$scope.onCancel = function() {
				$state.go("restricted.category_attribute.manage");
			};
			
			$scope.onReset = function() {
				if($stateParams.id != null){
					$scope.attribute = $scope.oldAttribute;
				}else{
					$scope.attribute = new CategoryAttribute();
				}
			};
			
			
//			helper functions 
			
			
			
//			UI Configuration 
			$scope.attributeType = {
					options: [{
						name : "Option",
						value : "OPTION",
					}, {
						name : "Attribute",
						value : "ATTRIBUTE",
					}],
	                config : {
		                create: false,
		                maxItems: 1,
		                placeholder: 'Attribute Type',
		                valueField: 'value',
		                labelField: 'name',
		                searchField: 'name'
		            }
            }
			
			$scope.attributeDisplayType = {
					options:  [ {
						name : "Select",
						value : "SELECT",
					}, {
						name : "Colour",
						value : "COLOUR",
					}, {
						name : "Size",
						value : "SIZE",
					} ,{
						name : "Tab",
						value : "TAB",
					}],
	                config : {
		                create: false,
		                maxItems: 1,
		                placeholder: 'Attribute Display Type',
		                valueField: 'value',
		                labelField: 'name',
		                searchField: 'name'
		            }
            }
			
			$scope.displayOrder = {
					options:  [ {
						name : "1",
						value : "1",
					}, {
						name : "2",
						value : "2",
					}, {
						name : "3",
						value : "3",
					} ,{
						name : "4",
						value : "4",
					},{
						name : "5",
						value : "5",
					}],
	                config : {
		                create: false,
		                maxItems: 1,
		                placeholder: 'Display Order',
		                valueField: 'value',
		                labelField: 'name',
		                searchField: 'name'
		            }
            }
			
			
			
			
		} ])
.controller(
		'ViewAttributeController',
		[ '$scope', '$rootScope', '$stateParams', 'AttributeService',
		function($scope, $rootScope, $stateParams, AttributeService) {

			
			
			
			
		} ])

.controller(
		'ManageAttributeController',
		[ '$scope', '$rootScope', 'utils', 'AttributeService',
		function($scope, $rootScope, utils, AttributeService) {
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
		                message: 'Category attribute activated successfully.',
		                status: 'success',
		                pos: 'top-right',
		        	});
		    	});
			};
			$scope.deactivate = function(id){
				UIkit.modal.confirm('Are you sure?', function(){ 
					CategoryService.changeStatus(id,"I").then(function(response){
						UIkit.notify({
		                    message: 'Category attribute deactivated successfully.',
		                    status: 'success',
		                    pos: 'top-right',
		            	});
		        	});
				});
			};
} ])
.controller('ManageCategoryAttributeTableController', function($compile, $scope, $timeout,utils, DTOptionsBuilder, DTColumnBuilder) {
    var vm = this;
    vm.dt_data = [];
    vm.dtOptions = DTOptionsBuilder
    .fromSource('products/categoryAttributes/search')
    .withCustomFnServerData(utils.preparefilterDataFromDatatableData,utils.prepareDatatableDataFromResponse,utils.prepareDatatableDataFromErrorResponse)
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
        DTColumnBuilder.newColumn("name").withTitle('Name'),
        DTColumnBuilder.newColumn("isRequired").withTitle('Required'),
        DTColumnBuilder.newColumn("isSearchable").withTitle('Searchable'),
        DTColumnBuilder.newColumn("attributeType").withTitle('Type').notSearchable(),
        DTColumnBuilder.newColumn("attributeDisplayType").withTitle('Display Type').notSearchable(),
        DTColumnBuilder.newColumn("categoryAttributeId").withTitle('Action').notSortable().notSearchable()
           .renderWith(function(data){
        	   return  '<user-permission data-permission-for="restricted.category.manage" data-id-value="1" data-id-field="id" data-permission-type="MANAGE"/>';
         })
    ];
});