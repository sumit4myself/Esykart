/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.user.service.RoleService;
import com.webientsoft.esykart.api.user.service.client.RoleServiceClient;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.user.RoleModel;

@Service
public class RoleServiceImpl implements RoleService {
	
//	private static final Logger LOGGER = LoggerFactory.getLogger(RoleServiceImpl.class);

	@Autowired
	private RoleServiceClient client;

	@Override
	public void save(RoleModel model) {
		client.save(model);

	}

	@Override
	public void update(Integer id, RoleModel model) {
		client.update(id, model);
	}

	@Override
	public RoleModel find(Integer id) {
		return client.find(id);
	}

	@Override
	public PaginatedDataModel search(FilterModel model) {
		return client.search(model);
	}

	@Override
	public void changeStatus(Integer id, Status status) {
		client.changeStatus(id, status);
	}
}
