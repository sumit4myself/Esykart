/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.common.rest.controller;

import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.api.common.service.CrudService;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public abstract class CrudController<T> {

	@RequestMapping(method = RequestMethod.POST, consumes = {
		MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> save(@RequestBody T entity) {
		return getService().save(entity);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = {
		MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> update(@PathVariable("id") Integer id,
			@RequestBody T model) {
		return getService().update(id, model);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PATCH, consumes = {
		"application/merge-patch+json" })
	public ResponseEntity<Void> updatePartially(@PathVariable("id") Integer id,
			@RequestBody T model) {
		return getService().updatePartially(id, model);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		return getService().delete(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {
		MediaTypes.HAL_JSON_VALUE })
	public ResponseEntity<Resource<T>> find(@PathVariable("id") Integer id) {
		return getService().find(id);
	}

	protected abstract CrudService<T> getService();
}
