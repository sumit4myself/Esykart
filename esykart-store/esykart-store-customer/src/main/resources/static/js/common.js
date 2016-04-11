var esykart = {
	version : 1.0,
	
	common = {
		ajaxGet : function (url) {
			$.ajax({
				url: url,
				method : "GET",
				dataType: "json",
				async: true,     
				success: function () {
					
				},
				error: function () {
					throw new Error("Could not load script " + script);
				}
			});
		},
		ajaxPost : function (url,data) {
			$.ajax({
				url: url,
				data : data,
				dataType: "json",
				async: true,     
				success: function () {
					
				},
				error: function () {
					throw new Error("Could not load script " + script);
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
		add : function(){
			
			
		},
		remove : function(){
			
			
		}
	},
	
	wishlist = {
		add : function(){
			
			
		},
		remove : function(){
			
			
		}
	}

}
