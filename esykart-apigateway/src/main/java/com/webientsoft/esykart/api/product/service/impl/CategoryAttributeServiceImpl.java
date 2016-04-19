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
import com.webientsoft.esykart.api.product.model.CategoryAttributeModel;
import com.webientsoft.esykart.api.product.service.CategoryAttributeService;
import com.webientsoft.esykart.api.product.service.client.CategoryAttributeServiceClient;
import com.webientsoft.esykart.common.model.Status;

/**
 * 
 * 
 * @author DeepakT
 * @since 1.0
 */
@Service
public class CategoryAttributeServiceImpl
		extends CrudServiceWithSearchImpl<CategoryAttributeModel>
		implements CategoryAttributeService {

	@Autowired
	private CategoryAttributeServiceClient categoryAttrServiceClient;

	@Override
	public ResponseEntity<Void> changeStatus(Integer id, Status status) {
		return categoryAttrServiceClient.changeStatus(id, status);
	}

	@Override
	protected CrudServiceClientWithSearch<CategoryAttributeModel> getServiceClientWithSearch() {
		return categoryAttrServiceClient;
	}

}
