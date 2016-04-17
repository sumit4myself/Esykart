/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.merchant.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webientsoft.esykart.api.common.service.client.CrudServiceClientWithSearch;
import com.webientsoft.esykart.api.merchant.model.MerchantModel;
import com.webientsoft.esykart.services.Services;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@RequestMapping("/merchants")
@FeignClient(Services.MERCHANT_SERVICE)
public interface MerchantServiceClient
		extends CrudServiceClientWithSearch<MerchantModel> {

}
