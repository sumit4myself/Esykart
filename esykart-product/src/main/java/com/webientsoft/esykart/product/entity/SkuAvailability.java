package com.webientsoft.esykart.product.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the sku_availability database table.
 * 
 */
@Entity
@Table(name = "sku_availability")
public class SkuAvailability implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "availability_date")
    private Timestamp availabilityDate;

    @Column(name = "availability_status")
    private String availabilityStatus;

    @Column(name = "location_id")
    private Long locationId;

    @Column(name = "qty_on_hand")
    private Integer qtyOnHand;

    @Column(name = "reserve_qty")
    private Integer reserveQty;

    // bi-directional many-to-one association to Sku
    @ManyToOne
    private Sku sku;

    public SkuAvailability() {
    }

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public Timestamp getAvailabilityDate() {
	return this.availabilityDate;
    }

    public void setAvailabilityDate(Timestamp availabilityDate) {
	this.availabilityDate = availabilityDate;
    }

    public String getAvailabilityStatus() {
	return this.availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
	this.availabilityStatus = availabilityStatus;
    }

    public Long getLocationId() {
	return this.locationId;
    }

    public void setLocationId(Long locationId) {
	this.locationId = locationId;
    }

    public Integer getQtyOnHand() {
	return this.qtyOnHand;
    }

    public void setQtyOnHand(Integer qtyOnHand) {
	this.qtyOnHand = qtyOnHand;
    }

    public Integer getReserveQty() {
	return this.reserveQty;
    }

    public void setReserveQty(Integer reserveQty) {
	this.reserveQty = reserveQty;
    }

    public Sku getSku() {
	return this.sku;
    }

    public void setSku(Sku sku) {
	this.sku = sku;
    }

}