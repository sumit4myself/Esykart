var esykart = {
	version : 1.0,
	
	common = {
		ajaxGet : function (url) {
			$.ajax({
				url: url,
				method : "GET",
				dataType: "json",
				async: true,
				beforeSend : function() {
		  	    	 $("body").removeClass("loaded");
		  	    },
		  	    complete : function () {
		  	    	 $("body").addClass("loaded");
		  	    },
				success: function () {
					
				},
				error: function (error) {
					alert("Error error");
				}
			});
		},
		ajaxPost : function (url,data) {
			$.ajax({
				url: url,
				data : data,
				dataType: "json",
				async: true,
				beforeSend : function() {
		  	    	 $("body").removeClass("loaded");
		  	    },
		  	    complete : function () {
		  	    	 $("body").addClass("loaded");
		  	    },
				success: function () {
					
				},
				error: function (error) {
					alert("Error error");
				}
			});
		}
	},
	customer = {
		isLoggedIn = function(){
				
		}
	}
	
	storage = {
		sessionStorage : window.sessionStorage,
		localStorage : window.localStorage,
		get : function(key){
			
		}	
		put : function(key,val){
			
		}
		remove : function(key){
			
		}	
	},
	
	cart = {
		cartUrl : 'account/cart',
		add : function(data){
			
			
		},
		remove : function(id){
			
			
		}
	},
	
	wishlist = {
		wishlistUrl : 'account/cart',
		add : function(data){
			
			
		},
		remove : function(id){
			
			
		}
	},
	product = {
		view : function(data){
			
		}	
	}

}
