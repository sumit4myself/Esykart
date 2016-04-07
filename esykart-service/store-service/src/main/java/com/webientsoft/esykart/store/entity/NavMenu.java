
package com.webientsoft.esykart.store.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nav_menu")
public class NavMenu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	@JoinColumn(name = "menu_id")
	@OneToMany
	private List<NavMenuItem> items;

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

	public List<NavMenuItem> getItems() {
		return items;
	}

	public void setItems(List<NavMenuItem> items) {
		this.items = items;
	}

}
