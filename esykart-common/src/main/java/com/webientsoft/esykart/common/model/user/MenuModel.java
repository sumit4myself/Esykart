package com.webientsoft.esykart.common.model.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MenuModel {

	private Integer menuId;
	private String title;
	private String icon;
	private String link;
	private int sortIndex;
	private List<PermissionModel> permissions;

	@JsonProperty("submenu")
	private List<MenuModel> subMenus;

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public List<MenuModel> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List<MenuModel> subMenu) {
		this.subMenus = subMenu;
	}

	public List<PermissionModel> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<PermissionModel> permissions) {
		this.permissions = permissions;
	}

	public int getSortIndex() {
		return sortIndex;
	}

	public void setSortIndex(int sortIndex) {
		this.sortIndex = sortIndex;
	}

}
