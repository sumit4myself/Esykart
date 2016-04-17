/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.product.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.webientsoft.esykart.product.entity.ProductDetail;

@RepositoryRestResource(path = "productdetails")
public interface ProductDetailRepository
		extends BaseRepository<ProductDetail, Integer>, CustomProductDetailRepository {

}