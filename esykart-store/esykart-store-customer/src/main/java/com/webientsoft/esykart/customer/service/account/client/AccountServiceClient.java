
package com.webientsoft.esykart.customer.service.account.client;

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
