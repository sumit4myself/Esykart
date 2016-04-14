package com.webientsoft.esykart.order.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "order_payment")
@SequenceGenerator(name = "orderPaymentIdSeq", sequenceName = "ORDER_PAYMENT_ID_SEQ", allocationSize = 1)
public class OrderPayment  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2816198675939146662L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "orderPaymentIdSeq")
	private int id;
}
