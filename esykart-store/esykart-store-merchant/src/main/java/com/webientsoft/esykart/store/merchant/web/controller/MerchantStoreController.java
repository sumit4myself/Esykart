/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.store.merchant.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@Controller
public class MerchantStoreController {

	@RequestMapping("/")
	public String home(HttpServletRequest request) {
		return "index";
	}

}
