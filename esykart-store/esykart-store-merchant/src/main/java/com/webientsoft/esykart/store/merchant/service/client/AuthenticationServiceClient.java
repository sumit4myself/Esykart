package com.webientsoft.esykart.store.merchant.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.user.UserModel;

@FeignClient("apigateway")
public interface AuthenticationServiceClient {

	String BASE_PATH = "/users";

	@RequestMapping(value = BASE_PATH + "/authenticate", method = RequestMethod.POST, consumes = {
			"application/json" }, produces = { "application/json" })
	public UserModel authenticate(AuthenticationModel model);

}
