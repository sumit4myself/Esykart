/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.FeignAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

import com.webientsoft.esykart.api.netflix.feign.EnableCustomizableFeignClients;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@EnableHystrix
@SpringBootApplication
@EnableAutoConfiguration(exclude = FeignAutoConfiguration.class)
@ComponentScan(basePackages = { "com.webientsoft.esykart.api" }, excludeFilters = {
	@Filter(type = FilterType.REGEX, pattern = {
		"com.webientsoft.esykart.api.service.client.*Client*",
		"com.webientsoft.esykart.api.*.service.client..*" }) })
@EnableCustomizableFeignClients(basePackages = { "com.webientsoft.esykart.api" })
public class APIGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(APIGatewayApplication.class, args);
	}

}
