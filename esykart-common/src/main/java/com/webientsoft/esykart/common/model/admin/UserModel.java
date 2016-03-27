package com.webientsoft.esykart.common.model.admin;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(value = {"password"})
public class UserModel {

    private Integer userId;
    private String userName;
    private String name;
    private String mobile;
    private String email;
    private String password;

    private List<RoleModel> roles;
    private UserPreferenceModel preference;

    
    public List<RoleModel> getRoles() {
	return roles;
    }

    public void setRoles(List<RoleModel> roles) {
	this.roles = roles;
    }

    public UserPreferenceModel getPreference() {
	return preference;
    }

    public void setPreference(UserPreferenceModel preference) {
	this.preference = preference;
    }

    public Integer getUserId() {
	return userId;
    }

    public void setUserId(Integer userId) {
	this.userId = userId;
    }

    public String getUserName() {
	return userName;
    }

    public void setUserName(String userName) {
	this.userName = userName;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getMobile() {
	return mobile;
    }

    public void setMobile(String mobile) {
	this.mobile = mobile;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }
}
