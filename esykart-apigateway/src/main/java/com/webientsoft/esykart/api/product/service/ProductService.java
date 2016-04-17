/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.product.service;

import org.springframework.http.ResponseEntity;

import com.webientsoft.esykart.api.common.service.CrudServiceWithSearch;
import com.webientsoft.esykart.api.product.model.ProductModel;
import com.webientsoft.esykart.common.model.Status;

public interface ProductService extends CrudServiceWithSearch<ProductModel> {

	ResponseEntity<Void> changeStatus(Integer id, Status status);

}
