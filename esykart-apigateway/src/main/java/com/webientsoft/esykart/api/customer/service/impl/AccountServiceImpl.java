/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */
package com.webientsoft.esykart.api.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.customer.service.AccountService;
import com.webientsoft.esykart.api.customer.service.client.AccountServiceClient;
import com.webientsoft.esykart.common.model.user.UserModel;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountServiceClient client;

	@Override
	public void authenticate(UserModel model) {
		client.authenticate(model);
	}

	@Override
	public void register(UserModel model) {
		client.register(model);
	}

}
