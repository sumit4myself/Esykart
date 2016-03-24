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
import javax.persistence.Table;

/**
 *
 * @author new-user
 */
@Entity
@Table(name = "phone")

public class Phone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "phone_id")
    private Long phoneId;
    @Column(name = "country_code")
    private String countryCode;
    @Column(name = "extension")
    private String extension;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "is_default")
    private Boolean isDefault;
    @Basic(optional = false)
    @Column(name = "phone_number")
    private String phoneNumber;

    public Phone() {
    }

    public Phone(Long phoneId) {
        this.phoneId = phoneId;
    }

    public Phone(Long phoneId, String phoneNumber) {
        this.phoneId = phoneId;
        this.phoneNumber = phoneNumber;
    }

    public Long getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Long phoneId) {
        this.phoneId = phoneId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (phoneId != null ? phoneId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Phone)) {
            return false;
        }
        Phone other = (Phone) object;
        if ((this.phoneId == null && other.phoneId != null) || (this.phoneId != null && !this.phoneId.equals(other.phoneId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hibernatetest.Phone[ phoneId=" + phoneId + " ]";
    }
    
}
