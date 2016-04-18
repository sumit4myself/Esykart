/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.common.service.client.CrudServiceClientWithSearch;
import com.webientsoft.esykart.api.common.service.impl.CrudServiceWithSearchImpl;
import com.webientsoft.esykart.api.store.service.BannerService;
import com.webientsoft.esykart.api.store.service.client.BannerServiceClient;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.store.BannerModel;

/**
 * 
 * @author SumitS2
 */

@Service
public class BannerServiceImpl extends CrudServiceWithSearchImpl<BannerModel>
		implements BannerService {

	@Autowired
	private BannerServiceClient client;

	@Override
	public ResponseEntity<Void> changeStatus(Integer id, Status status) {
		return client.changeStatus(id, status);
	}

	@Override
	protected CrudServiceClientWithSearch<BannerModel> getServiceClientWithSearch() {
		return client;
	}

}
