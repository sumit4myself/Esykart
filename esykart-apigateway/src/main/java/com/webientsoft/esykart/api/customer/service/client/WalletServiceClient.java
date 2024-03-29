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

package com.webientsoft.esykart.api.customer.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webientsoft.esykart.api.common.service.client.CrudServiceClientWithSearch;
import com.webientsoft.esykart.api.cutomer.model.WalletModel;
import com.webientsoft.esykart.services.Services;

/**
 * 
 * @author Rahuls1
 */
@RequestMapping("/wallet")
@FeignClient(Services.CUSTOMER_SERVICE)
public interface WalletServiceClient  extends CrudServiceClientWithSearch<WalletModel>{

	@RequestMapping(value = "/{id}/{amount}", method = RequestMethod.PUT, consumes = {
	"application/merge-patch+json;charset=UTF-8" }, produces = {
		MediaType.APPLICATION_JSON_UTF8_VALUE })
ResponseEntity<Void> add(@PathVariable("id") Integer id,
		@RequestParam(value = "amount") Double amount);
	
}
