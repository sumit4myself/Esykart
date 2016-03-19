package com.webientsoft.esykart.store.merchant.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "merchant", schema = "core")
public class Merchant implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "merchantId")
	private Integer merchantId;

	@Basic(optional = false)
	@Column(name = "display_name")
	private String displayName;

	@Column(name = "registraion_id")
	private Integer registraionId;

	/*@OneToOne(cascade = CascadeType.ALL)
	private User user;*/

	@Column(name = "addressId")
	private Integer addressId;

	@Column(name = "alternate_addressid")
	private Integer alternateAddressId;

	public Integer getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Integer getRegistraionId() {
		return registraionId;
	}

	public void setRegistraionId(Integer registraionId) {
		this.registraionId = registraionId;
	}

	/*public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
*/
	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Integer getAlternateAddressId() {
		return alternateAddressId;
	}

	public void setAlternateAddressId(Integer alternateAddressId) {
		this.alternateAddressId = alternateAddressId;
	}

}
