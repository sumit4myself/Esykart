/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.product.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webientsoft.esykart.api.common.service.client.CrudServiceClientWithSearch;
import com.webientsoft.esykart.api.product.model.ProductDetailModel;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.services.Services;

/**
 * 
 * 
 * @author DeepakT
 * @since 1.0
 */
@RequestMapping("/productDetails")
@FeignClient(Services.PRODUCT_SERVICE)
public interface ProductDetailServiceClient
		extends CrudServiceClientWithSearch<ProductDetailModel> {

	@RequestMapping(value = "/{id}/changeStatus", method = RequestMethod.PATCH, consumes = {
		"application/merge-patch+json;charset=UTF-8" }, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	ResponseEntity<Void> changeStatus(@PathVariable("id") Integer id,
			@RequestParam(value = "status") Status status);

}
