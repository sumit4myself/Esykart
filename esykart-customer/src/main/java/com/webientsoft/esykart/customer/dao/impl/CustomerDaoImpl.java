package com.webientsoft.esykart.customer.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webientsoft.esykart.common.dao.support.JPADaoSupport;
import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.customer.dao.CustomerDao;
import com.webientsoft.esykart.customer.entity.Cart;
import com.webientsoft.esykart.customer.entity.Customer;
import com.webientsoft.esykart.customer.entity.Wallet;
import com.webientsoft.esykart.customer.entity.WishList;

@Repository
public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
	private JPADaoSupport dao;

	@Override
	public void save(Customer customer) {
		dao.merge(customer);
	}

	@Override
	public void update(Customer customer) {
		dao.merge(customer);
	}

	@Override
	public Customer find(Integer id) {
		return dao.find(Customer.class, id);
	}

	@Override
	public void changeStatus(Integer id, boolean status) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("status", status);
		map.put("id", id);
		dao.executeUpdateByNamedQuery("update Customer set status = :status where id = :id", map);
	}

	@Override
	public Customer authenticate(AuthenticationModel model) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("userName", model.getUserName());
		map.put("password", model.getUserName());
		return (Customer)dao.findByNamedQuery("select c from  Customer c where c.userName= :userName and c.password = :password ", map).get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cart> findCart(Integer customerId) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("customerId", customerId);
		return (List<Cart>)dao.findByQueryString("SELECT c from Cart c where c.customerId = :customerId", map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<WishList> findWishList(Integer customerId) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("customerId", customerId);
		return (List<WishList>)dao.findByQueryString("SELECT w from WishList w where w.customerId = :customerId", map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Wallet> findWallet(Integer customerId) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("customerId", customerId);
		return (List<Wallet>)dao.findByQueryString("SELECT w from Wallet w where w.customerId = :customerId", map);
	}

}
