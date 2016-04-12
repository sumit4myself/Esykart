
package com.webientsoft.esykart.customer.service.store.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.common.model.store.LayoutModel;
import com.webientsoft.esykart.customer.service.store.StoreService;
import com.webientsoft.esykart.customer.service.store.client.StoreClient;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreClient client;

	@Override
	public LayoutModel findLayout() {
		return client.findLayout();
	}

}
