/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */
package com.webientsoft.esykart.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.NavMenuModel;
import com.webientsoft.esykart.customer.service.NavMenuService;
import com.webientsoft.esykart.customer.service.client.NavMenuServiceClient;


/**
 * 
 * @author SumitS2
 */
public class NavMenuServiceImpl implements NavMenuService {

	@Autowired
	private NavMenuServiceClient client;

	@Override
	public Integer save(NavMenuModel model) {
		return client.save(model);
	}

	@Override
	public void update(Integer id, NavMenuModel model) {
		client.update(id, model);
	}

	@Override
	public NavMenuModel find(Integer id) {
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
