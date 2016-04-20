
package com.webientsoft.esykart.user.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.user.repository.RoleRepositoryCustom;

@Repository
public class RoleRepositoryImpl implements RoleRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	@Override
	public void changeStatus(Integer id, Status status) {
		entityManager.createNamedQuery("PRODUCT_DETAIL_UPDATE_STATUS").setParameter("id",
				id).setParameter("status", status).executeUpdate();
	}

}
