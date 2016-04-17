package com.webientsoft.esykart.order.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "order_adjustment")
@SequenceGenerator(name = "orderAdjustmentIdSeq", sequenceName = "ORDER_ADJUSTMENT_ID_SEQ", allocationSize = 1)
public class OrderAdjustment implements Serializable {

	private static final long serialVersionUID = -6706058510382016810L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "orderAdjustmentIdSeq")
	@Column(name = "order_adjustment_id")
	private Integer id;
	@Column(name = "adjustment_reason")
	private String adjustmentReason;
	@Column(name = "adjustment_value")
	private Double adjustmentValue;
	@Column(name = "offer_id")
	private Integer offerId;
	@OneToOne
	private Order order;

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

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderAdjustment [id=" + id + ", adjustmentReason=" + adjustmentReason + ", adjustmentValue="
				+ adjustmentValue + ", offerId=" + offerId + ", order=" + order + "]";
	}

}
