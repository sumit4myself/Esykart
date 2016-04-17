/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.product.repository.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.SearchCriteria;
import com.webientsoft.esykart.product.entity.Product;
import com.webientsoft.esykart.product.entity.specification.impl.ProductSpecificationImpl;
import com.webientsoft.esykart.product.repository.ProductRepository;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@RepositoryRestController
@RequestMapping(value = "/products")
public class ProductRepositoryRestController {

	@Autowired
	private ProductRepository repository;

	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = {
		MimeTypeUtils.APPLICATION_JSON_VALUE })
	public ResponseEntity<Page<Product>> search() {
		List<SearchCriteria> criterias = new ArrayList<>();
		criterias.add(new SearchCriteria("name", "Lenovo", "="));
		criterias.add(new SearchCriteria("model", "E49", "="));
		Pageable pageable = new PageRequest(1, 10);
		return ResponseEntity.ok(
				repository.findAll(new ProductSpecificationImpl(criterias), pageable));
	}

}
