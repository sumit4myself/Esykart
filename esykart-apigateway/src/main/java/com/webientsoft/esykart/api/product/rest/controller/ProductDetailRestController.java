/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.product.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.api.common.rest.controller.CrudControllerWithSearch;
import com.webientsoft.esykart.api.common.service.CrudService;
import com.webientsoft.esykart.api.product.model.ProductDetailModel;
import com.webientsoft.esykart.api.product.service.ProductDetailService;
import com.webientsoft.esykart.common.model.Status;

/**
 * 
 * 
 * @author DeepakT
 * @since 1.0
 */
@RestController
@RequestMapping("/products/details")
public class ProductDetailRestController
		extends CrudControllerWithSearch<ProductDetailModel> {

	@Autowired
	private ProductDetailService productDetailService;

	@RequestMapping(value = "/{id}/changeStatus", method = RequestMethod.PATCH, consumes = {
		"application/merge-patch+json" })
	public ResponseEntity<Void> changeStatus(@PathVariable("id") Integer id,
			@RequestParam("status") Status status) {
		return productDetailService.changeStatus(id, status);
	}

	@Override
	protected CrudService<ProductDetailModel> getService() {
		return productDetailService;
	}

}
