/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */


package com.webientsoft.esykart.api.netflix.feign;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.cloud.netflix.feign.support.ResponseEntityDecoder;
import org.springframework.cloud.netflix.feign.support.SpringDecoder;
import org.springframework.cloud.netflix.feign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.webientsoft.esykart.api.netflix.feign.support.RequestMappingOnTypeAwareSpringMvcContract;

import feign.Contract;
import feign.Logger;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.slf4j.Slf4jLogger;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@Configuration
public class CustomizableFeignClientsConfiguration {

	@Autowired
	private ObjectFactory<HttpMessageConverters> messageConverters;

	@Bean
	public Decoder feignDecoder() {
		return new ResponseEntityDecoder(new SpringDecoder(messageConverters));
	}

	@Bean
	public Encoder feignEncoder() {
		return new SpringEncoder(messageConverters);
	}

	@Bean
	public Logger feignLogger() {
		return new Slf4jLogger();
	}

	@Bean
	public Contract feignContract() {
		return new RequestMappingOnTypeAwareSpringMvcContract();
	}
	
}
