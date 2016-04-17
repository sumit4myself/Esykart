
package com.webientsoft.esykart.store.merchant.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MerchantController {

	@RequestMapping("/register")
	public String registerMerchant() {
		return "merchant/register";
	}

	@RequestMapping("/bankDetails")
	public String saveMerchantBankDetails() {
		return "merchant/bankDetails";
	}

	@RequestMapping("/storeDetails")
	public String saveStoreDetails() {
		return "merchant/storeDetails";
	}

	@RequestMapping("/businessDetails")
	public String saveBusinessDetails() {
		return "merchant/businessDetails";
	}
}
