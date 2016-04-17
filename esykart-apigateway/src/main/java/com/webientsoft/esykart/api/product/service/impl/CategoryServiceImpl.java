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
import com.webientsoft.esykart.api.product.model.CategoryModel;
import com.webientsoft.esykart.api.product.service.CategoryService;
import com.webientsoft.esykart.api.product.service.client.CategoryServiceClient;
import com.webientsoft.esykart.common.model.Status;

/**
 * 
 * 
 * @author DeepakT
 * @since 1.0
 */
@Service
public class CategoryServiceImpl extends CrudServiceWithSearchImpl<CategoryModel>
		implements CategoryService {

	@Autowired
	private CategoryServiceClient categoryServiceClient;

	@Override
	public ResponseEntity<Void> changeStatus(Integer id, Status status) {
		return categoryServiceClient.changeStatus(id, status);
	}

	@Override
	protected CrudServiceClientWithSearch<CategoryModel> getServiceClientWithSearch() {
		return categoryServiceClient;
	}

}
