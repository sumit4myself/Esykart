/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.apigateway.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.apigateway.product.service.client.ProductServiceClient;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductServiceClient client;
}
