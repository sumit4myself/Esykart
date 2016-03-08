package com.webientsoft.esykart.api.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {
	
	@RequestMapping("/customertOrder")
	public String findCustomertOrderDetails() {
		return "findCustomertOrderDetails";
	}

	@RequestMapping("/merchantOrder")
	public String findMerchantOrderDetails() {
		return "findMerchantOrderDetails";
	}
}
