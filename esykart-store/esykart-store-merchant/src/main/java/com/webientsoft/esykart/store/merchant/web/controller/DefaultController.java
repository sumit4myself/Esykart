package com.webientsoft.esykart.store.merchant.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {

	@RequestMapping("/")
	public String home(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("provider", "WebientSoft");
		return "index";
	}

	@RequestMapping("/provider")
	public @ResponseBody String provider(HttpServletRequest request) {
		HttpSession session = request.getSession();
		return (String) session.getAttribute("provider");
	}

	@RequestMapping(value = "/error", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String error() {
		return " exception occerod";
	}

}
