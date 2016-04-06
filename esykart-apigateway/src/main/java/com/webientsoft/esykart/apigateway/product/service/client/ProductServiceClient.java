/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.apigateway.product.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.product.ProductModel;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@FeignClient("PRODUCT-SERVICE")
public interface ProductServiceClient {

	String BASE_PATH = "/merchants";

	@RequestMapping(value = BASE_PATH, method = RequestMethod.POST)
	long save(ProductModel entity);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.PUT)
	void update(@PathVariable("id") long id, ProductModel entity);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.DELETE)
	void delete(@PathVariable("id") long id);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.GET)
	ProductModel find(@PathVariable("id") long id);
}
