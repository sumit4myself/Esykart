altairApp
    .factory('windowDimensions', [
        '$window',
        function($window) {
            return {
                height: function() {
                    return window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight;
                },
                width: function() {
                    return window.innerWidth || document.documentElement.clientWidth || document.body.clientWidth;
                }
            }
        }
    ])
    .factory('variables', function () {
        return {
            header__main_height: 48,
            easing_swiftOut: [ 0.4,0,0.2,1 ],
            bez_easing_swiftOut: $.bez([ 0.4,0,0.2,1 ])
        }
    })
    .factory('utils', function () {
        return {
        	preparefilterDataFromDatatableData : function (dtData) {
        		var columns = null;
        		var filterData = {};
    			filterData.size = null;
    			filterData.page = null;
    			filterData.criterias = new Array();
    			filterData.sorts = new Array();
    			$(dtData).each(function(){
    				var _$this = this;
					if(_$this.name == "columns"){
						columns = _$this.value;				
					}else if(_$this.name == "start"){
						filterData.page = _$this.value;
    				}else if(_$this.name == "length"){
    					filterData.size = _$this.value;
    				}else if(_$this.name == "order"){
    					$(_$this.value).each(function(){
							var sort = new Object();
							sort.property = columns[this.column].data;
							sort.direction = this.dir;
							filterData.sorts.push(sort);
    					});
    				}else if(_$this.name == "search"){
    					$(columns).each(function(){
    						if(this.searchable){
    							var criteria = new Object();
    							criteria.key = this.data;
								criteria.value = _$this.value.value;
								criteria.operator = "=";
								filterData.criterias.push(criteria);
    						}
    					});
    				}
    			})
    			return JSON.stringify(filterData);
            },
	        prepareDatatableDataFromResponse : function (response) {
	        	var data = {};
		        	data.recordsTotal = 0;
	        		data.recordsFiltered = 0;
	        		data.data = new Array();
	        		if(response == null){
	        			return data
	        		}
	        		$.each(response.data._embedded, function(k, v) {
	        		    data.data  = v;
	        		});
	        		data.recordsTotal = response.data.page.totalElements;
	        		data.recordsFiltered = response.data.page.totalElements;
				return data;
	        },
            // Util for finding an object by its 'id' property among an array
            findByItemId: function findById(a, id) {
                for (var i = 0; i < a.length; i++) {
                    if (a[i].item_id == id) return a[i];
                }
                return null;
            },
            // serialize form
            serializeObject: function(form) {
                var o = {};
                var a = form.serializeArray();
                $.each(a, function() {
                    if (o[this.name] !== undefined) {
                        if (!o[this.name].push) {
                            o[this.name] = [o[this.name]];
                        }
                        o[this.name].push(this.value || '');
                    } else {
                        o[this.name] = this.value || '';
                    }
                });
                return o;
            },
            // high density test
            isHighDensity: function() {
                return ((window.matchMedia && (window.matchMedia('only screen and (min-resolution: 124dpi), only screen and (min-resolution: 1.3dppx), only screen and (min-resolution: 48.8dpcm)').matches || window.matchMedia('only screen and (-webkit-min-device-pixel-ratio: 1.3), only screen and (-o-min-device-pixel-ratio: 2.6/2), only screen and (min--moz-device-pixel-ratio: 1.3), only screen and (min-device-pixel-ratio: 1.3)').matches)) || (window.devicePixelRatio && window.devicePixelRatio > 1.3));
            },
            // touch device test
            isTouchDevice: function() {
                return !!('ontouchstart' in window);
            },
            // local storage test
            lsTest: function() {
                var test = 'test';
                try {
                    localStorage.setItem(test, test);
                    localStorage.removeItem(test);
                    return true;
                } catch(e) {
                    return false;
                }
            },
            // show/hide card
            card_show_hide: function(card,begin_callback,complete_callback,callback_element) {
                $(card).velocity({
                        scale: 0,
                        opacity: 0.2
                    }, {
                        duration: 400,
                        easing: [ 0.4,0,0.2,1 ],
                        // on begin callback
                        begin: function () {
                            if (typeof begin_callback !== 'undefined') {
                                begin_callback(callback_element);
                            }
                        },
                        // on complete callback
                        complete: function () {
                            if (typeof complete_callback !== 'undefined') {
                                complete_callback(callback_element);
                            }
                        }
                    })
                    .velocity('reverse');
            }
        };
    })
;

angular
    .module("ConsoleLogger", [])
    // router.ui debug
    // app.js (run section "PrintToConsole")
    .factory("PrintToConsole", [
        "$rootScope",
        function ($rootScope) {
            var handler = { active: false };
            handler.toggle = function () { handler.active = !handler.active; };

            if (handler.active) {
                console.log($state + ' = ' + $state.current.name);
                console.log($stateParams + '=' + $stateParams);
                console.log($state_full_url + '=' + $state.$current.url.source);
                console.log(Card_fullscreen + '=' + card_fullscreen);

                $rootScope.$on('$stateChangeStart', function (event, toState, toParams, fromState, fromParams) {
                    console.log("$stateChangeStart --- event, toState, toParams, fromState, fromParams");
                    console.log(arguments);
                });
                $rootScope.$on('$stateChangeError', function (event, toState, toParams, fromState, fromParams, error) {
                    console.log("$stateChangeError --- event, toState, toParams, fromState, fromParams, error");
                    console.log(arguments);
                });
                $rootScope.$on('$stateChangeSuccess', function (event, toState, toParams, fromState, fromParams) {
                    console.log("$stateChangeSuccess --- event, toState, toParams, fromState, fromParams");
                    console.log(arguments);
                });
                $rootScope.$on('$viewContentLoading', function (event, viewConfig) {
                    console.log("$viewContentLoading --- event, viewConfig");
                    console.log(arguments);
                });
                $rootScope.$on('$viewContentLoaded', function (event) {
                    console.log("$viewContentLoaded --- event");
                    console.log(arguments);
                });
                $rootScope.$on('$stateNotFound', function (event, unfoundState, fromState, fromParams) {
                    console.log("$stateNotFound --- event, unfoundState, fromState, fromParams");
                    console.log(arguments);
                });
            }

            return handler;
        }
    ])
;