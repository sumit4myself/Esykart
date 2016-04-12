
package com.webientsoft.esykart.customer.service.account.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.order.OrderModel;
import com.webientsoft.esykart.common.model.user.UserModel;

@FeignClient("apigateway")
public interface OrderServiceClient {

	String BASE_PATH = "/orders";

	@RequestMapping(value = BASE_PATH, method = RequestMethod.GET, consumes = {
		"application/json" }, produces = { "application/json" })
	OrderModel find(UserModel model);

	@RequestMapping(value = BASE_PATH +"/search", method = RequestMethod.POST, consumes = {
		"application/json" }, produces = { "application/json" })
	PaginatedDataModel search(FilterModel model);

}
