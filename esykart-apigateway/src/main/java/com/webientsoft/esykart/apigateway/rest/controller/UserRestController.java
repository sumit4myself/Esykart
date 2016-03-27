package com.webientsoft.esykart.apigateway.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.apigateway.service.UserService;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.user.UserModel;

@RestController
@RequestMapping("/users")
public class UserRestController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST, consumes = {
			"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<UserModel> authenticate(@RequestBody AuthenticationModel model) {
		return ResponseEntity.ok(userService.authenticate(model));
	}

	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> save(@RequestBody UserModel user) {
		userService.save(user);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = { "application/json" }, produces = {
			"application/json" })
	public @ResponseBody ResponseEntity<Void> update(@PathVariable("id") int id, @RequestBody UserModel user) {
		userService.save(user);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", params = "status", method = RequestMethod.DELETE, consumes = {
			"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> changeStatus(@PathVariable("id") int id,
			@RequestParam("status") Status status) {
		userService.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<UserModel> getDetail(@PathVariable("id") int id) {
		return ResponseEntity.ok(userService.find(id));
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<PaginatedDataModel> findAll(@RequestBody FilterModel model) {

		return ResponseEntity.ok(null);
	}

}
