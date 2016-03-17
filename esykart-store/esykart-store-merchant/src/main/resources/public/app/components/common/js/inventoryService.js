angular.module('altairApp').service('InventoryService',
		[ '$http', '$q', 'utils', function($http, $q, utils) {
			var service = {};
			service.findAll = function() {
				var options = [ {
					id : 1,
					name : "Always Available",
					value : "ALWAYS_AVAILABLE",
				}, {
					id : 2,
					name : "Check Quantity",
					value : "CHECK_QUANTITY",
				}, {
					id : 3,
					name : "Unavailable",
					value : "UNAVAILABLE",
				} ];
				return $q(function(resolve, reject) {
					setTimeout(function() {
						resolve(options);
					}, 500);
				});

			}
			return service;
		} ]);
