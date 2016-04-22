angular.module('altairApp')
.controller(
		'AddCustomerController',
		[ '$scope', '$rootScope', 'utils', 'CustomerService',
		function($scope, $rootScope, utils, CustomerService) {

			
			
			
			
		} ])
		
		.controller(
		'ManageCustomerController',
		[ '$scope', '$rootScope', 'utils', 'CustomerService',
		function($scope, $rootScope, utils, CustomerService) {

			
			
			
			
} ])


.controller('ManageCustomerTableController', function($compile, $scope, $timeout,utils, DTOptionsBuilder, DTColumnBuilder) {
    var vm = this;
    vm.dt_data = [];
    vm.dtOptions = DTOptionsBuilder
    .fromSource('customers/search')
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