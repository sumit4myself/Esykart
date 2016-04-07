package com.webientsoft.esykart.apigateway.store.service;

import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.BannerModel;

/**
 * 
 * @author SumitS2
 */
public interface BannerService {
	
	Integer save(BannerModel model);
	void update(Integer id, BannerModel model);
	BannerModel find(Integer id);
	PaginatedDataModel search(FilterModel model);

}
