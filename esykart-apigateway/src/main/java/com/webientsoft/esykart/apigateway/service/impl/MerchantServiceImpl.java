/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.apigateway.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.apigateway.service.MerchantService;
import com.webientsoft.esykart.apigateway.service.client.MerchantServiceClient;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.merchant.MerchantModel;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@Service
public class MerchantServiceImpl implements MerchantService {

	private static final Logger LOGGER = LoggerFactory.getLogger(
			MerchantServiceImpl.class);

	@Autowired
	private MerchantServiceClient client;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.webientsoft.esykart.apigateway.service.MerchantService#save(com.webientsoft.
	 * esykart.common.model.merchant.Merchant)
	 */
	@Override
	public Integer save(MerchantModel merchant) {
		return client.save(merchant);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.webientsoft.esykart.apigateway.service.MerchantService#changeStatus(int,
	 * com.webientsoft.esykart.common.model.Status)
	 */
	@Override
	public void changeStatus(int id, Status status) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Auto-generated method stub");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.webientsoft.esykart.apigateway.service.MerchantService#find(int)
	 */
	@Override
	public MerchantModel find(int id) {
		LOGGER.debug("************** Getting merchant details **************"+client);
		return client.find(id);
	}

}
