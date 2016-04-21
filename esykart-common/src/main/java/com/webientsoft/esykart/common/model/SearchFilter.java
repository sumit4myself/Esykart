package com.webientsoft.esykart.common.model;

import java.util.List;

public class SearchFilter {

	private Integer size;
	private Integer page;
	private List<SearchCriteria> criterias;
	private List<Sort> sorts;
	
	/**
	 * @return the size
	 */
	public Integer getSize() {
		return size;
	}
	
	/**
	 * @param size the size to set
	 */
	public void setSize(Integer size) {
		this.size = size;
	}
	
	/**
	 * @return the page
	 */
	public Integer getPage() {
		return page;
	}
	
	/**
	 * @param page the page to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}
	
	/**
	 * @return the criterias
	 */
	public List<SearchCriteria> getCriterias() {
		return criterias;
	}
	
	/**
	 * @param criterias the criterias to set
	 */
	public void setCriterias(List<SearchCriteria> criterias) {
		this.criterias = criterias;
	}
	
	/**
	 * @return the sorts
	 */
	public List<Sort> getSorts() {
		return sorts;
	}
	
	/**
	 * @param sorts the sorts to set
	 */
	public void setSorts(List<Sort> sorts) {
		this.sorts = sorts;
	}
	
	
	

}
