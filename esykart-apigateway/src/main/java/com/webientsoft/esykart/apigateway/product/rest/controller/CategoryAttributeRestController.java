package com.webientsoft.esykart.apigateway.product.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webientsoft.esykart.apigateway.product.service.ProductService;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.ProductModel;

public class CategoryAttributeRestController {

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json" })
	public long save(ProductModel entity) {
		return productService.save(entity);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = { "application/json" }, produces = {
			"application/json" })
	public void update(@PathVariable("id") long id, ProductModel entity) {
		productService.update(id, entity);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = { "application/json" })
	public ProductModel find(@PathVariable("id") long id) {
		return productService.find(id);
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	public PaginatedDataModel search(FilterModel model) {
		return productService.search(model);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = { "application/json" })
	public void changeStatus(@PathVariable("id") long id, @RequestParam("status") Status status) {
		productService.changeStatus(id, status);
	}

}
