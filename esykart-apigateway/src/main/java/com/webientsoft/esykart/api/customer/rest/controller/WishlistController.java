/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */
package com.webientsoft.esykart.api.customer.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.api.customer.service.WishlistService;
import com.webientsoft.esykart.api.product.model.SkuModel;

@Controller
@RequestMapping("/account/wishlist")
public class WishlistController {

	@Autowired
	private WishlistService wishlistService;

	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" })
	public ResponseEntity<Void> add(@RequestBody SkuModel sku) {
		wishlistService.add(sku);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = { "application/json" })
	public ResponseEntity<Void> delete(@RequestBody SkuModel sku) {
		wishlistService.delete(sku);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/moveToCart", method = RequestMethod.PUT, consumes = {
		"application/json" })
	public ResponseEntity<Void> moveToCart(@RequestBody SkuModel sku) {
		wishlistService.moveToCart(sku);
		return ResponseEntity.noContent().build();
	}

}
