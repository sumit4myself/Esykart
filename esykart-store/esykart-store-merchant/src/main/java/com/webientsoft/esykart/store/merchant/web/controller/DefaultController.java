package com.webientsoft.esykart.store.merchant.web.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping(value="/error",produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String error() {
		return " exception occerod";
	}
	
}
