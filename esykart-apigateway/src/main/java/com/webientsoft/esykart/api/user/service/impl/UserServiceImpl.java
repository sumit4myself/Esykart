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
import com.webientsoft.esykart.api.user.service.UserService;
import com.webientsoft.esykart.api.user.service.client.UserServiceClient;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.user.UserModel;

@Service
public class UserServiceImpl extends CrudServiceWithSearchImpl<UserModel>
		implements UserService {

	@Autowired
	private UserServiceClient userServiceClient;

	@Override
	public ResponseEntity<Void> changeStatus(Integer id, Status status) {
		return userServiceClient.changeStatus(id, status);
	}

	@Override
	public ResponseEntity<UserModel> authenticate(AuthenticationModel model) {
		return userServiceClient.authenticate(model);
	}

	@Override
	protected CrudServiceClientWithSearch<UserModel> getServiceClientWithSearch() {
		return userServiceClient;
	}

}
