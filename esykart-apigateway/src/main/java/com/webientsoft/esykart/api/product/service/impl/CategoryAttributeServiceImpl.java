/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.product.service.CategoryAttributeService;
import com.webientsoft.esykart.api.product.service.client.CategoryAttributeServiceClient;

/**
 * 
 * 
 * @author DeepakT
 * @since 1.0
 */
@Service
public class CategoryAttributeServiceImpl implements CategoryAttributeService {

	@Autowired
	private CategoryAttributeServiceClient categoryAttrServiceClient;

}
