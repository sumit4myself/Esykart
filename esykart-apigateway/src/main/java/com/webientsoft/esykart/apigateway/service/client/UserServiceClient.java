package com.webientsoft.esykart.apigateway.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.user.UserModel;

/**
 * 
 * @author Sumit Kumar Sharma
 * @since 1.0
 * 
 */

@FeignClient("MERCHANT-SERVICE")
public interface UserServiceClient {

	String BASE_PATH = "/users";

	@RequestMapping(value = BASE_PATH + "/authenticate", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	UserModel authenticate(@RequestBody AuthenticationModel model);

	@RequestMapping(value = BASE_PATH, method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	void save(@RequestBody UserModel model);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.PUT, consumes = {
			"application/json" }, produces = { "application/json" })
	void update(@PathVariable("id") long id, @RequestBody UserModel model);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.GET, produces = { "application/json" })
	UserModel find(@PathVariable("id") long id);

	@RequestMapping(value = BASE_PATH + "/search", method = RequestMethod.GET, produces = { "application/json" })
	PaginatedDataModel search(@RequestBody FilterModel model);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.DELETE)
	void changeStatus(@PathVariable("id") Integer id, @RequestParam("status") Status status);

}
