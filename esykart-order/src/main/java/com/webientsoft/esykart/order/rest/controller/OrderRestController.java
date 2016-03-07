package com.webientsoft.esykart.order.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.order.entity.Order;
import com.webientsoft.esykart.order.service.OrderService;

@RestController
public class OrderRestController {

	@Autowired
	private OrderService service;

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	

	@RequestMapping("/create")
	public String create() {
		Order order=new Order();
		order.setName("Deepak");
		service.save(order);
		return " Order created Successfully..";
	}
	
	@RequestMapping("/find")
	public String find() {
		Order order=service.find(1);
		return " Order detail:"+ order.toString();
	}
}
