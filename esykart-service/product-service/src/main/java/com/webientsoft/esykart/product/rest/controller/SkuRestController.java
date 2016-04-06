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
import com.webientsoft.esykart.product.entity.Sku;
import com.webientsoft.esykart.product.repository.SkuRepository;

@RepositoryRestController
@RequestMapping(value = "/sku")
public class SkuRestController {

	@Autowired
	private SkuRepository skuRepository;

	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Integer> save(Sku entity) {
		return ResponseEntity.ok(skuRepository.save(entity).getId());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = { "application/json" }, produces = {
			"application/json" })
	public @ResponseBody ResponseEntity<Void> update(@PathVariable("id") Integer id, Sku entity) {
		skuRepository.save(entity);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Sku> find(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(skuRepository.findOne(id));
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	public @ResponseBody ResponseEntity<PaginatedDataModel> search(FilterModel model) {
		return ResponseEntity.ok(skuRepository.search(model));
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> changeStatus(@PathVariable("id") Integer id,
			@RequestParam("status") Status status) {
		skuRepository.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}

}
