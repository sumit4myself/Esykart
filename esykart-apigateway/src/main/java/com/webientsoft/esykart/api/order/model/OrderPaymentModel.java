package com.webientsoft.esykart.api.order.model;

public class OrderPaymentModel {
	private Long id;
	private Double amount;
	private Boolean archieved;
	private Integer address_id;
	private Integer order_id;
	private String paymentType;
	private String reference_number;
	private String gateway_type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Boolean getArchieved() {
		return archieved;
	}

	public void setArchieved(Boolean archieved) {
		this.archieved = archieved;
	}

	public Integer getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getReference_number() {
		return reference_number;
	}

	public void setReference_number(String reference_number) {
		this.reference_number = reference_number;
	}

	public String getGateway_type() {
		return gateway_type;
	}

	public void setGateway_type(String gateway_type) {
		this.gateway_type = gateway_type;
	}

}
