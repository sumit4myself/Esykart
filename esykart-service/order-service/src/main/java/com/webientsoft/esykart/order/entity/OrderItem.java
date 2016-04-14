package com.webientsoft.esykart.order.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "order_item")
@SequenceGenerator(name = "orderItemIdSeq", sequenceName = "ORDER_ITEM_ID_SEQ", allocationSize = 1)
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 6394711883106882948L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "orderItemIdSeq")
	private int id;
}
