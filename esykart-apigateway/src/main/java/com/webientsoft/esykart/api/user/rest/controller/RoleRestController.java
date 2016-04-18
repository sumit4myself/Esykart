/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */
package com.webientsoft.esykart.api.user.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.api.user.service.RoleService;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.user.RoleModel;

@RestController
@RequestMapping("/roles")
public class RoleRestController {

	@Autowired
	private RoleService roleService;

	@RequestMapping(method = RequestMethod.POST, 
			consumes = { "application/json" }, 
			produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> save(@RequestBody RoleModel role) {
		roleService.save(role);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, 
			consumes = { "application/json" }, 
			produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> update(@PathVariable("id") int id, @RequestBody RoleModel role) {
		roleService.save(role);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", params = "status", method = RequestMethod.DELETE, 
			consumes = {"application/json" }, 
			produces = { "application/json" })
	public @ResponseBody ResponseEntity<Void> changeStatus(@PathVariable("id") int id,
			@RequestParam("status") Status status) {
		roleService.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, 
			produces = "application/json")
	public @ResponseBody ResponseEntity<RoleModel> getDetail(@PathVariable("id") int id) {
		return ResponseEntity.ok(roleService.find(id));
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST, 
			produces = "application/json")
	public @ResponseBody ResponseEntity<PaginatedDataModel> findAll(@RequestBody FilterModel model) {
		return ResponseEntity.ok(roleService.search(model));
	}

}
