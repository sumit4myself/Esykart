package com.webientsoft.esykart.apigateway.product.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.apigateway.product.service.CategoryService;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.CategoryModel;


@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json" })
	public long save(CategoryModel entity) {
		return categoryService.save(entity);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = { "application/json" }, produces = {
			"application/json" })
	public void update(@PathVariable("id") long id, CategoryModel entity) {
		categoryService.update(id, entity);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = { "application/json" })
	public CategoryModel find(@PathVariable("id") long id) {
		return categoryService.find(id);
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	public PaginatedDataModel search(FilterModel model) {
		return categoryService.search(model);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = { "application/json" })
	public void changeStatus(@PathVariable("id") long id, @RequestParam("status") Status status) {
		categoryService.changeStatus(id, status);
	}



}
