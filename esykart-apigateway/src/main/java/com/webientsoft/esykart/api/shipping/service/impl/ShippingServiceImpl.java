/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.shipping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.shipping.service.ShippingService;
import com.webientsoft.esykart.api.shipping.service.client.ShippingServiceClient;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@Service
public class ShippingServiceImpl implements ShippingService {

	@Autowired
	private ShippingServiceClient shippingServiceClient;
}
