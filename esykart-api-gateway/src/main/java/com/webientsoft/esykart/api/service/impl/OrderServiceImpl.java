package com.webientsoft.esykart.api.service.impl;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.webientsoft.esykart.api.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@HystrixCommand(fallbackMethod = "getProducerFallback")
	public void sayHello() {

	}
}
