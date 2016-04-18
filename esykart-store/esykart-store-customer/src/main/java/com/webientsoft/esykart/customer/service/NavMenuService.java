/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.customer.service;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.NavMenuModel;

/**
 * 
 * @author SumitS2
 */
public interface NavMenuService {

	Integer save(NavMenuModel model);

	void update(Integer id, NavMenuModel model);

	NavMenuModel find(Integer id);

	PaginatedDataModel search(FilterModel model);

	void changeStatus(int id, Status status);
}
