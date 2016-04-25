package com.webientsoft.esykart.api.order.model;

import java.util.Date;

public class OrderPaymentTransaction {
	private int id;
	private Double transactionAmount;
	private String archived;
	private String customerIpAddress;
	private Date dateRecorded;
	private Boolean success;
	private String transactionType;
	private String orderPayment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getArchived() {
		return archived;
	}

	public void setArchived(String archived) {
		this.archived = archived;
	}

	public String getCustomerIpAddress() {
		return customerIpAddress;
	}

	public void setCustomerIpAddress(String customerIpAddress) {
		this.customerIpAddress = customerIpAddress;
	}

	public Date getDateRecorded() {
		return dateRecorded;
	}

	public void setDateRecorded(Date dateRecorded) {
		this.dateRecorded = dateRecorded;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getOrderPayment() {
		return orderPayment;
	}

	public void setOrderPayment(String orderPayment) {
		this.orderPayment = orderPayment;
	}

	@Override
	public String toString() {
		return "OrderPaymentTransaction [id=" + id + ", transactionAmount=" + transactionAmount + ", archived="
				+ archived + ", customerIpAddress=" + customerIpAddress + ", dateRecorded=" + dateRecorded
				+ ", success=" + success + ", transactionType=" + transactionType + ", orderPayment=" + orderPayment
				+ "]";
	}

}
