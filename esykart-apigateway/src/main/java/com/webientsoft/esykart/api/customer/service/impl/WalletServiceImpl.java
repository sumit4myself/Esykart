
package com.webientsoft.esykart.api.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.common.service.client.CrudServiceClientWithSearch;
import com.webientsoft.esykart.api.common.service.impl.CrudServiceWithSearchImpl;
import com.webientsoft.esykart.api.customer.service.WalletService;
import com.webientsoft.esykart.api.customer.service.client.WalletServiceClient;
import com.webientsoft.esykart.api.cutomer.model.WalletModel;


/**
 * 
 * @author Rahuls1
 */
@Service
public class WalletServiceImpl  extends CrudServiceWithSearchImpl<WalletModel>
implements WalletService {

	@Autowired
	private WalletServiceClient client;
	
	@Override
	public void add(Integer customerId, Double amount) {
		client.add(customerId,  amount);
	}

	protected CrudServiceClientWithSearch<WalletModel> getServiceClientWithSearch() {
		return client;
	}
	
}
