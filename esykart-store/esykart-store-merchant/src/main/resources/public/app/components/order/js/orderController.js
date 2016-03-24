angular.module('altairApp')
.controller(
		'AddOrderController',
		[ '$scope', '$rootScope', 'utils', 'OrderService',
		function($scope, $rootScope, utils, OrderService) {

			
			
			
			
		} ])

.controller(
		'ManageOrderController',
		[ '$scope', '$rootScope', 'utils', 'OrderService',
		function($scope, $rootScope, utils, OrderService) {

			
			
			
			
		} ])
		
		.controller('ManageOrderTableController', function($compile, $scope, $timeout, DTOptionsBuilder, DTColumnDefBuilder) {
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
//	                        $compile($('.md-input'))($scope);
                    })
	            })
	            .withDisplayLength(5)	           
	            
            vm.dtColumnDefs = [
                  
                   DTColumnDefBuilder.newColumnDef(0).withTitle('Name'),
                   DTColumnDefBuilder.newColumnDef(1).withTitle('OrderNumber'),
                   DTColumnDefBuilder.newColumnDef(2).withTitle('Status'),
                   DTColumnDefBuilder.newColumnDef(3).withTitle('Total'),
                   DTColumnDefBuilder.newColumnDef(4).withTitle('Tax'),
                   DTColumnDefBuilder.newColumnDef(4).withTitle('Customer Name'),
                   DTColumnDefBuilder.newColumnDef(5).withTitle('Action').notSortable()
                   .renderWith(function(data){
                	   var html = '';
                	   	html += ' <a href="#"><i class="md-icon material-icons md-color-blue-500">&#xE88F;</i></a>';
            		   return html;
                  })
            ];
        });