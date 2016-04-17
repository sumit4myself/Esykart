/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.product.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.webientsoft.esykart.product.repository.CustomProductRepository;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */

public class ProductRepositoryImpl implements CustomProductRepository {

	private static final Logger LOGGER = LoggerFactory.getLogger(
			ProductRepositoryImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	

}
