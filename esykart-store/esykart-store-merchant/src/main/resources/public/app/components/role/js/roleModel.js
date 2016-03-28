function Role() {
	this.roleId = null;
	this.roleName = null;
	this.description = null;
	this.status = "A";
	this.permissions = new Array();

	this.toJson = function() {
		return this;
	}
	
//	set permissionId to object 

}