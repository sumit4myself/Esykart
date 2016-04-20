/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.common.service.client.CrudServiceClientWithSearch;
import com.webientsoft.esykart.api.common.service.impl.CrudServiceWithSearchImpl;
import com.webientsoft.esykart.api.user.service.RoleService;
import com.webientsoft.esykart.api.user.service.client.RoleServiceClient;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.user.RoleModel;

@Service
public class RoleServiceImpl extends CrudServiceWithSearchImpl<RoleModel>
		implements RoleService {

	@Autowired
	private RoleServiceClient roleServiceClient;

	@Override
	public ResponseEntity<Void> changeStatus(Integer id, Status status) {
		return roleServiceClient.changeStatus(id, status);
	}

	@Override
	protected CrudServiceClientWithSearch<RoleModel> getServiceClientWithSearch() {
		return roleServiceClient;
	}

}
