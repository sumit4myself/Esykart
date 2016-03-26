package com.webientsoft.esykart.merchant.service;

import com.webientsoft.esykart.common.model.merchant.BusinessDetailsModel;

public interface BusinessDetailsService {
	void save(BusinessDetailsModel model);

	void update(Integer id, BusinessDetailsModel model);

	BusinessDetailsModel find(Integer id);
}
