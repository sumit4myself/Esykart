/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */
package com.webientsoft.esykart.api.customer.service;

import com.webientsoft.esykart.api.product.model.SkuModel;

public interface CartService {

	public void add(SkuModel sku);

	public void delete(SkuModel sku);

	public void moveToWishlist(SkuModel sku);

}
