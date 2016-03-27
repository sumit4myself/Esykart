
package com.webientsoft.esykart.common.model;

public enum Status {

	ACTIVE("A"), INACTIVE("I"), DEACTIVE("D");

	private String value;

	private Status(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}

}
