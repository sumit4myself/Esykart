package com.webientsoft.esykart.apigateway.store.service;

import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.LayoutModel;

/**
 * 
 * @author SumitS2
 */
public interface LayoutService {

	Integer save(LayoutModel model);
	void update(Integer id, LayoutModel model);
	LayoutModel find(Integer id);
	PaginatedDataModel search(FilterModel model);
}
