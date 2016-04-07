
package com.webientsoft.esykart.common.model.store;

import java.util.List;

public class NavMenuItemModel {

	private Integer id;

	private String name;

	private Integer categoryId;

	private PageModel page;

	private List<NavMenuItemModel> childItem;

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

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public PageModel getPage() {
		return page;
	}

	public void setPage(PageModel page) {
		this.page = page;
	}

	public List<NavMenuItemModel> getChildItem() {
		return childItem;
	}

	public void setChildItem(List<NavMenuItemModel> childItem) {
		this.childItem = childItem;
	}

}
