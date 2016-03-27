/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.auction.rest.controller;

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

import com.webientsoft.esykart.auction.entity.Auction;
import com.webientsoft.esykart.auction.repository.AuctionRepository;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@RepositoryRestController
@RequestMapping(value = "/auctions")
public class AuctionRepositoryRestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(
			AuctionRepositoryRestController.class);

	@Autowired
	private AuctionRepository auctionRepository;

	@RequestMapping(method = RequestMethod.POST, consumes = {
		"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Integer> save(@RequestBody Auction auction) {
		auctionRepository.save(auction);
		return ResponseEntity.ok(1);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = {
		"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> update(@PathVariable("id") int id,
			@RequestBody Auction auction) {
		auctionRepository.save(auction);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", params = "status", method = RequestMethod.DELETE, consumes = {
		"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> changeStatus(@PathVariable("id") int id,
			@RequestParam("status") Status status) {
		auctionRepository.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<Auction> getDetail(@PathVariable("id") int id) {
		return ResponseEntity.ok(auctionRepository.findOne(id));
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<PaginatedDataModel> findAll(FilterModel model) {
		return ResponseEntity.ok(null);
	}

}
