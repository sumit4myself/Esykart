package com.webientsoft.esykart.api.rest.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.user.UserModel;

@RestController
@RequestMapping("/user")
public class AuthenticationController {

	@RequestMapping(value = "authenticate", method = RequestMethod.POST)
	public UserModel authenticatePost(@RequestBody AuthenticationModel model) {

		System.out.println(model);
		return null;
	}

}
