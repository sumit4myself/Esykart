/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.product.service;

import org.springframework.http.ResponseEntity;

import com.webientsoft.esykart.api.common.service.CrudServiceWithSearch;
import com.webientsoft.esykart.api.product.model.CategoryAttributeModel;
import com.webientsoft.esykart.common.model.Status;

/**
 * 
 * 
 * @author DeepakT
 * @since 1.0
 */
public interface CategoryAttributeService extends CrudServiceWithSearch<CategoryAttributeModel> {

	ResponseEntity<Void> changeStatus(Integer id, Status status);

}