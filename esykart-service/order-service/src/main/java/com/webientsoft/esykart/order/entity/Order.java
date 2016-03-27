package com.webientsoft.esykart.order.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "esykart_order")
@SequenceGenerator(name = "orderIdSeq", sequenceName = "ORDER_ID_SEQ", allocationSize = 1)
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "orderIdSeq")
	private int id;
	private String name;

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

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + "]";
	}

}
