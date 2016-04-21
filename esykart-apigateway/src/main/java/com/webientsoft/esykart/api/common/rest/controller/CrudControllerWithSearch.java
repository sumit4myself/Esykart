/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.common.rest.controller;

import java.util.List;

import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webientsoft.esykart.api.common.service.CrudServiceWithSearch;
import com.webientsoft.esykart.common.model.SearchFilter;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public abstract class CrudControllerWithSearch<T> extends CrudController<T> {

	@RequestMapping(method = RequestMethod.GET, produces = {
		MediaType.APPLICATION_JSON_VALUE })
	ResponseEntity<PagedResources<Resource<T>>> findAll(
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "size", required = false) Integer size,
			@RequestParam(value = "sort", required = false) List<String> sort,
			@RequestParam(value = "projection", required = false) String projection) {
		return ((CrudServiceWithSearch<T>) getService()).findAll(page, size, sort,
				projection);

	}

	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = {
		MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	ResponseEntity<PagedResources<Resource<T>>> search(@RequestBody SearchFilter filter) {
		return ((CrudServiceWithSearch<T>) getService()).search(filter);
	}

}
