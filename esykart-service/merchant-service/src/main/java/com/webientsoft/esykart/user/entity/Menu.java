package com.webientsoft.esykart.user.entity;

/*
 * Copyright (c) 2015, WebientSoft and/or its affiliates. All rights reserved. WebientSoft
 * PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

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

	@Column(name = "icon")
	private String icon;

	@Column(name = "link")
	private String link;

	@Column(name = "sort_index", nullable = false)
	private int sortIndex;

	@JoinColumn(name = "menu_id", referencedColumnName = "menu_id")
	@OneToMany
	private Set<Permission> permissions;

	@JsonProperty("submenu")
	@OneToMany(mappedBy = "parentMenu",cascade = CascadeType.ALL)
	private Set<Menu> subMenus;
	
	@JoinColumn(name = "parent_id")
	@ManyToOne()
	private Menu parentMenu;

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

	public Set<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}

	public Set<Menu> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(Set<Menu> subMenus) {
		this.subMenus = subMenus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menuId == null) ? 0 : menuId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		if (menuId == null) {
			if (other.menuId != null)
				return false;
		} else if (!menuId.equals(other.menuId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Menu [title=" + title + ", link=" + link + "]";
	}

}
