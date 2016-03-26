package com.webientsoft.esykart.store.merchant.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webientsoft.esykart.common.model.merchant.BankDetailsModel;
import com.webientsoft.esykart.common.model.merchant.BusinessDetailsModel;
import com.webientsoft.esykart.common.model.merchant.StoreDetailsModel;
import com.webientsoft.esykart.store.merchant.service.MerchantService;
import com.webientsoft.esykart.store.merchant.web.model.RegisterModel;

@Controller
public class MerchantController {

	@Autowired
	private MerchantService merchantService;

	@RequestMapping("/register")
	public String registerMerchant(@ModelAttribute("registerModel") RegisterModel registerModel, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "merchant/register";
		}
		merchantService.save(registerModel);
		return "merchant/register";
	}
	
	@RequestMapping("/bankDetails")
	public String saveMerchantBankDetails(@ModelAttribute("bankDetailsModel") BankDetailsModel bankDetailsModel, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "merchant/bankDetails";
		}
		return "merchant/bankDetails";
	}
	
	@RequestMapping("/storeDetails")
	public String saveStoreDetails(@ModelAttribute("storeDetailsModel") StoreDetailsModel storeDetailsModel, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "merchant/storeDetails";
		}
		return "merchant/storeDetails";
	}
	
	@RequestMapping("/businessDetails")
	public String saveBusinessDetails(@ModelAttribute("businessDetailsModel") BusinessDetailsModel businessDetailsModel, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "merchant/businessDetails";
		}
		return "merchant/businessDetails";
	}
}
