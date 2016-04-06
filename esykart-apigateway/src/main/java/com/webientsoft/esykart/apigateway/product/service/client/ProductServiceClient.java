/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.apigateway.product.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.ProductModel;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@FeignClient("PRODUCT-SERVICE")
public interface ProductServiceClient {

	String BASE_PATH = "/products";

	@RequestMapping(value = BASE_PATH, method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	long save(ProductModel entity);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.PUT, consumes = { "application/json" })
	void update(@PathVariable("id") long id, ProductModel entity);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.GET, produces = { "application/json" })
	ProductModel find(@PathVariable("id") long id);

	@RequestMapping(value = BASE_PATH + "/search", method = RequestMethod.POST, consumes = {
			"application/json" }, produces = { "application/json" })
	PaginatedDataModel search(FilterModel model);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.DELETE)
	void changeStatus(@PathVariable("id") long id, @RequestParam("status") Status status);

}
