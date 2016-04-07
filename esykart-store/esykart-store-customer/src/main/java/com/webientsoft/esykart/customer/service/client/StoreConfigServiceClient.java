package com.webientsoft.esykart.customer.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.user.UserModel;

@FeignClient("apigateway")
public interface StoreConfigServiceClient {
	
	String BASE_PATH = "/stores";

	@RequestMapping(value = BASE_PATH + "/layout", method = RequestMethod.POST, consumes = {
			"application/json" }, produces = { "application/json" })
	public UserModel layout(AuthenticationModel model);

}
