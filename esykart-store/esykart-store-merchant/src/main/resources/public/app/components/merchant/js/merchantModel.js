function Merchant() {
	
	this.merchantId = null;
	this.displayName = null;
	this.fullName = null;
	this.email = null;
	this.mobile = null;
	this.password = null;
	
	this.toJson = function() {
		return JSON.stringify(this);
	}
	
	
}
