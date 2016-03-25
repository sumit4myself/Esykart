package com.webientsoft.esykart.store.merchant.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class AuthenticationController {
	
	private static final String REDIRECT_HOME_PAGE = "redirect:home";
	
	private static final String LOGIN_PAGE = "login";

	@RequestMapping(method = RequestMethod.GET)
	public String authenticateGet(){
		return LOGIN_PAGE;
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String authenticatePost(HttpSession session){
		
		return REDIRECT_HOME_PAGE;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/details" , method = RequestMethod.GET)
	public String details(HttpSession session){
		
		return REDIRECT_HOME_PAGE;
	}
	
}
