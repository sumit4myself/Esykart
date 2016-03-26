/*
 * Copyright (c) 2015, WebientSoft and/or its affiliates. All rights reserved. WebientSoft
 * PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.merchant.entity.user;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_preference")
public class UserPreference implements Serializable {

	private static final long serialVersionUID = -2313794763139742279L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "user_preference_id")
	private Integer userPreferenceId;

	@Column(name = "theme")
	private String theme;

	@Column(name = "session_time_out_time")
	private Integer sessionTimeOutTime;

	@Column(name = "screen_lock_time")
	private Integer screenLockTime;

	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	@OneToOne(optional = false)
	private User user;

	public Integer getUserPreferenceId() {
		return userPreferenceId;
	}

	public void setUserPreferenceId(Integer userPreferenceId) {
		this.userPreferenceId = userPreferenceId;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Integer getSessionTimeOutTime() {
		return sessionTimeOutTime;
	}

	public void setSessionTimeOutTime(Integer sessionTimeOutTime) {
		this.sessionTimeOutTime = sessionTimeOutTime;
	}

	public Integer getScreenLockTime() {
		return screenLockTime;
	}

	public void setScreenLockTime(Integer screenLockTime) {
		this.screenLockTime = screenLockTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
