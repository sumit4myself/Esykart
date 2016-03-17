angular.module('altairApp')
.service('FulfillmentService', ['$http','$q','utils', function($http,$q, utils) {
	var service = {};
	    service.findAll = function(){
	    	var options = [{
                id: 1,
                name: "Digital",
                value: "DIGITAL",
            },
            {
                id: 2,
                name: "Gift Card",
                value: "GIFT_CARD",
            },
            {
                id: 3,
                name: "Physical Pickup",
                value: "PHYSICAL_PICKUP",
            },
            {
                id: 4,
                name: "Physical Pickup or Ship",
                value: "PHYSICAL_PICKUP_OR_SHIP",
            },
            {
                id: 5,
                name: "Physical Ship",
                value: "PHYSICAL_SHIP",
            }];

	    	return $q(function(resolve, reject) {
	    	    setTimeout(function() {
	    	        resolve(options);
	    	    }, 500);
	    	});
	    };
	    return service;
	} 
]);
