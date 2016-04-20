/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.user.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.api.common.rest.controller.CrudControllerWithSearch;
import com.webientsoft.esykart.api.common.service.CrudService;
import com.webientsoft.esykart.api.user.service.RoleService;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.user.RoleModel;

@RestController
@RequestMapping("/roles")
public class RoleRestController extends CrudControllerWithSearch<RoleModel> {

	@Autowired
	private RoleService roleService;

	@RequestMapping(value = "/{id}/changeStatus", method = RequestMethod.PATCH, consumes = {
		"application/merge-patch+json" })
	public ResponseEntity<Void> changeStatus(@PathVariable("id") Integer id,
			@RequestParam("status") Status status) {
		return roleService.changeStatus(id, status);
	}

	@Override
	protected CrudService<RoleModel> getService() {
		return roleService;
	}

}