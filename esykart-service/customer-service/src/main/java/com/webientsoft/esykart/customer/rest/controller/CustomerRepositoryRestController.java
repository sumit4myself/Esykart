/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.customer.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.PagedResources.PageMetadata;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webientsoft.esykart.common.model.SearchFilter;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.customer.entity.Customer;
import com.webientsoft.esykart.customer.model.CustomerModel;
import com.webientsoft.esykart.customer.repository.CustomerRepository;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@RepositoryRestController
@RequestMapping(value = "/auctions")
@ResponseBody
public class CustomerRepositoryRestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(
			CustomerRepositoryRestController.class);
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping(value = "/search", method = RequestMethod.POST, consumes = {
		MediaType.APPLICATION_JSON_VALUE }, produces = { MediaTypes.HAL_JSON_VALUE })
	public @ResponseBody ResponseEntity<PagedResources<Resource<Customer>>> search(
			@RequestBody SearchFilter filter) {
		LOGGER.info("CustomerRepositoryRestController - search");
		Pageable pageable = new PageRequest(filter.getPage(), filter.getSize());
		Page<Customer> page = customerRepository.findAll(pageable);
		List<Resource<Customer>> resources = new ArrayList<>(page.getSize());
		for (Customer customer : page.getContent()) {
			resources.add(new Resource<Customer>(customer));
		}
		PagedResources<Resource<Customer>> pagedResources = new PagedResources<>(
				resources, new PageMetadata(page.getSize(), page.getNumber(),
						page.getTotalElements()));
		return ResponseEntity.ok(pagedResources);
	}
	

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE }, produces = {
				MediaType.APPLICATION_JSON_VALUE })
	public  ResponseEntity<Customer> authenticate(@RequestBody CustomerModel customer) {
		return ResponseEntity.ok(customerRepository.authenticate(customer.getUserName(), customer.getPassword()));
	}

	

	@RequestMapping(value = "/{id}/changeStatus", params = "status", method = RequestMethod.PATCH, consumes = {
	"application/merge-patchjson;charset=UTF-8" })
	public  ResponseEntity<Void> changeStatus(@PathVariable("id") int id,
			@RequestParam("status") Status status) {
		customerRepository.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}

	
}
