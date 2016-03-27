package com.webientsoft.esykart.product.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * The persistent class for the product database table.
 * 
 */
@Entity
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String manufacture;

	private String model;

	private String name;
	
	@Column(name = "is_taxable")
	private boolean isTaxable;

	@Column(name = "tax_detail_id")
	private Integer taxDetailId;

	@Enumerated(EnumType.STRING)
	@Column(name = "fulfillment_type")
	private FulfillmentType fulfillmentType;

	@Enumerated(EnumType.STRING)
	@Column(name = "inventory_type")
	private InventoryType inventoryType;

	@ManyToOne
	private Category category;

	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
	private List<ProductDetail> details;
	
	@JoinColumn(name = "product_id")
	@OneToMany()
	private List<ProductMediaMap> productMediaMaps;

	public Product() {
		super();
	}

	public Product(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isTaxable() {
		return isTaxable;
	}

	public void setTaxable(boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	public Integer getTaxDetailId() {
		return taxDetailId;
	}

	public void setTaxDetailId(Integer taxDetailId) {
		this.taxDetailId = taxDetailId;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<ProductDetail> getDetails() {
		return details;
	}

	public void setDetails(List<ProductDetail> details) {
		this.details = details;
	}

	public List<ProductMediaMap> getProductMediaMaps() {
		return productMediaMaps;
	}

	public void setProductMediaMaps(List<ProductMediaMap> productMediaMaps) {
		this.productMediaMaps = productMediaMaps;
	}
}