/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.apigateway.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.apigateway.service.MerchantService;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.merchant.MerchantModel;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@RestController
@RequestMapping("/merchants")
public class MerchantRestController {

	@Autowired
	private MerchantService merchantService;

	@RequestMapping(method = RequestMethod.POST, consumes = {
		"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Integer> save(@RequestBody MerchantModel merchant) {
		return ResponseEntity.ok(merchantService.save(merchant));
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = {
		"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> update(@PathVariable("id") int id,
			@RequestBody MerchantModel merchant) {
		merchantService.save(merchant);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", params = "status", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<Void> changeStatus(@PathVariable("id") int id,
			@RequestParam("status") Status status) {
		merchantService.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<MerchantModel> getDetail(@PathVariable("id") int id) {
		return ResponseEntity.ok(merchantService.find(id));
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<PaginatedDataModel> findAll(FilterModel model) {
		return ResponseEntity.ok(null);
	}

}
