/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.product.entity.projection;

import org.springframework.data.rest.core.config.Projection;

import com.webientsoft.esykart.product.entity.ProductDetail;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@Projection(name = "default", types = ProductDetail.class)
public interface DefaultProductDetailProjection {

	Integer getId();

	String getDescription();
}
