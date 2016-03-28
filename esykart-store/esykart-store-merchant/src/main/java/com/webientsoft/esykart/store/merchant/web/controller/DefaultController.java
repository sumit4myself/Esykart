package com.webientsoft.esykart.store.merchant.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class DefaultController {

	@RequestMapping("/home")
	public String home(HttpSession session) {
//		HttpSession session = request.getSession();
		session.setAttribute("provider", "WebientSoft");
		return "index";
	}

	@RequestMapping("/provider")
	public @ResponseBody String provider(HttpSession session ) {
//		HttpSession session = request.getSession();
		return (String) session.getAttribute("provider");
	}

	@RequestMapping(value = "/error", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String error() {
		return " exception occerod";
	}

}
