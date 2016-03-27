/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.customer.repository;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.customer.entity.Customer;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */

public interface CustomerRepository
		extends BaseRepository<Customer, Integer>, CustomerRepositoryCustom {

	/**
	 * @param id
	 * @param status
	 */
	void changeStatus(int id, Status status);

}
