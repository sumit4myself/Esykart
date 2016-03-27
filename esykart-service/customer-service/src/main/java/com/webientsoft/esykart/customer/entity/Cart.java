package com.webientsoft.esykart.customer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cart implements Serializable{
	
	private static final long serialVersionUID = 5742844018016808102L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "customer_id")
	private Integer customerId;
	@Column(name = "product_id")
	private String productId;
	@Column(name = "quantity")
	private Integer quantity;
	@Column(name = "delivery_details")
	private Double deliveryDetails;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getDeliveryDetails() {
		return deliveryDetails;
	}
	public void setDeliveryDetails(Double deliveryDetails) {
		this.deliveryDetails = deliveryDetails;
	}
}
