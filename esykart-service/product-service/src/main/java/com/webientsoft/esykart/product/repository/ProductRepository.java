/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.product.repository;

import org.springframework.data.repository.query.Param;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.product.entity.Product;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */

public interface ProductRepository
		extends BaseRepository<Product, Integer>, ProductRepositoryCustom {

	void changeStatus(@Param("productId") Integer productId,
			@Param("status") Status status);

}
