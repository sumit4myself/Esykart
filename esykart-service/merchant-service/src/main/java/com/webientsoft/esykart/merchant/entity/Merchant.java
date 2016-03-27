
package com.webientsoft.esykart.merchant.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.webientsoft.esykart.common.model.Status;

@Entity
@Table(name = "merchant")
public class Merchant implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional = false)
	@Column(name = "merchantId")
	private Integer id;

	@Column(name = "display_name")
	private String displayName;

	@Column(name = "registraion_id")
	private Integer registraionId;

	@Column(name = "addressId")
	private Integer addressId;

	@Column(name = "alternate_addressid")
	private Integer alternateAddressId;

	@Enumerated(EnumType.STRING)
	private Status status;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the registraionId
	 */
	public Integer getRegistraionId() {
		return registraionId;
	}

	/**
	 * @param registraionId the registraionId to set
	 */
	public void setRegistraionId(Integer registraionId) {
		this.registraionId = registraionId;
	}

	/**
	 * @return the addressId
	 */
	public Integer getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the alternateAddressId
	 */
	public Integer getAlternateAddressId() {
		return alternateAddressId;
	}

	/**
	 * @param alternateAddressId the alternateAddressId to set
	 */
	public void setAlternateAddressId(Integer alternateAddressId) {
		this.alternateAddressId = alternateAddressId;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

}
