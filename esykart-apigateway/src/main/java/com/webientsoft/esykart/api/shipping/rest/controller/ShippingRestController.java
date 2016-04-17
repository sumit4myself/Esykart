/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.shipping.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.api.shipping.service.ShippingService;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@RestController
@RequestMapping("/shippings")
public class ShippingRestController {

	@Autowired
	private ShippingService shippingService;
}
