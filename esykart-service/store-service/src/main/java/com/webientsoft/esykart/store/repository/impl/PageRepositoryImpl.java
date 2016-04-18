/**
 * 
 */

package com.webientsoft.esykart.store.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.store.repository.CustomPageRepository;

/**
 * @author SumitS2
 *
 */
public class PageRepositoryImpl implements CustomPageRepository {

	@PersistenceContext
	private EntityManager entityManager;

	/*
	 * @see com.webientsoft.esykart.product.repository.CustomProductDetailRepository#
	 * changeStatus( java.lang.Integer, com.webientsoft.esykart.common.model.Status)
	 */
	@Transactional
	@Override
	public void changeStatus(Integer id, Status status) {
		entityManager.createNamedQuery("PAGE_UPDATE_STATUS").setParameter("id",
				id).setParameter("status", status).executeUpdate();
	}
}
