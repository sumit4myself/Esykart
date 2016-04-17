package com.webientsoft.esykart.order.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "order_payment")
@SequenceGenerator(name = "orderPaymentIdSeq", sequenceName = "ORDER_PAYMENT_ID_SEQ", allocationSize = 1)
public class OrderPayment implements Serializable {
	private static final long serialVersionUID = -2816198675939146662L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "orderPaymentIdSeq")
	@Column(name = "order_payment_id")
	private Long id;
	@Column(name = "payment")
	private Double amount;
	@Column(name = "archieved")
	private Boolean archieved;
	@Column(name = "address_id")
	private Integer address_id;
	@Column(name = "order_id")
	private Integer order_id;
	@Column(name = "payment_type")
	private String paymentType;
	@Column(name = "reference_number")
	private String reference_number;
	@Column(name = "gateway_type")
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
