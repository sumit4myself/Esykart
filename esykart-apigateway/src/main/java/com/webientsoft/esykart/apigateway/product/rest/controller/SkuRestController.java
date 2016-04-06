package com.webientsoft.esykart.apigateway.product.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.apigateway.product.service.SkuService;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.SkuModel;

@RestController
@RequestMapping(value = "/sku")
public class SkuRestController {

	@Autowired
	private SkuService skuService;

	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json" })
	public long save(SkuModel entity) {
		return skuService.save(entity);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = { "application/json" }, produces = {
			"application/json" })
	public void update(@PathVariable("id") long id, SkuModel entity) {
		skuService.update(id, entity);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = { "application/json" })
	public SkuModel find(@PathVariable("id") long id) {
		return skuService.find(id);
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	public PaginatedDataModel search(FilterModel model) {
		return skuService.search(model);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = { "application/json" })
	public void changeStatus(@PathVariable("id") long id, @RequestParam("status") Status status) {
		skuService.changeStatus(id, status);
	}

}
