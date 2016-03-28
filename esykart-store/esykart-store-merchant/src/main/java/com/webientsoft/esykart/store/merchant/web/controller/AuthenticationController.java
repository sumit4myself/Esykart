package com.webientsoft.esykart.store.merchant.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.user.UserModel;
import com.webientsoft.esykart.store.merchant.service.AuthenticationService;

@Controller
@RequestMapping("/")
public class AuthenticationController {
	
	private static final String REDIRECT_HOME_PAGE = "redirect:home";
	private static final String REDIRECT_LOGIN_PAGE = "redirect:/";
	private static final String LOGIN_PAGE = "login";
	
	@Autowired
	private AuthenticationService authenticationService;

	@RequestMapping(method = RequestMethod.GET)
	public String authenticateGet(@ModelAttribute("AUTHENTICATION_MODEL") AuthenticationModel model ){
		return LOGIN_PAGE;
	}
	
	
	@RequestMapping(value = "authenticate" , method = RequestMethod.POST)
	public String authenticatePost(@ModelAttribute("AUTHENTICATION_MODEL") AuthenticationModel model,HttpSession session){
		UserModel userModel = authenticationService.authenticate(model);
		session.setAttribute("USER_DETAILS", userModel);
		return REDIRECT_HOME_PAGE;
	}
	
	
	@RequestMapping(value = "logout" , method = RequestMethod.GET)
	public String logout(HttpSession session){
		session.invalidate();
		return REDIRECT_LOGIN_PAGE;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/details" , method = RequestMethod.GET,produces = { "application/json" })
	public ResponseEntity<UserModel> details(HttpSession session){
		return ResponseEntity.ok( (UserModel) session.getAttribute("USER_DETAILS"));
	}
	
}
