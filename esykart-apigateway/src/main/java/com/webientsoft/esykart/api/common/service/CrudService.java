/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.common.service;

import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public interface CrudService<T> {

	ResponseEntity<Void> save(T entity);

	ResponseEntity<Void> update(Integer id, T entity);

	ResponseEntity<Void> updatePartially(Integer id, T entity);

	ResponseEntity<Void> delete(Integer id);

	ResponseEntity<Resource<T>> find(Integer id);

}
