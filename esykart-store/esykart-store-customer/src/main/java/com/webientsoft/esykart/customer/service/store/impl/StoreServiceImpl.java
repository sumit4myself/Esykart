
package com.webientsoft.esykart.customer.service.store.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.common.model.store.LayoutModel;
import com.webientsoft.esykart.customer.service.store.StoreService;
import com.webientsoft.esykart.customer.service.store.client.StoreServiceClient;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreServiceClient client;

	@Override
	public LayoutModel findLayout() {
		return  prepareLayout();//client.findLayout();
	}

	
	private LayoutModel prepareLayout(){
		return null;
		
		
		
		
	}
	
	
}
