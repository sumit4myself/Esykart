
package com.webientsoft.esykart.user.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.user.repository.RoleRepository;

@RequestMapping(value = "/roles")
@RepositoryRestController
public class RoleRepositoryRestController {

	@Autowired
	private RoleRepository roleRepository;

	@RequestMapping(value = "/{id}/changeStatus", params = "status", method = RequestMethod.PATCH, consumes = {
		"application/merge-patchjson;charset=UTF-8" })
	public @ResponseBody ResponseEntity<Void> changeStatus(@PathVariable("id") int id,
			@RequestParam("status") Status status) {
		roleRepository.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}

}
