
package com.webientsoft.esykart.store.merchant.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {

	private static final String REDIRECT_LOGIN_PAGE = "redirect:/";

	@RequestMapping("/home")
	public String home(HttpSession session) {
		if (session.getAttribute("USER_DETAILS") == null) {
			return REDIRECT_LOGIN_PAGE;
		}
		return "index";
	}

	@RequestMapping(value = "/error", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String error() {
		return " exception occerod";
	}

}
