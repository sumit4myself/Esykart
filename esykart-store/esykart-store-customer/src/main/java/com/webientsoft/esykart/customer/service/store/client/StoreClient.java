
package com.webientsoft.esykart.customer.service.store.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.store.LayoutModel;

@FeignClient("STORE-SERVICE")
public interface StoreClient {

	String BASE_PATH = "/stores";

	@RequestMapping(value = BASE_PATH, method = RequestMethod.GET, consumes = {
		"application/json" }, produces = { "application/json" })
	LayoutModel findLayout();

}
