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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.api.common.rest.controller.CrudControllerWithSearch;
import com.webientsoft.esykart.api.common.service.CrudService;
import com.webientsoft.esykart.api.customer.service.WalletService;
import com.webientsoft.esykart.api.cutomer.model.WalletModel;



@RestController
@RequestMapping("/wallet")
public class WalletRestController extends CrudControllerWithSearch<WalletModel>{
	

	@Autowired
	private WalletService walletService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = { "application/json" })
	public ResponseEntity<Void> add(@RequestBody WalletModel model) {
		walletService.add(model.getCustomerId(), model.getAmount());
		return ResponseEntity.noContent().build();
	}

	@Override
	protected CrudService<WalletModel> getService() {
		return walletService;
	}
	
}
