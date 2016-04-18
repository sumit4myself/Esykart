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
import com.webientsoft.esykart.common.model.store.LayoutModel;
import com.webientsoft.esykart.customer.service.LayoutService;
import com.webientsoft.esykart.customer.service.client.LayoutServiceClient;

/**
 * 
 * @author SumitS2
 */

@Service
public class LayoutServiceImpl implements LayoutService {

	@Autowired
	private LayoutServiceClient client;

	@Override
	public Integer save(LayoutModel model) {
		return client.save(model);
	}

	@Override
	public void update(Integer id, LayoutModel model) {
		client.update(id, model);
	}

	@Override
	public LayoutModel find(Integer id) {
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

	@Override
	public LayoutModel findDefaultLayout() {
		return client.findDefaultLayout();
	}

}
