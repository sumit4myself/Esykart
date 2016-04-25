package com.webientsoft.esykart.api.order.model;

public class OrderAdjustment {
	private Integer id;
	private String adjustmentReason;
	private Double adjustmentValue;
	private Integer offerId;
	private OrderModel order;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdjustmentReason() {
		return adjustmentReason;
	}

	public void setAdjustmentReason(String adjustmentReason) {
		this.adjustmentReason = adjustmentReason;
	}

	public Double getAdjustmentValue() {
		return adjustmentValue;
	}

	public void setAdjustmentValue(Double adjustmentValue) {
		this.adjustmentValue = adjustmentValue;
	}

	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	public OrderModel getOrder() {
		return order;
	}

	public void setOrder(OrderModel order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderAdjustment [id=" + id + ", adjustmentReason=" + adjustmentReason + ", adjustmentValue="
				+ adjustmentValue + ", offerId=" + offerId + ", order=" + order + "]";
	}

}
