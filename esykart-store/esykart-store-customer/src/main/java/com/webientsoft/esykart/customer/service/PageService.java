/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.customer.service;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.PageModel;

/**
 * 
 * @author SumitS2
 */
public interface PageService {

	Integer save(PageModel model);

	void update(Integer id, PageModel model);

	PageModel find(Integer id);

	PageModel find(String pageName);

	PaginatedDataModel search(FilterModel model);

	void changeStatus(int id, Status status);

}
