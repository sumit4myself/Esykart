/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webientsoft.esykart.api.customer.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/account/wallet")
public class WalletController {/*
	
	private static final String FIND_ALL = "wallet/wallet";

	@Autowired
	private WalletService walletService;
	
	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" })
	public ResponseEntity<Void> add(@RequestBody WalletModel model) {
		walletService.add(model.getCustomerId(), model.getAmount());
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" })
	public ResponseEntity<Double> find(@RequestBody WalletModel model) {
		return ResponseEntity.ok(walletService.find(model.getCustomerId()));
	}
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public String registerGet(@RequestParam("id")Integer customerId, Model model) {
        model.addAttribute("AMOUNT",walletService.find(customerId));
		return FIND_ALL;
	}

*/}
