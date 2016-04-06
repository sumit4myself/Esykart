
package com.webientsoft.esykart.user.rest.controller;

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
import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.user.entity.User;
import com.webientsoft.esykart.user.repository.UserRepository;

@RequestMapping(value = "/users")
@RepositoryRestController
public class UserRepositoryRestController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST, consumes = {
			"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<User> authenticate(@RequestBody AuthenticationModel model) {
		return ResponseEntity.ok(userRepository.authenticate(model.getUserName(), model.getPassword()));
	}

	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Integer> save(@RequestBody User user) {
		return ResponseEntity.ok(userRepository.save(user).getUserId());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = { "application/json" }, produces = {
			"application/json" })
	public @ResponseBody ResponseEntity<Void> update(@PathVariable("id") int id, @RequestBody User user) {
		userRepository.save(user);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", params = "status", method = RequestMethod.DELETE, consumes = {
			"application/json" }, produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> changeStatus(@PathVariable("id") int id,
			@RequestParam("status") Status status) {
		userRepository.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<User> find(@PathVariable("id") int id) {
		return ResponseEntity.ok(userRepository.findOne(id));
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<PaginatedDataModel> search(@RequestBody FilterModel model) {
		return ResponseEntity.ok(userRepository.search(model));
	}

}
