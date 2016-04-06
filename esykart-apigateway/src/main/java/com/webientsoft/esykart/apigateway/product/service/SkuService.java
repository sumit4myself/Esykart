package com.webientsoft.esykart.apigateway.product.service;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.SkuModel;

public interface SkuService {

	long save(SkuModel entity);

	void update(long id, SkuModel entity);

	SkuModel find(long id);

	PaginatedDataModel search(FilterModel model);

	void changeStatus(long id, Status status);

}
