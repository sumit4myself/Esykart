package com.webientsoft.esykart.merchant.service;

import com.webientsoft.esykart.common.model.merchant.StoreDetailsModel;

public interface StoreDetailsService {
	void save(StoreDetailsModel model);

	void update(Integer id, StoreDetailsModel model);

	StoreDetailsModel find(Integer id);
}
