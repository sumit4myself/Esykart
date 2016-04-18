/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */
package com.webientsoft.esykart.api.customer.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.user.UserModel;

@FeignClient("apigateway")
public interface AccountServiceClient {

	String BASE_PATH = "/customers";

	@RequestMapping(value = BASE_PATH
			+ "/authenticate", method = RequestMethod.POST, consumes = {
				"application/json" })
	void authenticate(UserModel model);

	@RequestMapping(value = BASE_PATH
			+ "/register", method = RequestMethod.POST, consumes = { "application/json" })
	void register(UserModel model);

}
