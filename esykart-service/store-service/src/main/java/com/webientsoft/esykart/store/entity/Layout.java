
package com.webientsoft.esykart.store.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author SumitS2
 */

@Entity
@Table(name = "layout")
public class Layout {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String layout;

	@Column(name = "default_layout")
	private boolean defaultLayout;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date")
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date")
	private Date endDate;

	@JoinColumn(name = "nav_menu_id")
	@ManyToOne
	private NavMenu menu;

	@JoinColumn(name = "banner_id")
	@ManyToOne
	private Banner banner;

	@JoinColumn(name = "layout_id")
	@OneToMany
	private List<LayoutSection> sections;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public NavMenu getMenu() {
		return menu;
	}

	public void setMenu(NavMenu menu) {
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

	public List<LayoutSection> getSections() {
		return sections;
	}

	public void setSections(List<LayoutSection> sections) {
		this.sections = sections;
	}

}
