
package com.webientsoft.esykart.customer.service.account.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.product.SkuModel;

@FeignClient("apigateway")
public interface WishlistServiceClient {

	String BASE_PATH = "/customers/wishlist";

	@RequestMapping(value = BASE_PATH, method = RequestMethod.POST, consumes = {
		"application/json" })
	void add(SkuModel sku);

	@RequestMapping(value = BASE_PATH, method = RequestMethod.DELETE, consumes = {
		"application/json" })
	void delete(SkuModel sku);

	@RequestMapping(value = BASE_PATH + "/moveToCart", method = RequestMethod.PUT, consumes = {
		"application/json" })
	void moveToCart(SkuModel sku);

}
