/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.customer.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.customer.entity.Customer;
import com.webientsoft.esykart.customer.repository.CustomerRepository;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@RepositoryRestController
@RequestMapping(value = "/auctions")
public class CustomerRepositoryRestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(
			CustomerRepositoryRestController.class);

	@Autowired
	private CustomerRepository customerRepository;

	@RequestMapping(method = RequestMethod.POST, consumes = {
		"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Long> save(@RequestBody Customer customer) {
		return ResponseEntity.ok(customerRepository.save(customer).getCustomerId());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = {
		"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> update(@PathVariable("id") int id,
			@RequestBody Customer customer) {
		customerRepository.save(customer);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", params = "status", method = RequestMethod.DELETE, consumes = {
		"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> changeStatus(@PathVariable("id") int id,
			@RequestParam("status") Status status) {
		//customerRepository.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<Customer> getDetail(@PathVariable("id") int id) {
		return ResponseEntity.ok(customerRepository.findOne(id));
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<PaginatedDataModel> findAll(FilterModel model) {
		return ResponseEntity.ok(null);
	}

}
