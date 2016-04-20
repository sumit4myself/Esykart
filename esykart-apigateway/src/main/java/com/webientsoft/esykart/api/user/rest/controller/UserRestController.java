/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.user.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.api.common.rest.controller.CrudControllerWithSearch;
import com.webientsoft.esykart.api.common.service.CrudService;
import com.webientsoft.esykart.api.user.service.UserService;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.user.UserModel;

@RestController
@RequestMapping("/users")
public class UserRestController extends CrudControllerWithSearch<UserModel> {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST, consumes = {
		MediaType.APPLICATION_JSON_UTF8_VALUE }, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<UserModel> authenticate(
			@RequestBody AuthenticationModel model) {
		return userService.authenticate(model);
	}

	@RequestMapping(value = "/{id}/changeStatus", method = RequestMethod.PATCH, consumes = {
		"application/merge-patch+json" })
	public ResponseEntity<Void> changeStatus(@PathVariable("id") Integer id,
			@RequestParam("status") Status status) {
		return userService.changeStatus(id, status);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.webientsoft.esykart.api.common.rest.controller.CrudController#getService()
	 */
	@Override
	protected CrudService<UserModel> getService() {
		return userService;
	}
}
