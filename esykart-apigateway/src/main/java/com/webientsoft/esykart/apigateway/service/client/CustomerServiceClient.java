/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.apigateway.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.cutomer.Customer;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@FeignClient("CUSTOMER-SERVICE")
public interface CustomerServiceClient {

	String BASE_PATH = "/customers";

	@RequestMapping(value = BASE_PATH, method = RequestMethod.POST)
	long save(Customer entity);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.PUT)
	void update(@PathVariable("id") long id, Customer entity);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.DELETE)
	void delete(@PathVariable("id") long id);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.GET)
	Customer find(@PathVariable("id") long id);
}
