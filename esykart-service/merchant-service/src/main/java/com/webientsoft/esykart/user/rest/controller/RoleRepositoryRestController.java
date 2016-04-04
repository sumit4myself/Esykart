
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
import com.webientsoft.esykart.user.entity.Role;
import com.webientsoft.esykart.user.repository.RoleRepository;

@RequestMapping(value = "/roles")
@RepositoryRestController
public class RoleRepositoryRestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(RoleRepositoryRestController.class);

	@Autowired
	private RoleRepository roleRepository;

	@RequestMapping(method = RequestMethod.POST, 
			consumes = { "application/json" }, 
			produces = { "application/json" })
	public @ResponseBody ResponseEntity<Integer> save(@RequestBody Role role) {
		return ResponseEntity.ok(roleRepository.save(role).getRoleId());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, 
			consumes = {"application/json" }, 
			produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> update(@PathVariable("id") int id,
			@RequestBody Role role) {
		roleRepository.save(role);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", params = "status", method = RequestMethod.DELETE, 
			consumes = {"application/json" }, 
			produces = {"application/json" })
	public @ResponseBody ResponseEntity<Void> changeStatus(@PathVariable("id") int id,
			@RequestParam("status") Status status) {
		roleRepository.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<Role> getDetail(@PathVariable("id") int id) {
		 return ResponseEntity.ok(roleRepository.findOne(id));
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody ResponseEntity<PaginatedDataModel> findAll(@RequestBody FilterModel model) {
		return ResponseEntity.ok(roleRepository.search(model));
	}

}
