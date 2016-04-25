package com.webientsoft.esykart.api.order.model;

public class OrderItemModel {
	private int id;
	private String name;
	private Double price;
	private Integer quanity;
	private Double retailPrice;
	private Double salePrice;
	private Integer categoryId;
	private String orderItemType;
	private Double totalTax;
	private OrderModel orders;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuanity() {
		return quanity;
	}
	public void setQuanity(Integer quanity) {
		this.quanity = quanity;
	}
	public Double getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}
	public Double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getOrderItemType() {
		return orderItemType;
	}
	public void setOrderItemType(String orderItemType) {
		this.orderItemType = orderItemType;
	}
	public Double getTotalTax() {
		return totalTax;
	}
	public void setTotalTax(Double totalTax) {
		this.totalTax = totalTax;
	}
	public OrderModel getOrders() {
		return orders;
	}
	public void setOrders(OrderModel orders) {
		this.orders = orders;
	}
	
	
	
}
