/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.common.service.client.CrudServiceClientWithSearch;
import com.webientsoft.esykart.api.common.service.impl.CrudServiceWithSearchImpl;
import com.webientsoft.esykart.api.product.model.ProductModel;
import com.webientsoft.esykart.api.product.service.ProductService;
import com.webientsoft.esykart.api.product.service.client.ProductServiceClient;
import com.webientsoft.esykart.common.model.Status;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@Service
public class ProductServiceImpl extends CrudServiceWithSearchImpl<ProductModel>
		implements ProductService {

	@Autowired
	private ProductServiceClient productServiceClient;

	@Override
	public ResponseEntity<Void> changeStatus(Integer id, Status status) {
		return productServiceClient.changeStatus(id, status);
	}

	@Override
	protected CrudServiceClientWithSearch<ProductModel> getServiceClientWithSearch() {
		return productServiceClient;
	}

}
