/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.config;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@Configuration
public class SpringWebMvcConfiguration extends WebMvcConfigurationSupport {

	/*
	 * Return a {@link RequestMappingHandlerMapping} for mapping requests to annotated
	 * controllers
	 */
	@Override
	protected RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
		return new FeignClientAwareRequestMappingHandlerMapping();
	}

	private static class FeignClientAwareRequestMappingHandlerMapping
			extends RequestMappingHandlerMapping {

		/**
		 * {@inheritDoc} Expects a handler to have a type-level @{@link Controller}
		 * annotation.
		 */
		@Override
		protected boolean isHandler(Class<?> beanType) {
			if (AnnotationUtils.findAnnotation(beanType, FeignClient.class) != null) {
				return false;
			}
			else {
				return (AnnotationUtils.findAnnotation(beanType,
						Controller.class) != null)
						|| (AnnotationUtils.findAnnotation(beanType,
								RequestMapping.class) != null);
			}

		}

	}
}
