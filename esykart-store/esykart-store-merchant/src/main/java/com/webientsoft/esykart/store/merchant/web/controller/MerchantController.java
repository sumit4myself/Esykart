package com.webientsoft.esykart.store.merchant.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webientsoft.esykart.store.merchant.service.MerchantService;
import com.webientsoft.esykart.store.merchant.web.model.RegisterModel;

@Controller
public class MerchantController {

	@Autowired
	private MerchantService merchantService;

	@RequestMapping("/register")
	public String register(@ModelAttribute("registerModel") RegisterModel registerModel, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "register";
		}
		merchantService.save(registerModel);

		return "merchant/register";
	}
	
	
}
