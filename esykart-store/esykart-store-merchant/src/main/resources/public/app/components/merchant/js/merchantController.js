angular.module('altairApp')
.controller(
		'AddMerchantController',
		[ '$scope', '$rootScope', 'utils', 'MerchantService',
		function($scope, $rootScope, utils, MerchantService) {
			$scope.merchant = new Merchant();
			
			MerchantService.save($scope.merchant.toJson()).then(function(){
				if (!response.success) {
                	UIkit.notify({
                        message: response.message,
                        status: 'danger',
                        pos: 'top-right',
                	});
                } else {
                	
                }
			});
	} ])

 .controller(
		'ManageMerchantController',
		[ '$scope', '$rootScope', 'utils', 'MerchantService',
		function($scope, $rootScope, utils, MerchantService) {

			
			
			
			
		} ])
 .controller(
		'ViewMerchantController',
		[ '$scope', '$rootScope', '$stateParams', 'MerchantService',
		function($scope, $rootScope, $stateParams, MerchantService) {

			
			
			
			
		} ])
		
		
  .controller('ManageMerchantTableController', function($compile, $scope, $timeout, DTOptionsBuilder, DTColumnDefBuilder) {
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
                   DTColumnDefBuilder.newColumnDef(1).withTitle('Position'),
                   DTColumnDefBuilder.newColumnDef(2).withTitle('Office'),
                   DTColumnDefBuilder.newColumnDef(3).withTitle('Extn.'),
                   DTColumnDefBuilder.newColumnDef(4).withTitle('Start date'),
                   DTColumnDefBuilder.newColumnDef(5).withTitle('Action').notSortable()
                   .renderWith(function(data){
                	   var html = '';
                	   	html += '<a href="#"> <i class="md-icon material-icons md-color-blue-grey-500">&#xE254;</i></a>';
                	   	html += ' <a href="#"><i class="md-icon material-icons md-color-blue-500">&#xE88F;</i></a>';
                	   	html += ' <a href="#"><i class="md-icon material-icons md-color-red-500">&#xE872;</i></a>';
                		html += ' <a href="#"><i class="md-icon material-icons md-color-green-500">&#xE86C;</i></a>';
                	   	html += ' <a href="#"><i class="md-icon material-icons md-color-purple-500">&#xE14B;</i></a>';	
            		   return html;
                  })
            ];
        });