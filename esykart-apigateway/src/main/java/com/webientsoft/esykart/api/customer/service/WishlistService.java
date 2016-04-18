/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */
package com.webientsoft.esykart.api.customer.service;

import java.util.List;

import com.webientsoft.esykart.api.cutomer.model.WishListModel;
import com.webientsoft.esykart.api.product.model.SkuModel;

public interface WishlistService {

	public void add(SkuModel sku);

	public void delete(SkuModel sku);

	public void moveToCart(SkuModel sku);

	List<WishListModel> findAll(Integer customerId);
}
