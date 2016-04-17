/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.common.service.client.CrudServiceClientWithSearch;
import com.webientsoft.esykart.api.common.service.impl.CrudServiceWithSearchImpl;
import com.webientsoft.esykart.api.product.model.SkuModel;
import com.webientsoft.esykart.api.product.service.SkuService;
import com.webientsoft.esykart.api.product.service.client.SkuServiceClient;

/**
 * 
 * 
 * @author DeepakT
 * @since 1.0
 */
@Service
public class SkuServiceImpl extends CrudServiceWithSearchImpl<SkuModel>
		implements SkuService {

	@Autowired
	private SkuServiceClient skuServiceClient;

	@Override
	protected CrudServiceClientWithSearch<SkuModel> getServiceClientWithSearch() {
		return skuServiceClient;
	}

}
