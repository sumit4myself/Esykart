/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.apigateway.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.apigateway.service.PaymentService;
import com.webientsoft.esykart.apigateway.service.client.PaymentServiceClient;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired 
	private PaymentServiceClient client;
}
