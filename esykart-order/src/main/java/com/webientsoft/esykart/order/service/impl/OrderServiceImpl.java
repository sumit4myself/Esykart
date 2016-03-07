package com.webientsoft.esykart.order.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.common.dao.support.JPADaoSupport;
import com.webientsoft.esykart.order.entity.Order;
import com.webientsoft.esykart.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);
	@Autowired
	private JPADaoSupport daoSupport;

	@Override
	public void save(Order order) {
		try {
			daoSupport.persist(order);
		} catch (Exception e) {
			e.printStackTrace();
		}

		LOGGER.debug("..................Order saved..........");
	}

	@Override
	public Order find(int i) {
		return daoSupport.findSingleResultByNamedQuery("FIND_ORDER_BY_ID", daoSupport.addQueryNamedParameters("orderId", i),
				Order.class);
	}
}
