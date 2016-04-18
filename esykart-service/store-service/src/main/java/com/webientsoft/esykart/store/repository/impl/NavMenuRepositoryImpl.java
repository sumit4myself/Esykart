/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.store.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.store.repository.CustomNavMenuRepository;

/**
 * @author SumitS2
 *
 */
public class NavMenuRepositoryImpl implements CustomNavMenuRepository {

	@PersistenceContext
	private EntityManager entityManager;

	/*
	 * @see com.webientsoft.esykart.product.repository.CustomProductDetailRepository#
	 * changeStatus( java.lang.Integer, com.webientsoft.esykart.common.model.Status)
	 */
	@Transactional
	@Override
	public void changeStatus(Integer id, Status status) {
		entityManager.createNamedQuery("NAVMENU_UPDATE_STATUS").setParameter("id",
				id).setParameter("status", status).executeUpdate();
	}

}
