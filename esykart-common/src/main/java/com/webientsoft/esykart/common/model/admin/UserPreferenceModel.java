package com.webientsoft.esykart.common.model.admin;

public class UserPreferenceModel {

    private Integer userId;
    private String theme;
    private Integer sessionTimeOutTime = 5;
    private Integer screenLockTime = 2;

    public Integer getUserId() {
	return userId;
    }

    public void setUserId(Integer userId) {
	this.userId = userId;
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

}
