package com.webientsoft.esykart.apigateway.store.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.LayoutModel;

/**
 * 
 * @author SumitS2
 */

@FeignClient("STORE-SERVICE")
public interface LayoutServiceClient {

	String BASE_PATH = "/stores/layout";

	@RequestMapping(value = BASE_PATH, method = RequestMethod.POST, consumes = {
		"application/json" }, produces = { "application/json" })
	Integer save(LayoutModel model);

	@RequestMapping(value = BASE_PATH, method = RequestMethod.PUT, consumes = {
		"application/json" }, produces = { "application/json" })
	void update(Integer id, LayoutModel model);

	@RequestMapping(value = BASE_PATH, method = RequestMethod.GET, consumes = {
		"application/json" }, produces = { "application/json" })
	LayoutModel find(Integer id);

	@RequestMapping(value = BASE_PATH +"/search", method = RequestMethod.GET, consumes = {
		"application/json" }, produces = { "application/json" })
	PaginatedDataModel search(FilterModel model);

}
