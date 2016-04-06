package com.webientsoft.esykart.apigateway.product.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.ProductDetailModel;

@FeignClient("PRODUCT-SERVICE")
public interface ProductDetailServiceClient {

	String BASE_PATH = "/product/details";

	@RequestMapping(value = BASE_PATH, method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	long save(ProductDetailModel entity);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.PUT, consumes = {
			"application/json" }, produces = { "application/json" })
	void update(@PathVariable("id") long id, ProductDetailModel entity);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.GET, consumes = {
			"application/json" }, produces = { "application/json" })
	ProductDetailModel find(@PathVariable("id") long id);

	@RequestMapping(value = BASE_PATH + "/search", method = RequestMethod.POST, consumes = {
			"application/json" }, produces = { "application/json" })
	PaginatedDataModel search(FilterModel model);

	@RequestMapping(value = BASE_PATH + "/{id}", method = RequestMethod.DELETE, consumes = {
			"application/json" }, produces = { "application/json" })
	void changeStatus(@PathVariable("id") long id, @RequestParam("status") Status status);

}
