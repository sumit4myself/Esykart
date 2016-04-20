
package com.webientsoft.esykart.user.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.user.entity.User;
import com.webientsoft.esykart.user.repository.UserRepository;

@RequestMapping(value = "/users")
@RepositoryRestController
public class UserRepositoryRestController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST, consumes = {
		MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody ResponseEntity<User> authenticate(@RequestBody User user) {
		return ResponseEntity.ok(
				userRepository.authenticate(user.getUserName(), user.getPassword()));
	}

	@RequestMapping(value = "/{id}/changeStatus", params = "status", method = RequestMethod.PATCH, consumes = {
		"application/merge-patchjson;charset=UTF-8" })
	public @ResponseBody ResponseEntity<Void> changeStatus(@PathVariable("id") int id,
			@RequestParam("status") Status status) {
		userRepository.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}

}
