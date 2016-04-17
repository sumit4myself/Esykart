package com.webientsoft.esykart.order.entity;

public enum OrderStatus {
	
	SUBMITTED("SUBMITTED"), CANCELLED("CANCELLED"), IN_PROCESS("IN_PROCESS");

	private String status;

	private OrderStatus(String status) {
		this.status = status;
	}

	public String value() {
		return status;
	}
}
