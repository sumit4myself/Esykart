/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.common.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;

import com.webientsoft.esykart.common.model.SearchCriteria;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public interface CrudServiceWithSearch<T> extends CrudService<T> {

	
	ResponseEntity<PagedResources<Resource<T>>> findAll(Integer page, Integer size, List<String> sort,
			String projection);

	ResponseEntity<Page<T>> search(SearchCriteria criteria);
}
