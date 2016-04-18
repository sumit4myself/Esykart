/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.customer.service;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.store.BannerModel;

/**
 * 
 * @author SumitS2
 */
public interface BannerService {

	Integer save(BannerModel model);

	void update(Integer id, BannerModel model);

	BannerModel find(Integer id);

	void changeStatus(int id, Status status);

	PaginatedDataModel search(FilterModel model);

}
