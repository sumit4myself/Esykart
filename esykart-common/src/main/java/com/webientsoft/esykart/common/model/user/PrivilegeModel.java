package com.webientsoft.esykart.common.model.user;

public class PrivilegeModel {

	private Integer privilegeId;
	private String privilegeName;
	private String icon;
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

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getSortindex() {
		return sortindex;
	}

	public void setSortindex(int sortindex) {
		this.sortindex = sortindex;
	}

}
