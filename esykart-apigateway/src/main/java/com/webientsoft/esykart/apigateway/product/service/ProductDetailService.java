/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.apigateway.product.service;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.ProductDetailModel;

public interface ProductDetailService {

	long save(ProductDetailModel entity);

	void update(long id, ProductDetailModel entity);

	ProductDetailModel find(long id);

	PaginatedDataModel search(FilterModel model);

	void changeStatus(long id, Status status);

}
