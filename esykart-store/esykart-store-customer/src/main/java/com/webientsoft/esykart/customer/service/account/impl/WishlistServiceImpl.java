
package com.webientsoft.esykart.customer.service.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.common.model.product.SkuModel;
import com.webientsoft.esykart.customer.service.account.WishlistService;
import com.webientsoft.esykart.customer.service.account.client.WishlistServiceClient;

@Service
public class WishlistServiceImpl implements WishlistService {

	@Autowired
	private WishlistServiceClient client;

	@Override
	public void add(SkuModel sku) {
		client.add(sku);
	}

	@Override
	public void delete(SkuModel sku) {
		client.delete(sku);
	}

	@Override
	public void moveToCart(SkuModel sku) {
		client.moveToCart(sku);
	}

}
