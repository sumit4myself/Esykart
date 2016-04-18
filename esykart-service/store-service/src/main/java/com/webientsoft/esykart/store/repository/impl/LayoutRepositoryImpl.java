/**
 * 
 */

package com.webientsoft.esykart.store.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.store.repository.CustomLayoutRepository;

/**
 * @author SumitS2
 *
 */
public class LayoutRepositoryImpl implements CustomLayoutRepository {

	@PersistenceContext
	private EntityManager entityManager;

	/*
	 * @see com.webientsoft.esykart.product.repository.CustomProductDetailRepository#
	 * changeStatus( java.lang.Integer, com.webientsoft.esykart.common.model.Status)
	 */
	@Transactional
	@Override
	public void changeStatus(Integer id, Status status) {
		entityManager.createNamedQuery("LAYOUT_UPDATE_STATUS").setParameter("id",
				id).setParameter("status", status).executeUpdate();
	}

}
