angular.module('altairApp')
.controller(
		'AddUserController',
		[ '$scope', '$rootScope', '$timeout', 'utils', 'UserService',
		function($scope, $rootScope,$timeout, utils, UserService) {
			var $user_form = $("#user_form");
			var parsleyForm = $user_form.parsley();
			$scope.user = {};
			$scope.validateUserDetails = function(context){
/*				var d = $q.defer()
			    $timeout(function(){
			        return d.resolve(true);
			    }, 2000);
			    return d.promise;*/
				
				
				
				
				var result  = parsleyForm.validate({group: 'block1', force: true})
				console.log("result = "+result);
				return result;
			}
			
			$scope.saveUser = function(){
				var form_serialized = JSON.stringify( utils.serializeObject($user_form), null, 2 );
                UIkit.modal.alert('<p>Wizard data:</p><pre>' + form_serialized + '</pre>');
                console.log($scope.user );
                
				return true;
			}
		}])
		
		
.controller(
		'ManageUserController',
		[ '$scope', '$rootScope', 'utils', 'UserService',
		function($scope, $rootScope, utils, UserService) {

			
			
			
			
		} ])
		
		.controller('role_table', function($compile, $scope, $timeout, DTOptionsBuilder, DTColumnDefBuilder) {
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
                   DTColumnDefBuilder.newColumnDef(0).withTitle('Name').renderWith(function(data){
//                   	console.log(data);
                   	return "<a>" +data+ "</a>";
                   }),
                   DTColumnDefBuilder.newColumnDef(1).withTitle('Position'),
                   DTColumnDefBuilder.newColumnDef(2).withTitle('Office'),
                   DTColumnDefBuilder.newColumnDef(3).withTitle('Extn.'),
                   DTColumnDefBuilder.newColumnDef(4).withTitle('Start date'),
                   DTColumnDefBuilder.newColumnDef(5).withTitle('Salary')
            ];
        });