angular
    .module('altairApp')
    .controller('loginCtrl', [
        '$scope',
        '$rootScope',
        'utils',
        'UserService',
        'AuthenticationService',
        function ($scope,$rootScope,utils,UserService,AuthenticationService) {
        	$scope.authenticationModel =  {
        			userName : '',
        			password : '',
        			staySigned : false
            }
        	
        	var $loginCard = $('#login_card'),
                $loginSection = $('#login_section'),
                $resetPasswordSection = $('#reset_password_section'),
                $loginForm = $('#login_form');

        	var $loginFormParsley = $loginForm.parsley()
            .on('form:validated',function() {
                $scope.$apply();
            })
            .on('field:validated',function(parsleyField) {
                if($(parsleyField.$element).hasClass('md-input')) {
                    $scope.$apply();
                }
            });
            
            
            $scope.backToLogin = function($event) {
                $event.preventDefault();
                utils.card_show_hide($loginCard,undefined,function(){
                	$loginSection.show().siblings().hide();
                },undefined);
            };

            $scope.passwordReset = function($event) {
                $event.preventDefault();
                utils.card_show_hide($loginCard,undefined,function(){
                	$resetPasswordSection.show().siblings().hide();
                },undefined);
            };
           
            $scope.login = function($event) {
            	console.log($loginFormParsley);
                $event.preventDefault();
                UserService.authenticate($scope.authenticationModel).then(function (response) {
                    if (response.success) {
                        $location.path('/login');
                    } else {
                    	UIkit.notify({
                            message: response.message,
                            status: 'danger',
                            pos: 'top-right',
                    	});
                    }
                });
            
            
            };
            
            $scope.resetPassword = function($event) {
                $event.preventDefault();
            };
        }
    ]);