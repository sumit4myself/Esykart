/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.order.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.api.common.rest.controller.CrudControllerWithSearch;
import com.webientsoft.esykart.api.common.service.CrudService;
import com.webientsoft.esykart.api.order.model.OrderModel;
import com.webientsoft.esykart.api.order.service.OrderService;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@RestController
@RequestMapping("/orders")
public class OrderRestController extends CrudControllerWithSearch<OrderModel> {

	@Autowired
	private OrderService orderService;

	@Override
	protected CrudService<OrderModel> getService() {
		return orderService;
	}

}
