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
import com.webientsoft.esykart.api.store.service.NavMenuService;
import com.webientsoft.esykart.api.store.service.client.NavMenuServiceClient;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.store.NavMenuModel;

/**
 * 
 * @author SumitS2
 */

@Service
public class NavMenuServiceImpl extends CrudServiceWithSearchImpl<NavMenuModel>
		implements NavMenuService {

	@Autowired
	private NavMenuServiceClient client;

	@Override
	public ResponseEntity<Void> changeStatus(Integer id, Status status) {
		return client.changeStatus(id, status);
	}

	@Override
	protected CrudServiceClientWithSearch<NavMenuModel> getServiceClientWithSearch() {
		return client;
	}

	

}
