/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.customer.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.customer.entity.Customer;
import com.webientsoft.esykart.customer.repository.CustomerRepositoryCustom;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

	@PersistenceContext
	public EntityManager entityManager;

	@Override
	public Customer authenticate(String userName, String password) {
		Query query = entityManager.createNamedQuery("customer.authenticate");
		query.setParameter("userName", userName);
		query.setParameter("password", password);
		Customer customer = (Customer) query.getSingleResult();
		return customer;	
		
	}

	@Transactional
	@Override
	public void changeStatus(Integer userId, Status status) {
		entityManager.createNamedQuery("customer.change.status").setParameter("id",
				userId).setParameter("status", status).executeUpdate();
		
	}

	
}
