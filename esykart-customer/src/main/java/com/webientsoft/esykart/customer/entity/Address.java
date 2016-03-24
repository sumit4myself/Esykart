/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webientsoft.esykart.customer.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rahul
 */
@Entity
@Table(name = "address")

public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "address_id")
    private Long addressId;
    @Basic(optional = false)
    @Column(name = "address_line1")
    private String addressLine1;
    @Column(name = "address_line2")
    private String addressLine2;
    @Column(name = "address_line3")
    private String addressLine3;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "email_address")
    private String emailAddress;
    @Column(name = "fax")
    private String fax;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "is_business")
    private Boolean isBusiness;
    @Column(name = "is_default")
    private Boolean isDefault;
    @Column(name = "is_mailing")
    private Boolean isMailing;
    @Column(name = "is_street")
    private Boolean isStreet;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "primary_phone")
    private String primaryPhone;
    @Column(name = "secondary_phone")
    private String secondaryPhone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "addressId")
    private Collection<CustomerAddress> customerAddressCollection;
    @JoinColumn(name = "country", referencedColumnName = "id")
    @ManyToOne
    private Country country;

    public Address() {
    }

    public Address(Long addressId) {
        this.addressId = addressId;
    }

    public Address(Long addressId, String addressLine1, String city) {
        this.addressId = addressId;
        this.addressLine1 = addressLine1;
        this.city = city;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsBusiness() {
        return isBusiness;
    }

    public void setIsBusiness(Boolean isBusiness) {
        this.isBusiness = isBusiness;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getIsMailing() {
        return isMailing;
    }

    public void setIsMailing(Boolean isMailing) {
        this.isMailing = isMailing;
    }

    public Boolean getIsStreet() {
        return isStreet;
    }

    public void setIsStreet(Boolean isStreet) {
        this.isStreet = isStreet;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(String primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public String getSecondaryPhone() {
        return secondaryPhone;
    }

    public void setSecondaryPhone(String secondaryPhone) {
        this.secondaryPhone = secondaryPhone;
    }

    @XmlTransient
    public Collection<CustomerAddress> getCustomerAddressCollection() {
        return customerAddressCollection;
    }

    public void setCustomerAddressCollection(Collection<CustomerAddress> customerAddressCollection) {
        this.customerAddressCollection = customerAddressCollection;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addressId != null ? addressId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        if ((this.addressId == null && other.addressId != null) || (this.addressId != null && !this.addressId.equals(other.addressId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hibernatetest.Address[ addressId=" + addressId + " ]";
    }
    
}
