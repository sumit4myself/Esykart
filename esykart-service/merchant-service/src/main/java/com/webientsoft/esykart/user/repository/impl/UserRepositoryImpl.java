package com.webientsoft.esykart.user.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.webientsoft.esykart.user.entity.Menu;
import com.webientsoft.esykart.user.entity.Permission;
import com.webientsoft.esykart.user.entity.Role;
import com.webientsoft.esykart.user.entity.User;
import com.webientsoft.esykart.user.repository.UserRepositoryCustom;

@Repository
public class UserRepositoryImpl implements UserRepositoryCustom {

	@PersistenceContext
	public EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public User authenticate(String userName, String password) {
		Query query = entityManager.createNamedQuery("User.authenticate");
		query.setParameter("userName", userName);
		query.setParameter("password", password);
		User user = (User) query.getSingleResult();
		List<Permission> permissions = new ArrayList<>();
		for (Role role : user.getRoles()) {
			permissions.addAll(role.getPermissions());
		}
		Query menuQuery = entityManager.createNamedQuery("User.findMenus");
		List<Menu> menus = menuQuery.setParameter("permissions", permissions).getResultList();
		user.setMenus(menus);
		return user;
	}

}
