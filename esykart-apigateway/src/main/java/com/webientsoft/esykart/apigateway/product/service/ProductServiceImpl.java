/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.apigateway.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.apigateway.product.service.client.ProductServiceClient;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.ProductModel;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductServiceClient client;

	@Override
	public long save(ProductModel entity) {
		return client.save(entity);
	}

	@Override
	public void update(long id, ProductModel entity) {
		client.update(id, entity);
	}

	@Override
	public ProductModel find(long id) {
		return client.find(id);
	}

	@Override
	public PaginatedDataModel search(FilterModel model) {
		return client.search(model);
	}

	@Override
	public void changeStatus(long id, Status status) {
		client.changeStatus(id, status);
	}
}
