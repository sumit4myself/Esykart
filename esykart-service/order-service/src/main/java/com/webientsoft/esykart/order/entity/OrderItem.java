package com.webientsoft.esykart.order.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "order_item")
@SequenceGenerator(name = "orderItemIdSeq", sequenceName = "ORDER_ITEM_ID_SEQ", allocationSize = 1)
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 6394711883106882948L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "orderItemIdSeq")
	@Column(name="order_item_id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private Double price;
	@Column(name="quanity")
	private Integer quanity;
	@Column(name="retail_price")
	private Double retailPrice;
	@Column(name="sale_price")
	private Double salePrice;
	@Column(name="category_id")
	private Integer categoryId;
	@Column(name="order_item_type")
	private String orderItemType;
	@Column(name="total_tax")
	private Double totalTax;
	@ManyToOne
	private Order orders;
}
