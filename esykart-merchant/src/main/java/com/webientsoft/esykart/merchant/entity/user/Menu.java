package com.webientsoft.esykart.merchant.entity.user;

/*
 * Copyright (c) 2015, WebientSoft and/or its affiliates. All rights reserved. WebientSoft
 * PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The entity Class of core.module table.
 *
 * @author SumitS2
 * @version 1.0
 * @since 1.0
 */
@Entity
@Table(name = "menu")
public class Menu implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "menu_id")
	private Integer menuId;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "icon", nullable = false)
	private String icon;

	@Column(name = "link", nullable = false)
	private String link;

	@Column(name = "sort_index", nullable = false)
	private int sortIndex;

	@OneToMany(mappedBy = "menu")
	private List<Permission> permissions;

	@JoinColumn(name = "parent_id")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Menu> subMenus;

	public Menu() {
	}

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

	public int getSortIndex() {
		return sortIndex;
	}

	public void setSortIndex(int sortIndex) {
		this.sortIndex = sortIndex;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public List<Menu> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List<Menu> subMenus) {
		this.subMenus = subMenus;
	}

}
