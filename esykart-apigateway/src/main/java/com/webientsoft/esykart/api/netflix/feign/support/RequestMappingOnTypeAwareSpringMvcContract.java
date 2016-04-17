/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.netflix.feign.support;

import java.lang.reflect.Method;

import org.springframework.cloud.netflix.feign.support.SpringMvcContract;
import org.springframework.web.bind.annotation.RequestMapping;

import static feign.Util.*;

import feign.MethodMetadata;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public class RequestMappingOnTypeAwareSpringMvcContract extends SpringMvcContract {

	@Override
	protected MethodMetadata parseAndValidateMetadata(Class<?> targetType,
			Method method) {
		MethodMetadata metadata = super.parseAndValidateMetadata(targetType, method);
		RequestMapping classAnnotation = targetType.getAnnotation(RequestMapping.class);
		if (classAnnotation != null) {
			// Prepend path from class annotation if specified
			if (classAnnotation.value().length > 0) {
				String pathValue = emptyToNull(classAnnotation.value()[0]);
				checkState(pathValue != null,
						"RequestMapping.value() was empty on type %s",
						method.getDeclaringClass().getName());
				if (!pathValue.startsWith("/")) {
					pathValue = "/" + pathValue;
				}
				metadata.template().insert(0, pathValue);
			}
		}
		return metadata;
	}

}
