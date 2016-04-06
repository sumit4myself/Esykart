/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.product.repository;

import org.springframework.data.repository.query.Param;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.product.entity.ProductDetail;

public interface ProductDetailRepository extends BaseRepository<ProductDetail, Integer>, ProductDetailRepositoryCustom {

	void changeStatus(@Param("id") Integer id, @Param("status") Status status);

}	