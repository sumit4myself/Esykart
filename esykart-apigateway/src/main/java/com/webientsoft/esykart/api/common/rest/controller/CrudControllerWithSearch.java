/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.common.rest.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webientsoft.esykart.api.common.service.CrudService;
import com.webientsoft.esykart.api.common.service.CrudServiceWithSearch;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public abstract class CrudControllerWithSearch<T> extends CrudController<T> {

	@RequestMapping(method = RequestMethod.GET, produces = { MediaTypes.HAL_JSON_VALUE })
	ResponseEntity<Resource<Page<T>>> findAll(
			@RequestParam(value = "page", required = false) int page,
			@RequestParam(value = "size", required = false) int size,
			@RequestParam(value = "sort", required = false) List<String> sort,
			@RequestParam("projection") String projection) {
		return ((CrudServiceWithSearch<T>) getService()).findAll(page, size, sort,
				projection);

	}

	protected abstract CrudService<T> getService();
}
