package com.webientsoft.esykart.order.service;

import com.webientsoft.esykart.order.entity.Order;

public interface OrderService {

	void save(Order order);

	Order find(int i);

}
