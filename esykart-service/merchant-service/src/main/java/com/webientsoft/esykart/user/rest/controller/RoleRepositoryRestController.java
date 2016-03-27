
package com.webientsoft.esykart.user.rest.controller;

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
import com.webientsoft.esykart.merchant.entity.Merchant;
import com.webientsoft.esykart.merchant.repository.MerchantRepository;

@RequestMapping(value = "/users")
@RepositoryRestController
public class RoleRepositoryRestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(
			RoleRepositoryRestController.class);

	@Autowired
	private MerchantRepository merchantRepository;

	@RequestMapping(method = RequestMethod.POST, consumes = {
		"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Integer> save(@RequestBody Merchant merchant) {
		return ResponseEntity.ok(merchantRepository.save(merchant).getId());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = {
		"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> update(@PathVariable("id") int id,
			@RequestBody Merchant merchant) {
		merchantRepository.save(merchant);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", params = "status", method = RequestMethod.DELETE, consumes = {
		"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> changeStatus(@PathVariable("id") int id,
			@RequestParam("status") Status status) {
		merchantRepository.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<Merchant> getDetail(@PathVariable("id") int id) {
		 return ResponseEntity.ok(merchantRepository.findOne(id));
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<PaginatedDataModel> findAll(FilterModel model) {
		return ResponseEntity.ok(null);
	}

}
