package com.webientsoft.esykart.merchant.data.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.webientsoft.esykart.merchant.data.rest.UsersAuthenticationRepository;
import com.webientsoft.esykart.merchant.entity.user.User;

@Repository
public class UsersAuthenticationRepositoryImpl implements UsersAuthenticationRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public User authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
