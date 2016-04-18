/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.customer.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.PageModel;

/**
 * 
 * @author SumitS2
 */

@FeignClient("apigateway")
public interface PageServiceClient {

	String BASE_PATH = "/stores/page";

	@RequestMapping(value = BASE_PATH, method = RequestMethod.POST, consumes = {
		"application/json" }, produces = { "application/json" })
	Integer save(PageModel model);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.PUT, consumes = {
		"application/json" }, produces = { "application/json" })
	void update(@PathVariable("id") Integer id, PageModel model);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.GET, consumes = {
		"application/json" }, produces = { "application/json" })
	PageModel find(@PathVariable("id") Integer id);

	@RequestMapping(value = BASE_PATH
			+ "/{pageName}", method = RequestMethod.GET, consumes = {
				"application/json" }, produces = { "application/json" })
	PageModel find(@PathVariable("pageName") String pageName);

	@RequestMapping(value = BASE_PATH
			+ "/search", method = RequestMethod.GET, consumes = {
				"application/json" }, produces = { "application/json" })
	PaginatedDataModel search(FilterModel model);

	@RequestMapping(value = BASE_PATH
			+ "/{id}", params = "status", method = RequestMethod.GET, consumes = {
				"application/json" }, produces = { "application/json" })
	void changeStatus(@PathVariable("id") int id, @RequestParam("status") Status status);

}
