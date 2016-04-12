
package com.webientsoft.esykart.apigateway.store.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.BannerModel;

/**
 * 
 * @author SumitS2
 */

@FeignClient("STORE-SERVICE")
public interface BannerServiceClient {

	String BASE_PATH = "/stores/banner";

	@RequestMapping(value = BASE_PATH, method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json" })
	Integer save(BannerModel model);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.PUT, consumes = { "application/json" }, produces = { "application/json" })
	void update(@PathVariable("id") Integer id, BannerModel model);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.GET, consumes = { "application/json" }, produces = { "application/json" })
	BannerModel find(@PathVariable("id") Integer id);

	@RequestMapping(value = BASE_PATH + "/search", method = RequestMethod.GET, consumes = { "application/json" }, produces = { "application/json" })
	PaginatedDataModel search(FilterModel model);

}
