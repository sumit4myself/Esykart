/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.apigateway.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.apigateway.service.CustomerService;

/**
 * 
 * @author DeepakT
 * @since 1.o
 */
@RestController("/customers")
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;

}
