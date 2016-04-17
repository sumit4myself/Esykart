/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.offer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.common.service.client.CrudServiceClientWithSearch;
import com.webientsoft.esykart.api.common.service.impl.CrudServiceWithSearchImpl;
import com.webientsoft.esykart.api.offer.model.OfferModel;
import com.webientsoft.esykart.api.offer.service.OfferService;
import com.webientsoft.esykart.api.offer.service.client.OfferServiceClient;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@Service
public class OfferServiceImpl extends CrudServiceWithSearchImpl<OfferModel>
		implements OfferService {

	@Autowired
	private OfferServiceClient offerServiceClient;

	@Override
	protected CrudServiceClientWithSearch<OfferModel> getServiceClientWithSearch() {
		return offerServiceClient;
	}
}