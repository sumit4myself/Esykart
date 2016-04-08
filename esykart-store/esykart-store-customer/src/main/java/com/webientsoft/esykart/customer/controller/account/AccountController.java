
package com.webientsoft.esykart.customer.controller.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webientsoft.esykart.common.model.user.UserModel;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	private static final String LOGIN_VIEW    = "account/login";
	private static final String REGISTER_VIEW = "account/register";
	private static final String REDIRECT_HOME_VIEW = "redirect:/";

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginGet(@ModelAttribute("MODEL") UserModel model) {

		return LOGIN_VIEW;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(@ModelAttribute("MODEL") UserModel model) {

		return REDIRECT_HOME_VIEW;
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerGet(@ModelAttribute("MODEL") UserModel model) {

		return REGISTER_VIEW;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPost(@ModelAttribute("MODEL") UserModel model) {

		return REDIRECT_HOME_VIEW;
	}

}
