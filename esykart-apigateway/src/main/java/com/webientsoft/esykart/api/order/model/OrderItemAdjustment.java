package com.webientsoft.esykart.api.order.model;

public class OrderItemAdjustment {
	private Integer id;
	private Boolean appliedToSalePrice;
	private String adjustmentReason;
	private Double adjustment_value;
	private Integer offer_id;
	private OrderItemModel orderItem;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getAppliedToSalePrice() {
		return appliedToSalePrice;
	}

	public void setAppliedToSalePrice(Boolean appliedToSalePrice) {
		this.appliedToSalePrice = appliedToSalePrice;
	}

	public String getAdjustmentReason() {
		return adjustmentReason;
	}

	public void setAdjustmentReason(String adjustmentReason) {
		this.adjustmentReason = adjustmentReason;
	}

	public Double getAdjustment_value() {
		return adjustment_value;
	}

	public void setAdjustment_value(Double adjustment_value) {
		this.adjustment_value = adjustment_value;
	}

	public Integer getOffer_id() {
		return offer_id;
	}

	public void setOffer_id(Integer offer_id) {
		this.offer_id = offer_id;
	}

	public OrderItemModel getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(OrderItemModel orderItem) {
		this.orderItem = orderItem;
	}

}
