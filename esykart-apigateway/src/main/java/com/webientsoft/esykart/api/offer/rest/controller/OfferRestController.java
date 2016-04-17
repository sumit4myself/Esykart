/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.offer.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.api.common.rest.controller.CrudControllerWithSearch;
import com.webientsoft.esykart.api.common.service.CrudService;
import com.webientsoft.esykart.api.offer.model.OfferModel;
import com.webientsoft.esykart.api.offer.service.OfferService;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@RestController
@RequestMapping("/offers")
public class OfferRestController extends CrudControllerWithSearch<OfferModel> {

	@Autowired
	private OfferService offerService;

	@Override
	protected CrudService<OfferModel> getService() {
		return offerService;
	}

}
