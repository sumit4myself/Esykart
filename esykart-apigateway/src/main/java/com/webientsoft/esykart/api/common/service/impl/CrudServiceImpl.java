/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.common.service.impl;

import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;

import com.webientsoft.esykart.api.common.service.CrudService;
import com.webientsoft.esykart.api.common.service.client.CrudServiceClient;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public abstract class CrudServiceImpl<T> implements CrudService<T> {

	@Override
	public ResponseEntity<Void> save(T entity) {
		return getServiceClient().save(entity);
	}

	@Override
	public ResponseEntity<Void> update(Integer id, T entity) {
		return getServiceClient().update(id, entity);
	}

	@Override
	public ResponseEntity<Void> updatePartially(Integer id, T entity) {
		return getServiceClient().updatePartially(id, entity);
	}

	@Override
	public ResponseEntity<Void> delete(Integer id) {
		return getServiceClient().delete(id);
	}

	@Override
	public ResponseEntity<Resource<T>> find(Integer id) {
		return getServiceClient().find(id);
	}

	protected abstract CrudServiceClient<T> getServiceClient();

}
