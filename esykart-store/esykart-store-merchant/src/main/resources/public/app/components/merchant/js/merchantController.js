angular.module('altairApp')
.controller(
		'AddMerchantController',
		[ '$scope', '$rootScope', 'utils', 'MerchantService',
		function($scope, $rootScope, utils, MerchantService) {
		    var $merchant_form = $("#merchant_form");
			var parsleyForm = $merchant_form.parsley();
			$scope.merchant = {};
			$scope.validateMerchantDetails = function(context){
				var result  = parsleyForm.validate({group: 'block1', force: true})
				console.log("result = "+result);
				return result;
			}
			
			$scope.saveMerchant = function(){
			   var form_serialized = JSON.stringify( utils.serializeObject($merchant_form), null, 2 );
               // UIkit.modal.alert('<p>Wizard data:</p><pre>' + form_serialized + '</pre>');
                //console.log($scope.merchant );
                MerchantService._save(form_serialized);
                return true;
			}
	} ])

     .controller(
		'ManageMerchantController',
		[ '$scope', '$rootScope', 'utils', 'MerchantService',
		function($scope, $rootScope, utils, MerchantService) {

			
			
			
			
		} ])