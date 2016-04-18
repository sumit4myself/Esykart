/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.customer.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.api.customer.service.CartService;
import com.webientsoft.esykart.api.product.model.SkuModel;

@RestController
@RequestMapping(value = "/account/cart")
public class CartController {

	@Autowired
	private CartService cartService;

	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" })
	public ResponseEntity<Void> add(@RequestBody SkuModel sku) {
		cartService.add(sku);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = { "application/json" })
	public ResponseEntity<Void> delete(@RequestBody SkuModel sku) {
		cartService.delete(sku);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/moveToWishlist", method = RequestMethod.PUT, consumes = {
		"application/json" })
	public ResponseEntity<Void> moveToWishlist(@RequestBody SkuModel sku) {
		cartService.moveToWishlist(sku);
		return ResponseEntity.noContent().build();
	}

}
