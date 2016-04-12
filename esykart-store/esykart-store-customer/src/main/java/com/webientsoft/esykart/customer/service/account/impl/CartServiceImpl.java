
package com.webientsoft.esykart.customer.service.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.common.model.product.SkuModel;
import com.webientsoft.esykart.customer.service.account.CartService;
import com.webientsoft.esykart.customer.service.account.client.CartServiceClient;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartServiceClient client;

	@Override
	public void add(SkuModel sku) {
		client.add(sku);
	}

	@Override
	public void delete(SkuModel sku) {
		client.delete(sku);
	}

	@Override
	public void moveToWishlist(SkuModel sku) {
		client.moveToWishlist(sku);
	}

}
