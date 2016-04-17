/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.product.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.webientsoft.esykart.product.entity.Product;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */

@RepositoryRestResource(path = "products")
public interface ProductRepository
		extends BaseRepository<Product, Integer>,CustomProductRepository {


}
