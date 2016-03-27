
package com.webientsoft.esykart.product.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.product.entity.Product;
import com.webientsoft.esykart.product.repository.ProductRepository;

@RepositoryRestController
@RequestMapping(value = "/products")
public class ProductRestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(
			ProductRestController.class);

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping(method = RequestMethod.POST, consumes = {
		"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Integer> save(@RequestBody Product product) {
		return ResponseEntity.ok(productRepository.save(product).getId());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = {
		"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> update(@PathVariable("id") int id,
			@RequestBody Product product) {
		productRepository.save(product);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", params = "status", method = RequestMethod.DELETE, consumes = {
		"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> changeStatus(@PathVariable("id") int id,
			@RequestParam("status") Status status) {
		productRepository.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<Product> getDetail(@PathVariable("id") int id) {
		return ResponseEntity.ok(productRepository.findOne(id));
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<PaginatedDataModel> findAll(FilterModel model) {
		return ResponseEntity.ok(null);
	}

}
