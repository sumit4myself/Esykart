package com.webientsoft.esykart.apigateway.store.service;

import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.NavMenuModel;

/**
 * 
 * @author SumitS2
 */
public interface NavMenuService {

	Integer save(NavMenuModel model);
	void update(Integer id, NavMenuModel model);
	NavMenuModel find(Integer id);
	PaginatedDataModel search(FilterModel model);
}
