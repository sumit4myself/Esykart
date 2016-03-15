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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.webientsoft.esykart.common.model.Status;

@Entity
@Table(name = "category")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	@Column(name = "long_description")
	private String longDescription;

	private String description;

	@Column(name = "active_end_date")
	private Date activeEndDate;

	@Column(name = "active_start_date")
	private Date activeStartDate;

	// Category banner to be displayed while displaying product catalogue.
	@Column(name = "banner_id")
	private Integer bannerId;

	@Enumerated(EnumType.STRING)
	@Column(name = "fulfillment_type")
	private FulfillmentType fulfillmentType;

	@Column(name = "image_url")
	private String imageUrl;

	@Enumerated(EnumType.STRING)
	@Column(name = "inventory_type")
	private InventoryType inventoryType;

	@Column(length = 1)
	@Enumerated(EnumType.STRING)
	private Status status;

	// Template to be used while displaying product catalogue. Eg. Electronics,
	// Mobile,Cloth and soon.
	private String template;

	private String url;

	
	@OneToMany(mappedBy = "parentCategory")
	private List<Category> categories;
	
	@JoinColumn(name = "parent_id")
	@ManyToOne()
	private Category parentCategory;

	@ManyToMany(mappedBy = "categories")
	private List<CategoryAttribute> categoryAttributes;

	@OneToMany(mappedBy = "category")
	private List<Product> products;

	public Category() {
	}

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

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getActiveEndDate() {
		return activeEndDate;
	}

	public void setActiveEndDate(Date activeEndDate) {
		this.activeEndDate = activeEndDate;
	}

	public Date getActiveStartDate() {
		return activeStartDate;
	}

	public void setActiveStartDate(Date activeStartDate) {
		this.activeStartDate = activeStartDate;
	}

	public Integer getBannerId() {
		return bannerId;
	}

	public void setBannerId(Integer bannerId) {
		this.bannerId = bannerId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public FulfillmentType getFulfillmentType() {
		return fulfillmentType;
	}

	public void setFulfillmentType(FulfillmentType fulfillmentType) {
		this.fulfillmentType = fulfillmentType;
	}

	public InventoryType getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(InventoryType inventoryType) {
		this.inventoryType = inventoryType;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<CategoryAttribute> getCategoryAttributes() {
		return categoryAttributes;
	}

	public void setCategoryAttributes(List<CategoryAttribute> categoryAttributes) {
		this.categoryAttributes = categoryAttributes;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}