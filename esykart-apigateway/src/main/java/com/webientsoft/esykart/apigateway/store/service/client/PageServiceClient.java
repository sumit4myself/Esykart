
package com.webientsoft.esykart.apigateway.store.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.PageModel;

/**
 * 
 * @author SumitS2
 */

@FeignClient("STORE-SERVICE")
public interface PageServiceClient {

	String BASE_PATH = "/stores/page";

	@RequestMapping(value = BASE_PATH, method = RequestMethod.POST, consumes = {
		"application/json" }, produces = { "application/json" })
	Integer save(PageModel model);

	@RequestMapping(value = BASE_PATH, method = RequestMethod.PUT, consumes = {
		"application/json" }, produces = { "application/json" })
	void update(Integer id, PageModel model);

	@RequestMapping(value = BASE_PATH, method = RequestMethod.GET, consumes = {
		"application/json" }, produces = { "application/json" })
	PageModel find(Integer id);

	@RequestMapping(value = BASE_PATH
			+ "/search", method = RequestMethod.GET, consumes = {
				"application/json" }, produces = { "application/json" })
	PaginatedDataModel search(FilterModel model);

}
