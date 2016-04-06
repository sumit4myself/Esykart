package com.webientsoft.esykart.apigateway.product.service;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.CategoryModel;

public interface CategoryService {

	long save(CategoryModel entity);

	void update(long id, CategoryModel entity);

	CategoryModel find(long id);

	PaginatedDataModel search(FilterModel model);

	void changeStatus(long id, Status status);

}
