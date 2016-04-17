/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.common.service.client.CrudServiceClientWithSearch;
import com.webientsoft.esykart.api.common.service.impl.CrudServiceWithSearchImpl;
import com.webientsoft.esykart.api.order.model.OrderModel;
import com.webientsoft.esykart.api.order.service.OrderService;
import com.webientsoft.esykart.api.order.service.client.OrderServiceClient;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@Service
public class OrderServiceImpl extends CrudServiceWithSearchImpl<OrderModel>
		implements OrderService {

	@Autowired
	private OrderServiceClient orderServiceClient;

	@Override
	protected CrudServiceClientWithSearch<OrderModel> getServiceClientWithSearch() {
		return orderServiceClient;
	}

}
