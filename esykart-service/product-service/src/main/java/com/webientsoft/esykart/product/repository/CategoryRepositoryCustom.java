package com.webientsoft.esykart.product.repository;

import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;

public interface CategoryRepositoryCustom {

	PaginatedDataModel search(FilterModel model);
}
