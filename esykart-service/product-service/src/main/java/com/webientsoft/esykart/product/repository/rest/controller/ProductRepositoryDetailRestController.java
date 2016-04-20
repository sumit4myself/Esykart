/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.product.repository.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.product.repository.ProductDetailRepository;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@RepositoryRestController
@RequestMapping("/productdetails")
public class ProductRepositoryDetailRestController {

	@Autowired
	private ProductDetailRepository repository;

	@RequestMapping(value = "/{id}/changeStatus", method = RequestMethod.PATCH, consumes = {
		"application/merge-patchjson;charset=UTF-8" })
	public ResponseEntity<Void> changeStatus(@PathVariable("id") Integer id,
			@RequestParam("status") Status status) {
		repository.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}

}
