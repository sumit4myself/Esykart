/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.common.service.client.CrudServiceClientWithSearch;
import com.webientsoft.esykart.api.common.service.impl.CrudServiceWithSearchImpl;
import com.webientsoft.esykart.api.customer.service.CustomerService;
import com.webientsoft.esykart.api.customer.service.client.CustomerServiceClient;
import com.webientsoft.esykart.api.cutomer.model.CustomerModel;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.AuthenticationModel;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@Service
public class CustomerServiceImpl extends CrudServiceWithSearchImpl<CustomerModel> implements CustomerService {

	@Autowired
	private CustomerServiceClient client;

	@Override
	public ResponseEntity<Void> changeStatus(Integer id, Status status) {
		return client.changeStatus(id, status);
	}

	@Override
	public ResponseEntity<CustomerModel> authenticate(AuthenticationModel model) {
		return client.authenticate(model);
	}

	@Override
	protected CrudServiceClientWithSearch<CustomerModel> getServiceClientWithSearch() {
		return client;
	}

	

}
