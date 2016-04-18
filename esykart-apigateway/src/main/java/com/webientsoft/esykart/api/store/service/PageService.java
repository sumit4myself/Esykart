/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.store.service;

import org.springframework.http.ResponseEntity;

import com.webientsoft.esykart.api.common.service.CrudServiceWithSearch;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.store.PageModel;

/**
 * 
 * @author SumitS2
 */
public interface PageService extends CrudServiceWithSearch<PageModel> {

	ResponseEntity<Void> changeStatus(Integer id, Status status);

}
