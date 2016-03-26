package com.webientsoft.esykart.merchant.service;

import com.webientsoft.esykart.common.model.merchant.BankDetailsModel;

public interface BankDetailsService {

	void save(BankDetailsModel model);

	void update(Integer id, BankDetailsModel model);

	BankDetailsModel find(Integer id);
}
