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
import com.webientsoft.esykart.api.product.model.ProductDetailModel;
import com.webientsoft.esykart.api.product.service.ProductDetailService;
import com.webientsoft.esykart.api.product.service.client.ProductDetailServiceClient;
import com.webientsoft.esykart.common.model.Status;

/**
 * 
 * 
 * @author DeepakT
 * @since 1.0
 */
@Service
public class ProductDetailServiceImpl extends
		CrudServiceWithSearchImpl<ProductDetailModel> implements ProductDetailService {

	@Autowired
	private ProductDetailServiceClient productDetailServiceClient;

	@Override
	public ResponseEntity<Void> changeStatus(Integer id, Status status) {
		return productDetailServiceClient.changeStatus(id, status);

	}

	@Override
	protected CrudServiceClientWithSearch<ProductDetailModel> getServiceClientWithSearch() {
		return productDetailServiceClient;
	}

}
