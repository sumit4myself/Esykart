function Role() {
	this.roleId = null;
	this.roleName = null;
	this.description = null;
	this.status = "A";
	this.permissions = new Array();

	this.copyProperties = function(data) {
		var role = this;
		$.each(data, function(key, value) {
			role[key] = value;
		});
//		this = role;
	}

	this.setPermissions = function(permissions) {
		var _array = new Array();
		if (permissions != null && permissions.length > 0) {
			for (var i = 0; i < permissions.length; i++) {
				if (permissions[i] != null && permissions[i].permissionId != null) {
					_array.push(permissions[i]);
				}
			}
		}
		this.permissions = _array;
	}

	this.getPermissions = function() {
		var _array = new Array();
		if (this.permissions != null && this.permissions.length > 0) {
			for (var i = 0; i < this.permissions.length; i++) {
				_array[this.permissions[i].permissionId] = this.permissions[i];
			}
		}
		return _array;
	}

	this.toJson = function() {
		return JSON.stringify(this);
	}
}