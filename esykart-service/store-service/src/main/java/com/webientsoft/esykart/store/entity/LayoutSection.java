
package com.webientsoft.esykart.store.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author SumitS2
 */

@Entity
@Table(name = "layout_section")
public class LayoutSection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String size;

	private Integer index;

	@Column(name = "all_product_selection_rule")
	private String allProductSelectionRule;

	@Column(name = "product_selection_rule")
	private String productSelectionRule;

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

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getProductSelectionRule() {
		return productSelectionRule;
	}

	public void setProductSelectionRule(String productSelectionRule) {
		this.productSelectionRule = productSelectionRule;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getAllProductSelectionRule() {
		return allProductSelectionRule;
	}

	public void setAllProductSelectionRule(String allProductSelectionRule) {
		this.allProductSelectionRule = allProductSelectionRule;
	}

}
