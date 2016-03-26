/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webientsoft.esykart.merchant.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.tomcat.jni.Address;

/**
 *
 * @author new-user
 */
@Entity
@Table(name = "merchant_address",schema = "core")
public class MerchantAddress implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "merchant_address_id")
	private Long merchantAddressId;
	@JoinColumn(name = "address_id", referencedColumnName = "address_id")
	@ManyToOne(optional = false)
	private Address addressId;
	@JoinColumn(name = "merchant_id", referencedColumnName = "merchant_id")
	@ManyToOne(optional = false)
	private Merchant merchantId;

	public MerchantAddress() {
	}

	public Long getMerchantAddressId() {
		return merchantAddressId;
	}

	public void setMerchantAddressId(Long merchantAddressId) {
		this.merchantAddressId = merchantAddressId;
	}

	public Address getAddressId() {
		return addressId;
	}

	public void setAddressId(Address addressId) {
		this.addressId = addressId;
	}

	public Merchant getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Merchant merchantId) {
		this.merchantId = merchantId;
	}
}
