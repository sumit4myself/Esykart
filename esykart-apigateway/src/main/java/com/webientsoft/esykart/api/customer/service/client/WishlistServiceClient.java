/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */
package com.webientsoft.esykart.api.customer.service.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.api.cutomer.model.WishListModel;
import com.webientsoft.esykart.api.product.model.SkuModel;

@FeignClient("apigateway")
public interface WishlistServiceClient {

	String BASE_PATH = "/customers/wishlist";

	@RequestMapping(value = BASE_PATH, method = RequestMethod.POST, consumes = {
		"application/json" })
	void add(SkuModel sku);

	@RequestMapping(value = BASE_PATH, method = RequestMethod.DELETE, consumes = {
		"application/json" })
	void delete(SkuModel sku);

	@RequestMapping(value = BASE_PATH + "/moveToCart", method = RequestMethod.PUT, consumes = {
		"application/json" })
	void moveToCart(SkuModel sku);
	
	@RequestMapping(value = BASE_PATH
			+ "/authenticate", method = RequestMethod.POST, consumes = {
				"application/json" },produces = { "application/json" })
	List<WishListModel> findAll(Integer id);

}
