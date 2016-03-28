/*
 *  Altair Admin angularjs
 *  controller
 */

angular
    .module('altairApp')
    .controller('mainCtrl', [
        '$scope',
        '$rootScope',
        '$http',
        function ($scope,$rootScope,$http) {
    	  $http.get('/details').success(function(response) {
              $rootScope.userDetail = response;
          });
        }
    ])
    .controller('main_headerCtrl', [
        '$timeout',
        '$rootScope',
        '$scope',
        '$window',
        function ($timeout,$rootScope,$scope,$window) {
            $scope.user_data = {
                name: "Lue Feest",
                avatar: "assets/img/avatars/avatar_11_tn.png",
                alerts: [
                    {
                        "title": "Hic expedita eaque.",
                        "content": "Nemo nemo voluptatem officia voluptatum minus.",
                        "type": "warning"
                    },
                    {
                        "title": "Voluptatibus sed eveniet.",
                        "content": "Tempora magnam aut ea.",
                        "type": "success"
                    },
                    {
                        "title": "Perferendis voluptatem explicabo.",
                        "content": "Enim et voluptatem maiores ab fugiat commodi aut repellendus.",
                        "type": "danger"
                    },
                    {
                        "title": "Quod minima ipsa.",
                        "content": "Vel dignissimos neque enim ad praesentium optio.",
                        "type": "primary"
                    }
                ],
                messages: [
                    {
                        "title": "Reiciendis aut rerum.",
                        "content": "In adipisci amet nostrum natus recusandae animi fugit consequatur.",
                        "sender": "Korbin Doyle",
                        "color": "cyan"
                    },
                    {
                        "title": "Tenetur commodi animi.",
                        "content": "Voluptate aut quis rerum laborum expedita qui eaque doloremque a corporis.",
                        "sender": "Alia Walter",
                        "color": "indigo",
                        "avatar": "assets/img/avatars/avatar_07_tn.png"
                    },
                    {
                        "title": "At quia quis.",
                        "content": "Fugiat rerum aperiam et deleniti fugiat corporis incidunt aut enim et distinctio.",
                        "sender": "William Block",
                        "color": "light-green"
                    },
                    {
                        "title": "Incidunt sunt.",
                        "content": "Accusamus necessitatibus officia porro nisi consectetur dolorem.",
                        "sender": "Delilah Littel",
                        "color": "blue",
                        "avatar": "assets/img/avatars/avatar_02_tn.png"
                    },
                    {
                        "title": "Porro ut.",
                        "content": "Est vitae magni eum expedita odit quisquam natus vel maiores.",
                        "sender": "Amira Hagenes",
                        "color": "amber",
                        "avatar": "assets/img/avatars/avatar_09_tn.png"
                    }
                ]
            };

            $scope.alerts_length = $scope.user_data.alerts.length;
            $scope.messages_length = $scope.user_data.messages.length;


            $('#menu_top').children('[data-uk-dropdown]').on('show.uk.dropdown', function(){
                $timeout(function() {
                    $($window).resize();
                },280)
            });


        }
    ])
    .controller('main_sidebarCtrl', [
        '$timeout',
        '$scope',
        '$rootScope',
        function ($timeout,$scope,$rootScope) {
        	$scope.sections = [];
        	$rootScope.$watch('userDetail',function(value,old) {
        		  var menus  = $rootScope.userDetail.menus;
        		  menus.sort(function(a, b){
                      return a.sortIndex - b.sortIndex;
                  });
                  $scope.sections = menus;
    		}, false);

            $scope.$on('onLastRepeat', function (scope, element, attrs) {
                $timeout(function() {
                    if(!$rootScope.miniSidebarActive) {
                        // activate current section
                        $('#sidebar_main').find('.current_section > a').trigger('click');
                    } else {
                        // add tooltips to mini sidebar
                        var tooltip_elem = $('#sidebar_main').find('.menu_tooltip');
                        tooltip_elem.each(function() {
                            var $this = $(this);

                            $this.attr('title',$this.find('.menu_title').text());
                            UIkit.tooltip($this, {});
                        });
                    }
                })
            });

            // language switcher
            $scope.langSwitcherModel = 'gb';
            var langData = $scope.langSwitcherOptions = [
                {id: 1, title: 'English', value: 'gb'},
                {id: 2, title: 'French', value: 'fr'},
                {id: 3, title: 'Chinese', value: 'cn'},
                {id: 4, title: 'Dutch', value: 'nl'},
                {id: 5, title: 'Italian', value: 'it'},
                {id: 6, title: 'Spanish', value: 'es'},
                {id: 7, title: 'German', value: 'de'},
                {id: 8, title: 'Polish', value: 'pl'}
            ];
            $scope.langSwitcherConfig = {
                maxItems: 1,
                render: {
                    option: function(langData, escape) {
                        return  '<div class="option">' +
                            '<i class="item-icon flag-' + escape(langData.value).toUpperCase() + '"></i>' +
                            '<span>' + escape(langData.title) + '</span>' +
                            '</div>';
                    },
                    item: function(langData, escape) {
                        return '<div class="item"><i class="item-icon flag-' + escape(langData.value).toUpperCase() + '"></i></div>';
                    }
                },
                valueField: 'value',
                labelField: 'title',
                searchField: 'title',
                create: false,
                onInitialize: function(selectize) {
                    $('#lang_switcher').next().children('.selectize-input').find('input').attr('readonly',true);
                }
            };
        }
    ]);





/*

// menu entries
$scope.sections = [
                   {
                       id: 0,
                       title: 'Dashboard',
                       icon: '&#xE871;',
                       link: 'restricted.dashboard'
                   },
   				   {
                       id: 1,
                       title: 'Catalogue',
                       icon:  '&#xE919;',
                       submenu: [{
                                     title: 'Category Attribute',
                                     submenu: [
   											  {
   												  title: 'Add',
   												  link: 'restricted.category_attribute.add'
   											  },
   											  {
   												  title: 'Manage',
   												  link: 'restricted.category_attribute.manage'
   											   }
   											  ]
                            },
   							{
                                     title: 'Category',
                                     submenu: [
   											  {
   												  title: 'Add',
   												  link: 'restricted.category.add'
   											  },
   											  {
   												  title: 'Manage',
   												  link: 'restricted.category.manage'
   											  }
   											  ]
                             },
							  	{	
                                     title: 'Product',
                                     submenu: [{
   												  title: 'Add',
   												  link: 'restricted.product.add'
   											  },
   											  {
   												  title: 'Manage',
   												  link: 'restricted.product.manage'
   											  }]
                             },
   							  {
                                     title: 'Product Detail',
                                     submenu: [{
   												  title: 'Add',
   												  link: 'restricted.product_detail.add'
   											  },
   											  {
   												  title: 'Manage',
   												  link: 'restricted.product_detail.manage'
   											   }]
                             },
   							  {
                                     title: 'SKU',
                                     submenu: [{
   												  title: 'Add',
   												  link: 'restricted.sku.add'
   											  },
   											  {
   												  title: 'Manage',
   												  link: 'restricted.sku.manage'
   											  }]
                             }]
                   },
   					
                   {
                       id: 2,
                       title: 'Pricing',
                       icon: '&#xE54E;',
                       submenu: [{
                                 title: 'Offers',
                                 submenu: [{
   											  title: 'Add',
   											  link: 'restricted.offer.add'
   										  },
   										  {
   											  title: 'Manage',
   											  link: 'restricted.offer.manage'
   										  }]
   						   }]
                   },
   					{
                       id: 3,
                       title: 'Customer Care',
                       icon: '&#xE7F2;',
                       submenu: [{
                                 	title: 'Customers',
                                 	link: 'restricted.customer.manage'
       						   },
       						   {
                                    title: 'Orders',
       							  	link: 'restricted.order.manage'
       						   }]
                   }, 
   					{
                       id: 4,
                       title: 'Store Setting',
                       icon: '&#xE912;',
                       submenu: [{
                                     title: 'Banner',
                                      submenu: [{
   												 title: 'Add',
   												 link: 'restricted.store_banner.add'
   											 },
   											 {
   												 title: 'Manage',
   												 link: 'restricted.store_banner.manage'
   											 }]
                                 },
   							  	{
                                     title: 'Icon',
                                     submenu: [{
   												 title: 'Add',
   												 link: 'restricted.store_icon.add'
   											 },
   											 {
   												 title: 'Manage',
   												 link: 'restricted.store_icon.manage'
   											 }]
                                 },
                                 {
                                     title: 'Layout',
                                     submenu: [{
   												 title: 'Add',
   												 link: 'restricted.store_layout.add'
   											 },
   											 {
   												 title: 'Manage',
   												 link: 'restricted.store_layout.manage'
   											 }]
   							   },
   							   {
                                    title: 'Menu',
                                    submenu: [{
   												 title: 'Add',
   												 link: 'restricted.store_menu.add'
   											 },
   											 {
   												 title: 'Manage',
   												 link: 'restricted.store_menu.manage'
   											 }]
   							  },
   							  {
                                    title: 'Page',
                                    submenu: [{
   												 title: 'Add',
   												 link: 'restricted.store_page.add'
   											 },
   											 {
   												 title: 'Manage',
   												 link: 'restricted.store_page.manage'
   											 }]
   							  }
   						   ]
                   },
   				{
                       id: 5,
                       title: 'Users',
                       icon: '&#xE32A;',
   					   submenu: [
   					             {
   					            	 title: 'Merchant',
									 link: 'restricted.merchant.manage'
   					             },
                                 {
                                     title: 'User',
                                    submenu: [
   										  {
   											  title: 'Add',
   											  link: 'restricted.user.add'
   										  },
   										  {
   											  title: 'Manage',
   											  link: 'restricted.user.manage'
   										  }
   									   ]
                                 },
                                 {
                                     title: 'Role',
                                     submenu: [{
   												  title: 'Add',
   												  link: 'restricted.role.add'
   											  },
   											  {
   												  title: 'Manage',
   												  link: 'restricted.role.manage'
   										      }]
                              }]
                   },
   				   {
                       id: 6,
                       title: 'Settings',
                       icon: '&#xE8C0;',
                       link: 'restricted.setting'
   				   }
]*/