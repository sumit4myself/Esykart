/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */
package com.webientsoft.esykart.api.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.customer.service.WishlistService;
import com.webientsoft.esykart.api.customer.service.client.WishlistServiceClient;
import com.webientsoft.esykart.api.product.model.SkuModel;

@Service
public class WishlistServiceImpl implements WishlistService {

	@Autowired
	private WishlistServiceClient client;

	@Override
	public void add(SkuModel sku) {
		client.add(sku);
	}

	@Override
	public void delete(SkuModel sku) {
		client.delete(sku);
	}

	@Override
	public void moveToCart(SkuModel sku) {
		client.moveToCart(sku);
	}

}
