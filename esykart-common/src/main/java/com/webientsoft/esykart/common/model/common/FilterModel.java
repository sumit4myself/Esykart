package com.webientsoft.esykart.common.model.common;

import java.io.Serializable;
import java.util.Map;

public class FilterModel implements Serializable {

	private static final long serialVersionUID = 8884763577640735245L;

	private Integer limit;
	private Integer offset;

	private Map<String, String> filter;
	private Map<String, String> sorting;

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Map<String, String> getFilter() {
		return filter;
	}

	public void setFilter(Map<String, String> filter) {
		this.filter = filter;
	}

	public Map<String, String> getSorting() {
		return sorting;
	}

	public void setSorting(Map<String, String> sorting) {
		this.sorting = sorting;
	}

}
