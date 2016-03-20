package com.webientsoft.esykart.merchant.service;

import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.merchant.model.MerchantModel;
import com.webientsoft.esykart.common.model.Status;

public interface MerchantService {

	void save(MerchantModel model);

	void update(Integer id, MerchantModel model);

	MerchantModel find(Integer id);

	PaginatedDataModel search(FilterModel model);

	void changeStatus(Integer id, Status status);
}
