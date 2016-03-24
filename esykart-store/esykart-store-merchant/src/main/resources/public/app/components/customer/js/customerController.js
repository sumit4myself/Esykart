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


		.controller('ManageCustomerTableController', function($compile, $scope, $timeout, DTOptionsBuilder, DTColumnDefBuilder) {
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
                   DTColumnDefBuilder.newColumnDef(1).withTitle('Email'),
                   DTColumnDefBuilder.newColumnDef(2).withTitle('Mobile No.'),
                   DTColumnDefBuilder.newColumnDef(3).withTitle('Address'),
                   DTColumnDefBuilder.newColumnDef(4).withTitle('created Date'),
                   DTColumnDefBuilder.newColumnDef(5).withTitle('Action').notSortable()
                   .renderWith(function(data){
                	   var html = '';
                	   	html += ' <a href="#"><i class="md-icon material-icons md-color-blue-500">&#xE88F;</i></a>';
            		   return html;
                  })
            ];
        });