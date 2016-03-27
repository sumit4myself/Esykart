/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.apigateway.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.merchant.MerchantModel;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@FeignClient("MERCHANT-SERVICE")
public interface MerchantServiceClient {

	String BASE_PATH = "/merchants";

	@RequestMapping(value = BASE_PATH, method = RequestMethod.POST, consumes = {
	"application/json" }, produces = { "application/json" })
	Integer save(@RequestBody MerchantModel entity);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.PUT, consumes = {
	"application/json" }, produces = { "application/json" })
	void update(@PathVariable("id") long id, @RequestBody MerchantModel entity);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.DELETE)
	void delete(@PathVariable("id") long id);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.GET,produces = { "application/json" })
	MerchantModel find(@PathVariable("id") long id);
}
