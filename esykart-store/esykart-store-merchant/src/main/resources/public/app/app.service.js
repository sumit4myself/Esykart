altairApp
    .service('detectBrowser', [
        '$window',
        function($window) {
            // http://stackoverflow.com/questions/22947535/how-to-detect-browser-using-angular
            return function() {
                var userAgent = $window.navigator.userAgent,
                    browsers  = {
                        chrome  : /chrome/i,
                        safari  : /safari/i,
                        firefox : /firefox/i,
                        ie      : /internet explorer/i
                    };

                for ( var key in browsers ) {
                    if ( browsers[key].test(userAgent) ) {
                        return key;
                    }
                }
                return 'unknown';
            }
        }
    ])
    
    .service('preloaders', [
        '$rootScope',
        '$timeout',
        'utils',
        function($rootScope,$timeout,utils) {
            $rootScope.content_preloader_show = function(style,container) {
                var $body = $('body');
                if(!$body.find('.content-preloader').length) {
                    var image_density = utils.isHighDensity() ? '@2x' : '' ;

                    var preloader_content = (typeof style !== 'undefined' && style == 'regular')
                        ? '<img src="assets/img/spinners/spinner' + image_density + '.gif" alt="" width="32" height="32">'
                        : '<div class="md-preloader"><svg xmlns="http://www.w3.org/2000/svg" version="1.1" height="32" width="32" viewbox="0 0 75 75"><circle cx="37.5" cy="37.5" r="33.5" stroke-width="8"/></svg></div>';

                    var thisContainer = (typeof container !== 'undefined') ? container : $body;

                    thisContainer.append('<div class="content-preloader">' + preloader_content + '</div>');
                    $timeout(function() {
                        $('.content-preloader').addClass('preloader-active');
                    });
                }
            };
            $rootScope.content_preloader_hide = function() {
                var $body = $('body');
                if($body.find('.content-preloader').length) {
                    // hide preloader
                    $('.content-preloader').removeClass('preloader-active');
                    // remove preloader
                    $timeout(function() {
                        $('.content-preloader').remove();
                    }, 500);
                }
            };

        }
    ])
    
   	.service('AuthorizationService', ['$http',function($http) {
		var service = {};
		var publicPages = new Array();
        service.init = function(){
        	$http.get('/details').then(function(response) {
        		service.userDetails = response.data;
        		console.log("AuthorizationService = > init ================================ ");
        		console.log(response);
        	});
        	publicPages.push("error");
        	publicPages.push("error.403");
        	publicPages.push("error.404");
        	publicPages.push("error.500");
        };
        
        service.getDefaultPage = function(){
        	return 'restricted.dashboard';
        	
        }
        
        service.hasPermission = function(sref){
        	console.log(sref);
        	var granted = false;
        	$(publicPages).each(function(){
        		if(this == sref){
        			granted = true;
					return false;
        		}
        	});
        	$(service.userDetails.menus).each(function(){
        		console.log(this);
	    		if(this.link == sref){
	    			$(this.permissions).each(function(){
	    				if(this.link.indexOf(sref) >= 0){
	    					granted = true;
	    					return false;
	    				}
	    			})
	    			
	    		}else if(this.submenu != null){
	    			$(this.submenu).each(function(){
	    				console.log(this);
	    				if(this.link == sref){
	    					granted = true;
	    					return false;
	    				}
	    				$(this.permissions).each(function(){
    	    				if(this.link.indexOf(sref) >= 0){
    	    					granted = true;
    	    					return false;
    	    				}
    	    			})
	    				
	    			})
	    		}
    		});
        	return granted;
    	},
    	service.getGrantedPermissions = function(permissionFor){
    		var permissions = new Array();
    		$(service.userDetails.menus).each(function(){
	    		if(this.link == permissionFor){
	    			permissions = this.permissions;
	    			
	    		}else if(this.submenu != null){
	    			$(this.submenu).each(function(){
	    				if(this.link == permissionFor){
	    					permissions = this.permissions;
	    				}
	    			})
	    		}
    		});
    		return permissions;
    	},
    	service.getGrantedSections = function(){
    		service.userDetails.menus.sort(function(a, b){
    			return (a.sortIndex > b.sortIndex ? 1 : -1);
            });
    		return service.userDetails.menus;
    		
    	},
    	service.getUserDetails = function(){
    		return service.userDetails;
    		
    	}
        return service;
}]);
    
    
;