function User() {
	this.userId = null;
	this.userName = null;
	this.name = null;
	this.mobile = null;
	this.email = null;
	this.password = null;

	this.roles = new Array();
	this.preference = new Object()

	this.setPreference = function() {
		this.preference = new UserPreference();
	}
		
	this.toJson = function() {
		return JSON.stringify(this);
	}

}

function UserPreference() {
	this.userPreferenceId = null;
	this.theme = 'default';
	this.sessionTimeOutTime = 10;
	this.screenLockTime = 5;
}
