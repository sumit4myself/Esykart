/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.common.service.client;

import org.springframework.data.domain.Page;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webientsoft.esykart.common.model.SearchCriteria;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public interface CrudServiceClientWithSearch<T> {

	@RequestMapping(method = RequestMethod.POST, consumes = {
		MediaType.APPLICATION_JSON_VALUE })
	ResponseEntity<Void> save(T entity);

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = {
		MediaType.APPLICATION_JSON_UTF8_VALUE })
	ResponseEntity<Void> update(@PathVariable("id") Integer id, T entiy);

	@RequestMapping(value = "{id}", method = RequestMethod.PATCH, consumes = {
		"application/merge-patchjson;charset=UTF-8" })
	ResponseEntity<Void> updatePartially(@PathVariable("id") Integer id, T entity);

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	ResponseEntity<Void> delete(@PathVariable("id") Integer id);

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {
		MediaTypes.HAL_JSON_VALUE })
	ResponseEntity<Resource<T>> find(@PathVariable("id") Integer id);

	@RequestMapping(method = RequestMethod.GET, produces = { MediaTypes.HAL_JSON_VALUE })
	ResponseEntity<Resource<Page<T>>> findAll(
			@RequestParam(value = "page", required = false) int page,
			@RequestParam(value = "size", required = false) int size,
			@RequestParam(value = "sort", required = false) String[] sort,
			@RequestParam("projection") String projection);

	@RequestMapping(value = "/search", method = RequestMethod.POST, consumes = {
		MediaType.APPLICATION_JSON_UTF8_VALUE }, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	ResponseEntity<Page<T>> search(SearchCriteria criteria);

}
