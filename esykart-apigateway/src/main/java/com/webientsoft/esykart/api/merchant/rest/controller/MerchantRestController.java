/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.merchant.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.api.common.rest.controller.CrudControllerWithSearch;
import com.webientsoft.esykart.api.common.service.CrudService;
import com.webientsoft.esykart.api.merchant.model.MerchantModel;
import com.webientsoft.esykart.api.merchant.service.MerchantService;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@RestController
@RequestMapping("/merchants")
public class MerchantRestController extends CrudControllerWithSearch<MerchantModel> {

	@Autowired
	private MerchantService merchantService;

	@Override
	protected CrudService<MerchantModel> getService() {
		return merchantService;
	}

}
