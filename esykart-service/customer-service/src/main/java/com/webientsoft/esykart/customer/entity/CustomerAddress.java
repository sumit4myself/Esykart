/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webientsoft.esykart.customer.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author new-user
 */
@Entity
@Table(name = "customer_address")
public class CustomerAddress implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "customer_address_id")
    private Long customerAddressId;
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    @ManyToOne(optional = false)
    private Address addressId;
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(optional = false)
    private Customer customerId;

    public CustomerAddress() {
    }

    public CustomerAddress(Long customerAddressId) {
        this.customerAddressId = customerAddressId;
    }

    public Long getCustomerAddressId() {
        return customerAddressId;
    }

    public void setCustomerAddressId(Long customerAddressId) {
        this.customerAddressId = customerAddressId;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerAddressId != null ? customerAddressId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerAddress)) {
            return false;
        }
        CustomerAddress other = (CustomerAddress) object;
        if ((this.customerAddressId == null && other.customerAddressId != null) || (this.customerAddressId != null && !this.customerAddressId.equals(other.customerAddressId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hibernatetest.CustomerAddress[ customerAddressId=" + customerAddressId + " ]";
    }
    
}
