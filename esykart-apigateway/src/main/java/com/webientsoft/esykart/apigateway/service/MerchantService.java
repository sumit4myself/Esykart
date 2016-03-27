/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.apigateway.service;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.merchant.MerchantModel;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public interface MerchantService {

	/**
	 * @param merchant
	 * @return
	 */
	Integer save(MerchantModel merchant);

	/**
	 * @param id
	 * @param status
	 */
	void changeStatus(int id, Status status);

	/**
	 * @param id
	 * @return
	 */
	MerchantModel find(int id);

	

}
