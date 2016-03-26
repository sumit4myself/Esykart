package com.webientsoft.esykart.common.model.user;

import java.util.List;

public class RoleModel {

	private Integer roleId;
	private String roleName;
	private String description;

	private List<PermissionModel> permissions;
	private List<UserModel> users;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<PermissionModel> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<PermissionModel> permissions) {
		this.permissions = permissions;
	}

	public List<UserModel> getUsers() {
		return users;
	}

	public void setUsers(List<UserModel> users) {
		this.users = users;
	}

}
