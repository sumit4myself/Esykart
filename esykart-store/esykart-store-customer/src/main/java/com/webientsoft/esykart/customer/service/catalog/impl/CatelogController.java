package com.webientsoft.esykart.customer.service.catalog.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author SumitS2
 */

@Controller
@RequestMapping("/")
public class CatelogController {

	@RequestMapping(method = RequestMethod.GET)
	public String home(){
		return "layout/home";
	}
	
}
