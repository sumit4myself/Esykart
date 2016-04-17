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
@Table(name = "order_item_adjustment")
@SequenceGenerator(name = "orderItemAdjustmentIdSeq", sequenceName = "ORDER_ITEM_ADJUSTMENT_ID_SEQ", allocationSize = 1)
public class OrderItemAdjustment implements Serializable {

	private static final long serialVersionUID = -1179060525235667094L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "orderItemAdjustmentIdSeq")
	@Column(name = "order_item_adjustment_id")
	private Integer id;
	@Column(name = "applied_to_sale_price")
	private Boolean appliedToSalePrice;
	@Column(name = "adjustment_reason")
	private String adjustmentReason;
	@Column(name = "adjustment_value")
	private Double adjustment_value;
	@Column(name = "offer_id")
	private Integer offer_id;
	private OrderItem orderItem;

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

	public OrderItem getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

}
