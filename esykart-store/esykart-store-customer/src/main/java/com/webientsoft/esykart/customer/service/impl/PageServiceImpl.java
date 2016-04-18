/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.PageModel;
import com.webientsoft.esykart.customer.service.PageService;
import com.webientsoft.esykart.customer.service.client.PageServiceClient;

/**
 * 
 * @author SumitS2
 */
public class PageServiceImpl implements PageService {

	@Autowired
	private PageServiceClient client;

	@Override
	public Integer save(PageModel model) {
		return client.save(model);
	}

	@Override
	public void update(Integer id, PageModel model) {
		client.update(id, model);
	}

	@Override
	public PageModel find(Integer id) {
		return client.find(id);
	}

	@Override
	public PageModel find(String pageName) {
		return client.find(pageName);
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
