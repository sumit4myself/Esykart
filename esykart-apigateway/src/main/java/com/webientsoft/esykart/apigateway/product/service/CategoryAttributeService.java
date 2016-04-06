package com.webientsoft.esykart.apigateway.product.service;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.CategoryAttributeModel;

public interface CategoryAttributeService {

	long save(CategoryAttributeModel entity);

	void update(long id, CategoryAttributeModel entity);

	CategoryAttributeModel find(long id);

	PaginatedDataModel search(FilterModel model);

	void changeStatus(long id, Status status);

}