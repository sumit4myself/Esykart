package com.webientsoft.esykart.product.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.webientsoft.esykart.common.model.Status;

/**
 * The persistent class for the category database table.
 * 
 */
@Entity
@Table(name = "category")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "active_end_date")
	private Date activeEndDate;

	@Column(name = "active_start_date")
	private Date activeStartDate;

	@Column(name = "banner_id")
	private Integer bannerId;

	private String description;

	@Column(name = "fulfillment_type")
	private String fulfillmentType;

	@Column(name = "image_url")
	private String imageUrl;

	@Column(name = "inventory_type")
	private String inventoryType;

	@Column(name = "long_description")
	private String longDescription;

	private String name;

	@Column(length = 1)
	@Enumerated(EnumType.STRING)
	private Status status;

	private String template;

	private String url;

	@JoinColumn(name = "parent_id")
	@OneToMany
	private List<Category> categories;

	@ManyToMany(mappedBy = "categories")
	private List<CategoryAttr> categoryAttrs;

	@OneToMany(mappedBy = "category")
	private List<Product> products;

	public Category() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getActiveEndDate() {
		return this.activeEndDate;
	}

	public void setActiveEndDate(Date activeEndDate) {
		this.activeEndDate = activeEndDate;
	}

	public Date getActiveStartDate() {
		return this.activeStartDate;
	}

	public void setActiveStartDate(Date activeStartDate) {
		this.activeStartDate = activeStartDate;
	}

	public Integer getBannerId() {
		return this.bannerId;
	}

	public void setBannerId(Integer bannerId) {
		this.bannerId = bannerId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFulfillmentType() {
		return this.fulfillmentType;
	}

	public void setFulfillmentType(String fulfillmentType) {
		this.fulfillmentType = fulfillmentType;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getInventoryType() {
		return this.inventoryType;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public String getLongDescription() {
		return this.longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}


	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public Category addCategory(Category category) {
		getCategories().add(category);
		return category;
	}

	public Category removeCategory(Category category) {
		getCategories().remove(category);
		return category;
	}

	public List<CategoryAttr> getCategoryAttrs() {
		return this.categoryAttrs;
	}

	public void setCategoryAttrs(List<CategoryAttr> categoryAttrs) {
		this.categoryAttrs = categoryAttrs;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setCategory(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setCategory(null);

		return product;
	}

}