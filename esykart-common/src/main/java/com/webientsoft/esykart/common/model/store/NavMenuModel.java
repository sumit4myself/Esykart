package com.webientsoft.esykart.common.model.store;

import java.util.List;

public class NavMenuModel {

	private Integer id;
	private String name;
	private List<NavMenuItemModel> items;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<NavMenuItemModel> getItems() {
		return items;
	}

	public void setItems(List<NavMenuItemModel> items) {
		this.items = items;
	}

}
