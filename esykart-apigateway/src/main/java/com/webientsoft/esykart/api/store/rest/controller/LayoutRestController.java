/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.store.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.api.common.rest.controller.CrudControllerWithSearch;
import com.webientsoft.esykart.api.common.service.CrudService;
import com.webientsoft.esykart.api.store.service.LayoutService;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.store.LayoutModel;

/**
 * 
 * @author SumitS2
 */
@RestController
@RequestMapping("/layouts")
public class LayoutRestController extends CrudControllerWithSearch<LayoutModel> {

	@Autowired
	public LayoutService layoutService;

	@RequestMapping(value = "/{id}/changeStatus", params = "status", method = RequestMethod.PATCH, consumes = {
		MediaType.APPLICATION_JSON_UTF8_VALUE })
	public @ResponseBody ResponseEntity<Void> changeStatus(@PathVariable("id") int id,
			@RequestParam("status") Status status) {
		return layoutService.changeStatus(id, status);
	}

	@RequestMapping(value = "/findDefaultLayout", method = RequestMethod.GET, produces = {
		MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<Resource<LayoutModel>> findDefaultLayout() {
		return layoutService.findDefaultLayout();
	}

	@Override
	protected CrudService<LayoutModel> getService() {
		return layoutService;
	}

}
