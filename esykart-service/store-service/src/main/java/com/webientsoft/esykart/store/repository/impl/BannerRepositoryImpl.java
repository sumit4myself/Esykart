/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.store.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.store.repository.CustomBannerRepository;

/**
 * @author SumitS2
 *
 */
public class BannerRepositoryImpl implements CustomBannerRepository {

	@PersistenceContext
	private EntityManager entityManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.webientsoft.esykart.store.repository.CustomBannerRepository#changeStatus(java.
	 * lang.Integer, com.webientsoft.esykart.common.model.Status)
	 */
	@Transactional
	@Override
	public void changeStatus(Integer id, Status status) {
		entityManager.createNamedQuery("BANNER_UPDATE_STATUS").setParameter("id",
				id).setParameter("status", status).executeUpdate();
	}
}
