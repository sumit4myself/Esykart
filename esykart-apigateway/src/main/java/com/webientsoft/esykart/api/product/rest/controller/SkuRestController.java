/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.product.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.api.common.rest.controller.CrudControllerWithSearch;
import com.webientsoft.esykart.api.common.service.CrudService;
import com.webientsoft.esykart.api.product.model.SkuModel;
import com.webientsoft.esykart.api.product.service.SkuService;

/**
 * 
 * 
 * @author DeepakT
 * @since 1.0
 */
@RestController
@RequestMapping(value = "/sku")
public class SkuRestController extends CrudControllerWithSearch<SkuModel> {

	@Autowired
	private SkuService skuService;

	@Override
	protected CrudService<SkuModel> getService() {
		return skuService;
	}

}
