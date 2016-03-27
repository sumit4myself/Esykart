var product_media_row_template = '<tr><td><input type="file" class="dropify" data-height="150"/></td> ' +
                                 '<td><input type="text" config="image.config" options="image.options"  ng-model="product.fulfillmentType" selectize /></td> ' +
	                             '<td><a href="javascript:void(0)"  class="md-btn md-btn-danger md-btn-wave-light waves-effect waves-button waves-light remove-row"> <i class="material-icons md-color-white">&#xE15D;</i> Remove </a></td></tr>';

angular.module('altairApp')
.constant('productMediaRowTemplate',product_media_row_template)
.controller('AddProductDetailController',
		['$scope', '$rootScope', '$compile' , 'utils', 'ProductDetailService', 'ProductService', 'productMediaRowTemplate',
		function($scope, $rootScope,$compile, utils, ProductDetailService,  ProductService , productMediaRowTemplate) {
			$scope.productDetail = new ProductDetail();
			
			
			
			
			
			
			
			

			
			
//			event bindings
			$scope.onCategoryChange = function(){
				
				
				
				
			}
			
			$("#product_media_table").on("click",".add-row",function(){
				$("#product_media_table").append(productMediaRowTemplate);  
				initDropify($("#product_media_table").find("tr:last-child"));
				$compile($("#product_media_table").find("tr:last-child"))($scope);
			});
			
			$("#product_media_table").on("click",".remove-row",function(){
				$(this).closest("tr").remove();
			});
			
			$scope.onSave = function (){
				console.log($scope.productDetail);
				console.log(this);
				
			};
			
			$scope.onReset = function (){
				console.log(this);
				
			};
			
			$scope.onCancel = function (){
				console.log(this);
				
			};
			
			
			
//			UI Configuration 
			$scope.product = {
					options: [],
	                config : {
		                create: false,
		                maxItems: 1,
		                placeholder: 'Product',
		                valueField: 'id',
		                labelField: 'name',
		                searchField: 'name'
		            }
            }
			
			
			$scope.dimensionUnits = {
								options : [ {
									value : "CENTIMETERS",
									name : "Centimeters"
								}, {
									value : "FEET",
									name : "Feet"
								}, {
									value : "INCHES",
									name : "Inches"
								}, {
									value : "METERS",
									name : "Meters"
								} ],
	                config : {
		                create: false,
		                maxItems: 1,
		                placeholder: 'Dimension Units',
		                valueField: 'value',
		                labelField: 'name',
		                searchField: 'name'
		            }
            }
			
			$scope.weightUnits = {
					options : [ {
						value : "KILOGRAMS",
						name : "Kilograms"
					}, {
						value : "Pounds",
						name : "Pounds"
					}],
					
	                config : {
		                create: false,
		                maxItems: 1,
		                placeholder: 'Weight Units',
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
			
			
		
			
			$scope.tinymce_options = {
	                skin_url: 'assets/skins/tinymce/material_design',
	                plugins: [
	                    "advlist autolink lists link image charmap print preview anchor",
	                    "searchreplace visualblocks code fullscreen",
	                    "insertdatetime media table contextmenu paste"
	                ],
	                toolbar: "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image"
            }
			
			
			initDropify();
			 // masked inputs
            var $maskedInput = $('.masked_input');
            if($maskedInput.length) {
                $maskedInput.inputmask();
            }
            
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
		
		
} ])
		
		

.controller(
		'ViewProductDetailController',
		[ '$scope', '$rootScope', '$stateParams', 'ProductDetailService',
		function($scope, $rootScope, $stateParams, ProductDetailService) {

			
			
			
			
} ])
		

.controller(
		'ManageProductDetailController',
		[ '$scope', '$rootScope', 'utils', 'ProductDetailService',
		function($scope, $rootScope, utils, ProductDetailService) {

			
			
			
			
		} ])
.controller('ManageProductController', function($compile, $scope, $timeout, DTOptionsBuilder, DTColumnDefBuilder) {
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
                   DTColumnDefBuilder.newColumnDef(0).withTitle('<input type="checkbox" ng-model="input_g_checkbox" icheck/>').notSortable()
                   .renderWith(function(data){
//                	   console.log($('[type="checkbox"]'));
//                	   $compile($('[type="checkbox"]'))($scope);
                      	return '<input type="checkbox" icheck ng-model="checkbox_demo_1" />';
                   }),
                   DTColumnDefBuilder.newColumnDef(0).withTitle('Name').renderWith(function(data){
                   	return "<a>" +data+ "</a>";

                   }),
                   DTColumnDefBuilder.newColumnDef(1).withTitle('Position'),
                   DTColumnDefBuilder.newColumnDef(2).withTitle('Office'),
                   DTColumnDefBuilder.newColumnDef(3).withTitle('Extn.'),
                   DTColumnDefBuilder.newColumnDef(4).withTitle('Start date'),
                   DTColumnDefBuilder.newColumnDef(5).withTitle('Action').notSortable()
                   .renderWith(function(data){
                	   var html = '';
                	   	html += '<a href="#"><i class="md-icon material-icons">&#xE254;</i></a>';
                	   	html += ' <a href="#"><i class="md-icon material-icons">&#xE88F;</i></a>'
            		   return html;
                  })
                   
                   
                   
                   
                   
                   
            ];
        });