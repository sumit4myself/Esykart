/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.merchant.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.common.service.client.CrudServiceClientWithSearch;
import com.webientsoft.esykart.api.common.service.impl.CrudServiceWithSearchImpl;
import com.webientsoft.esykart.api.merchant.model.MerchantModel;
import com.webientsoft.esykart.api.merchant.service.MerchantService;
import com.webientsoft.esykart.api.merchant.service.client.MerchantServiceClient;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@Service
public class MerchantServiceImpl extends CrudServiceWithSearchImpl<MerchantModel>
		implements MerchantService {

	@Autowired
	private MerchantServiceClient merchantServiceClient;

	@Override
	protected CrudServiceClientWithSearch<MerchantModel> getServiceClientWithSearch() {
		return merchantServiceClient;
	}

}
