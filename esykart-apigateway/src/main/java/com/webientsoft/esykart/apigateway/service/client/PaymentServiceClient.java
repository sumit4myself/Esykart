/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.apigateway.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@FeignClient("PAYMENT-SERVICE")
public interface PaymentServiceClient {

}
