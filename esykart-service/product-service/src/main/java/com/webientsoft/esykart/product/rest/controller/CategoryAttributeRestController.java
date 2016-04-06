package com.webientsoft.esykart.product.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.product.entity.CategoryAttribute;
import com.webientsoft.esykart.product.repository.CategoryAttributeRepository;

@RepositoryRestController
@RequestMapping(value = "/product/attributes")
public class CategoryAttributeRestController {

	@Autowired
	private CategoryAttributeRepository repository;

	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Integer> save(CategoryAttribute entity) {
		return ResponseEntity.ok(repository.save(entity).getId());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = { "application/json" }, produces = {
			"application/json" })
	public @ResponseBody ResponseEntity<Void> update(@PathVariable("id") Integer id, CategoryAttribute entity) {
		repository.save(entity);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = { "application/json" })
	public @ResponseBody ResponseEntity<CategoryAttribute> find(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(repository.findOne(id));
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	public @ResponseBody ResponseEntity<PaginatedDataModel> search(FilterModel model) {
		return ResponseEntity.ok(repository.search(model));
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> changeStatus(@PathVariable("id") Integer id,
			@RequestParam("status") Status status) {
		repository.changeStatus(id, status);

		return ResponseEntity.noContent().build();
	}

}
