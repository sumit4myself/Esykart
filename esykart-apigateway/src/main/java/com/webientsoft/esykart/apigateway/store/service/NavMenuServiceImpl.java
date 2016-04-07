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

package com.webientsoft.esykart.apigateway.store.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.webientsoft.esykart.apigateway.store.service.client.NavMenuServiceClient;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.NavMenuModel;


/**
 * 
 * @author SumitS2
 */
public class NavMenuServiceImpl implements NavMenuService {

	@Autowired
	private NavMenuServiceClient client;

	@Override
	public Integer save(NavMenuModel model) {
		return client.save(model);
	}

	@Override
	public void update(Integer id, NavMenuModel model) {
		client.update(id, model);
	}

	@Override
	public NavMenuModel find(Integer id) {
		return client.find(id);
	}

	@Override
	public PaginatedDataModel search(FilterModel model) {
		return client.search(model);
	}

}
