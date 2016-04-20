/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.product.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.api.common.rest.controller.CrudControllerWithSearch;
import com.webientsoft.esykart.api.common.service.CrudService;
import com.webientsoft.esykart.api.product.model.CategoryAttributeModel;
import com.webientsoft.esykart.api.product.service.CategoryAttributeService;
import com.webientsoft.esykart.common.model.Status;

@RestController
@RequestMapping("products/categoryAttributes")
public class CategoryAttributeRestController
		extends CrudControllerWithSearch<CategoryAttributeModel> {

	@Autowired
	private CategoryAttributeService categoryAttributeService;

	@RequestMapping(value = "/{id}/changeStatus", method = RequestMethod.PATCH, consumes = {
		"application/merge-patch+json" })
	public void changeStatus(@PathVariable("id") Integer id,
			@RequestParam("status") Status status) {
		categoryAttributeService.changeStatus(id, status);
	}

	@Override
	protected CrudService<CategoryAttributeModel> getService() {
		return categoryAttributeService;
	}

}
