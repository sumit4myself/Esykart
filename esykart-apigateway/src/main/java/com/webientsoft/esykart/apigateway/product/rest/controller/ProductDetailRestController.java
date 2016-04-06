package com.webientsoft.esykart.apigateway.product.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.apigateway.product.service.ProductDetailService;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.ProductDetailModel;

@RestController
@RequestMapping("/product/details")
public class ProductDetailRestController {

	@Autowired
	private ProductDetailService productDetailService;

	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json" })
	public long save(@RequestBody ProductDetailModel entity) {
		return productDetailService.save(entity);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = { "application/json" }, produces = {
			"application/json" })
	public void update(@PathVariable("id") long id, ProductDetailModel entity) {
		productDetailService.update(id, entity);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = { "application/json" })
	public ProductDetailModel find(@PathVariable("id") long id) {
		return productDetailService.find(id);
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	public PaginatedDataModel search(@RequestBody FilterModel model) {
		return productDetailService.search(model);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = { "application/json" })
	public void changeStatus(@PathVariable("id") long id, @RequestParam("status") Status status) {
		productDetailService.changeStatus(id, status);
	}

}
