package com.webientsoft.esykart.common.model.admin;

import java.util.List;

public class RoleModel {

    private Integer roleId;
    private String roleName;
    private String description;

    private List<Integer> privilegeIds;
    private List<Integer> assignedUserIds;

    private List<PrivilegeModel> privileges;
    private List<UserModel> assignedUsers;

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

    public List<Integer> getPrivilegeIds() {
	return privilegeIds;
    }

    public void setPrivilegeIds(List<Integer> privilegeIds) {
	this.privilegeIds = privilegeIds;
    }

    public List<Integer> getAssignedUserIds() {
	return assignedUserIds;
    }

    public void setAssignedUserIds(List<Integer> assignedUserIds) {
	this.assignedUserIds = assignedUserIds;
    }

    public List<PrivilegeModel> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<PrivilegeModel> privileges) {
        this.privileges = privileges;
    }

    public List<UserModel> getAssignedUsers() {
        return assignedUsers;
    }

    public void setAssignedUsers(List<UserModel> assignedUsers) {
        this.assignedUsers = assignedUsers;
    }
    
    
}
