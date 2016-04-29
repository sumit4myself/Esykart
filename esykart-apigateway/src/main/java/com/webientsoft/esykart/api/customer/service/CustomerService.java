/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.customer.service;

import org.springframework.http.ResponseEntity;

import com.webientsoft.esykart.api.common.service.CrudServiceWithSearch;
import com.webientsoft.esykart.api.cutomer.model.CustomerModel;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.AuthenticationModel;


/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public interface CustomerService extends CrudServiceWithSearch<CustomerModel>{

	ResponseEntity<Void> changeStatus(Integer id, Status status);

	ResponseEntity<CustomerModel> authenticate(AuthenticationModel model);

}
