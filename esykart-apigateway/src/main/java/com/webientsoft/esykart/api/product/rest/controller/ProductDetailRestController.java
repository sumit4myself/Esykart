/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.product.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.api.common.rest.controller.CrudControllerWithSearch;
import com.webientsoft.esykart.api.common.service.CrudService;
import com.webientsoft.esykart.api.product.model.ProductDetailModel;
import com.webientsoft.esykart.api.product.service.ProductDetailService;

/**
 * 
 * 
 * @author DeepakT
 * @since 1.0
 */
@RestController
@RequestMapping("/product/details")
public class ProductDetailRestController
		extends CrudControllerWithSearch<ProductDetailModel> {

	@Autowired
	private ProductDetailService productDetailService;

	@Override
	protected CrudService<ProductDetailModel> getService() {
		return productDetailService;
	}

}
