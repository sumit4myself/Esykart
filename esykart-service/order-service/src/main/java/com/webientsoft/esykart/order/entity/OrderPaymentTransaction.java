package com.webientsoft.esykart.order.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "order_payment_transaction")
@SequenceGenerator(name = "orderPaymentTransactionIdSeq", sequenceName = "ORDER_PAYMENT_TRANSACTION_ID_SEQ", allocationSize = 1)
public class OrderPaymentTransaction implements Serializable {
	private static final long serialVersionUID = -3428345286611079195L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "orderPaymentTransactionIdSeq")
	@Column(name = "payment_transaction_id", nullable = false)
	private int id;
	@Column(name = "transaction_amount")
	private Double transactionAmount;
	@Column(name = "archived")
	private String archived;
	@Column(name = "customer_ip_address")
	private String customerIpAddress;
	@Column(name = "date_recorded")
	private Date dateRecorded;
	@Column(name = "success")
	private Boolean success;
	@Column(name = "transaction_type")
	private String transactionType;
	@Column(name = "order_payment", nullable = false)
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
