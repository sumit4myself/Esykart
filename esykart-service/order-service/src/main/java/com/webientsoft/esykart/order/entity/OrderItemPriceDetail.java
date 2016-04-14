package com.webientsoft.esykart.order.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "order_item_price_dtl")
@SequenceGenerator(name = "orderItemPriceDtlIdSeq", sequenceName = "ORDER_ITEM_PRICE_DTL_ID_SEQ", allocationSize = 1)
public class OrderItemPriceDetail implements Serializable{
	private static final long serialVersionUID = -3246601445089096382L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "orderIdSeq")
	private int id;
}
