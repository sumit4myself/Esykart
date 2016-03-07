angular
    .module('altairApp')
    .controller('validationCtrl', [
        '$scope',
        '$rootScope',
        function ($scope,$rootScope) {

            var $formValidate = $('#form_validation');

            $scope.validate = function(){
            	alert("validate");
            	$formValidate
                .parsley().validate();
            }
            
            
            $scope.selectize_val_options = [
                { value: 'press', label: 'Press' },
                { value: 'net', label: 'Internet' },
                { value: 'mouth', label: 'Word of mouth' },
                { value: 'other', label: 'Other...' }
            ];

            $scope.selectize_val_config = {
                maxItems: 1,
                valueField: 'value',
                labelField: 'label',
                create: false,
                placeholder: 'Choose...'
            };

        }
    ]);