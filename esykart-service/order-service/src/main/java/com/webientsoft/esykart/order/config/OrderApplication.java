/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.order.config;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@EnableTransactionManagement
@EntityScan(basePackages = { "com.webientsoft.esykart.order.entity" })
@SpringBootApplication(scanBasePackages = { "com.webientsoft.esykart" })
@EnableJpaRepositories(basePackages = { "com.webientsoft.esykart.order.repository" })
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

}
