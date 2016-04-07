
package com.webientsoft.esykart.apigateway.store.service;

import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.PageModel;

/**
 * 
 * @author SumitS2
 */
public interface PageService {

	Integer save(PageModel model);

	void update(Integer id, PageModel model);

	PageModel find(Integer id);

	PaginatedDataModel search(FilterModel model);

}
