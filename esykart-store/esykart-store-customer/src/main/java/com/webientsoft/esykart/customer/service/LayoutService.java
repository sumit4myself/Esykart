/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.customer.service;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.LayoutModel;

/**
 * 
 * @author SumitS2
 */
public interface LayoutService {

	Integer save(LayoutModel model);

	void update(Integer id, LayoutModel model);

	LayoutModel find(Integer id);
	
	LayoutModel findDefaultLayout();

	PaginatedDataModel search(FilterModel model);

	void changeStatus(int id, Status status);
}
