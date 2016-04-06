package com.webientsoft.esykart.product.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.product.entity.ProductDetail;
import com.webientsoft.esykart.product.repository.ProductDetailRepository;

@RepositoryRestController
@RequestMapping("/product/details")
public class ProductDetailRestController {

	@Autowired
	private ProductDetailRepository productDetailService;

	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json" })
	public ResponseEntity<Integer> save(@RequestBody ProductDetail entity) {
		return ResponseEntity.ok(productDetailService.save(entity).getId());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = { "application/json" }, produces = {
			"application/json" })
	public ResponseEntity<Void> update(@PathVariable("id") Integer id, ProductDetail entity) {
		productDetailService.save(entity);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<ProductDetail> find(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(productDetailService.findOne(id));
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	public ResponseEntity<PaginatedDataModel> search(@RequestBody FilterModel model) {
		return ResponseEntity.ok(productDetailService.search(model));
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = { "application/json" })
	public ResponseEntity<Void> changeStatus(@PathVariable("id") Integer id, @RequestParam("status") Status status) {
		productDetailService.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}

}
