
package com.webientsoft.esykart.common.model;

public enum Status {

	A("A"), I("I"), D("D");

	private String value;

	private Status(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}

}
