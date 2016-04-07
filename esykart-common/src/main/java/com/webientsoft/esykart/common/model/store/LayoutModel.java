
package com.webientsoft.esykart.common.model.store;

import java.util.Date;
import java.util.List;

import org.springframework.boot.Banner;

public class LayoutModel {

	private Integer id;

	private String name;

	private String layout;

	private boolean defaultLayout;

	private Date startDate;

	private Date endDate;

	private NavMenuModel menu;

	private Banner banner;

	private List<LayoutSectionModel> sections;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public NavMenuModel getMenu() {
		return menu;
	}

	public void setMenu(NavMenuModel menu) {
		this.menu = menu;
	}

	public Banner getBanner() {
		return banner;
	}

	public void setBanner(Banner banner) {
		this.banner = banner;
	}

	public boolean isDefaultLayout() {
		return defaultLayout;
	}

	public void setDefaultLayout(boolean defaultLayout) {
		this.defaultLayout = defaultLayout;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLayout() {
		return layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

	public List<LayoutSectionModel> getSections() {
		return sections;
	}

	public void setSections(List<LayoutSectionModel> sections) {
		this.sections = sections;
	}

}
