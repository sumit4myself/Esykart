package com.webientsoft.esykart.order.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "order")
@SequenceGenerator(name = "orderIdSeq", sequenceName = "ORDER_ID_SEQ", allocationSize = 1)
public class Order implements Serializable {
	private static final long serialVersionUID = -5148244781780846070L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "orderIdSeq")
	@Column(name = "order_id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "updated_by")
	private String updatedBy;
	@Column(name = "email_address")
	private String emailAddress;
	@Column(name = "order_number")
	private String orderNumber;
	@Column(name = "date_created")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	@Column(name = "date_updated", columnDefinition = "date default sysdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateUpdated;
	@Column(name = "total_order")
	private Double totalOrder;
	@Column(name = "toatal_shipping")
	private Double totalShipping;
	@Column(name = "toatal_tax")
	private Double totalTax;
	@Column(name = "currency")
	private String currency;
	@Column(name = "customer_id", nullable = false)
	private Integer customerId;
	@Enumerated(EnumType.STRING)
	@Column(name = "order_status")
	private OrderStatus orderStatus;
	@Column(name = "is_preview")
	private Boolean isPreview;
	@OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
	private List<OrderItem> orderItems;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public Double getTotalOrder() {
		return totalOrder;
	}

	public void setTotalOrder(Double totalOrder) {
		this.totalOrder = totalOrder;
	}

	public Double getTotalShipping() {
		return totalShipping;
	}

	public void setTotalShipping(Double totalShipping) {
		this.totalShipping = totalShipping;
	}

	public Double getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(Double totalTax) {
		this.totalTax = totalTax;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Boolean getIsPreview() {
		return isPreview;
	}

	public void setIsPreview(Boolean isPreview) {
		this.isPreview = isPreview;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy
				+ ", emailAddress=" + emailAddress + ", orderNumber=" + orderNumber + ", dateCreated=" + dateCreated
				+ ", dateUpdated=" + dateUpdated + ", totalOrder=" + totalOrder + ", totalShipping=" + totalShipping
				+ ", totalTax=" + totalTax + ", currency=" + currency + ", customerId=" + customerId + ", orderStatus="
				+ orderStatus + "]";
	}

}
