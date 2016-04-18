/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.common.service.client.CrudServiceClientWithSearch;
import com.webientsoft.esykart.api.common.service.impl.CrudServiceWithSearchImpl;
import com.webientsoft.esykart.api.store.service.LayoutService;
import com.webientsoft.esykart.api.store.service.client.LayoutServiceClient;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.store.LayoutModel;

/**
 * 
 * @author SumitS2
 */

@Service
public class LayoutServiceImpl extends CrudServiceWithSearchImpl<LayoutModel>
		implements LayoutService {

	@Autowired
	private LayoutServiceClient client;

	@Override
	protected CrudServiceClientWithSearch<LayoutModel> getServiceClientWithSearch() {
		return client;
	}

	@Override
	public ResponseEntity<Resource<LayoutModel>> findDefaultLayout() {
		return client.findDefaultLayout();
	}

	@Override
	public ResponseEntity<Void> changeStatus(Integer id, Status status) {
		return client.changeStatus(id, status);
	}

}
