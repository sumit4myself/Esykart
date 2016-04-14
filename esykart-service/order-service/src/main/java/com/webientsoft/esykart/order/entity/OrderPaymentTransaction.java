package com.webientsoft.esykart.order.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "order_payment_transaction")
@SequenceGenerator(name = "orderPaymentTransactionIdSeq", sequenceName = "ORDER_PAYMENT_TRANSACTION_ID_SEQ", allocationSize = 1)
public class OrderPaymentTransaction implements Serializable {
	private static final long serialVersionUID = -3428345286611079195L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "orderPaymentTransactionIdSeq")
	private int id;
}
