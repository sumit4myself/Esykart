/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.common.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;

import com.webientsoft.esykart.api.common.service.CrudServiceWithSearch;
import com.webientsoft.esykart.api.common.service.client.CrudServiceClientWithSearch;
import com.webientsoft.esykart.common.model.SearchCriteria;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */

public abstract class CrudServiceWithSearchImpl<T> implements CrudServiceWithSearch<T> {

	@Override
	public ResponseEntity<Void> save(T entity) {
		return getServiceClientWithSearch().save(entity);
	}

	@Override
	public ResponseEntity<Void> update(Integer id, T entity) {
		return getServiceClientWithSearch().update(id, entity);
	}

	@Override
	public ResponseEntity<Void> updatePartially(Integer id, T entity) {
		return getServiceClientWithSearch().updatePartially(id, entity);
	}

	@Override
	public ResponseEntity<Void> delete(Integer id) {
		return getServiceClientWithSearch().delete(id);
	}

	@Override
	public ResponseEntity<Resource<T>> find(Integer id,String projection) {
		return getServiceClientWithSearch().find(id,projection);
	}

	@Override
	public ResponseEntity<PagedResources<Resource<T>>> findAll(Integer page, Integer size, List<String> sort,
			String projection) {
		return getServiceClientWithSearch().findAll(page, size, sort, projection);
	}

	@Override
	public ResponseEntity<Page<T>> search(SearchCriteria criteria) {
		return getServiceClientWithSearch().search(criteria);
	}

	protected abstract CrudServiceClientWithSearch<T> getServiceClientWithSearch();

}
