/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.product.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.product.repository.CustomProductDetailRepository;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public class ProductDetailRepositoryImpl implements CustomProductDetailRepository {

	private static final Logger LOGGER = LoggerFactory.getLogger(
			ProductRepositoryImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	/*
	 * @see com.webientsoft.esykart.product.repository.CustomProductDetailRepository#
	 * changeStatus( java.lang.Integer, com.webientsoft.esykart.common.model.Status)
	 */
	@Transactional
	@Override
	public void changeStatus(Integer id, Status status) {
		LOGGER.debug("updating product details status");
		entityManager.createNamedQuery("PRODUCT_DETAIL_UPDATE_STATUS").setParameter("id",
				id).setParameter("status", status).executeUpdate();
	}
}
