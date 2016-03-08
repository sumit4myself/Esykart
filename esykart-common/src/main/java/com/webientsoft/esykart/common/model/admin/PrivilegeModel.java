package com.webientsoft.esykart.common.model.admin;


public class PrivilegeModel {

    private Integer privilegeId;
    private String privilegeName;
    private String link;
    private int sortindex;

    public Integer getPrivilegeId() {
	return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
	this.privilegeId = privilegeId;
    }

    public String getPrivilegeName() {
	return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
	this.privilegeName = privilegeName;
    }

    public String getLink() {
	return link;
    }

    public void setLink(String link) {
	this.link = link;
    }

    public int getSortindex() {
	return sortindex;
    }

    public void setSortindex(int sortindex) {
	this.sortindex = sortindex;
    }

}
