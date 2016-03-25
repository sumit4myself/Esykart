package com.webientsoft.esykart.common.model.user;

public class PermissionModel {

	private Integer permissionId;
	private PrivilegeModel privilege;
	private MenuModel menu;

	public Integer getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

	public PrivilegeModel getPrivilege() {
		return privilege;
	}

	public void setPrivilege(PrivilegeModel privilege) {
		this.privilege = privilege;
	}

	public MenuModel getMenu() {
		return menu;
	}

	public void setMenu(MenuModel menu) {
		this.menu = menu;
	}

}
