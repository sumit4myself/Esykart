/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.BannerModel;
import com.webientsoft.esykart.customer.service.BannerService;
import com.webientsoft.esykart.customer.service.client.BannerServiceClient;

/**
 * 
 * @author SumitS2
 */

@Service
public class BannerServiceImpl implements BannerService {

	@Autowired
	private BannerServiceClient client;

	@Override
	public Integer save(BannerModel model) {
		return client.save(model);
	}

	@Override
	public void update(Integer id, BannerModel model) {
		client.update(id, model);
	}

	@Override
	public BannerModel find(Integer id) {
		return client.find(id);
	}

	@Override
	public PaginatedDataModel search(FilterModel model) {
		return client.search(model);
	}

	@Override
	public void changeStatus(int id, Status status) {
		client.changeStatus(id, status);
	}

}
