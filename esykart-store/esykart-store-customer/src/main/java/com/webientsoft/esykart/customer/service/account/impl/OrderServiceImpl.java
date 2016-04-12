
package com.webientsoft.esykart.customer.service.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.order.OrderModel;
import com.webientsoft.esykart.common.model.user.UserModel;
import com.webientsoft.esykart.customer.service.account.OrderService;
import com.webientsoft.esykart.customer.service.account.client.OrderServiceClient;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderServiceClient client;

	@Override
	public OrderModel find(UserModel model) {
		return client.find(model);
	}

	@Override
	public PaginatedDataModel search(FilterModel model) {
		return client.search(model);
	}

}
