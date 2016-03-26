package com.webientsoft.esykart.merchant.entity.user;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.webientsoft.esykart.common.model.Status;

@Entity
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "user_name", length = 100, nullable = false, unique = true)
	private String userName;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "name", length = 100, nullable = false)
	private String name;

	@Column(name = "mobile", length = 15, nullable = false, unique = true)
	private String mobile;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "updated_by")
	private Integer updatedBy;

	@Column(name = "updated_on")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedOn;

	@Column(name = "status", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	private Status status;

	@JoinTable(name = "role_user_mapping", inverseJoinColumns = {
			@JoinColumn(name = "role_id", referencedColumnName = "role_id") }, joinColumns = {
					@JoinColumn(name = "user_id", referencedColumnName = "user_id") })
	@ManyToMany
	private List<Role> roles;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
	private UserPreference userPreferences;

	public User() {
	}

	public User(Integer userId) {
		this.userId = userId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public UserPreference getUserPreferences() {
		return userPreferences;
	}

	public void setUserPreferences(UserPreference userPreferences) {
		this.userPreferences = userPreferences;
	}

}
