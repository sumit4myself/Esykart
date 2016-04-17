/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.payment.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webientsoft.esykart.services.Services;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@RequestMapping("/payments")
@FeignClient(Services.PAYMENT_SERVICE)
public interface PaymentServiceClient {

}
