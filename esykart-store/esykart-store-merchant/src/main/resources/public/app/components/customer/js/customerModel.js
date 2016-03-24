function Customer() {

	this.customerId = null;
	this.status = null;
	this.emailAddress = null;
	this.firstName = null;
	this.lastName = null;
	this.password = null;
	this.gender = null;
	this.receiveEmail = null;
	this.userName = null;
	this.phoneNumber = null;
    
	
	this.toJson = function() {
		return JSON.stringify(this);
	}
	
	
}
