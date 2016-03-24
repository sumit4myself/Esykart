/**
 * 
 */
package com.webientsoft.esykart.customer.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.customer.dao.CustomerDao;
import com.webientsoft.esykart.customer.entity.Cart;
import com.webientsoft.esykart.customer.entity.Customer;
import com.webientsoft.esykart.customer.entity.Wallet;
import com.webientsoft.esykart.customer.entity.WishList;
import com.webientsoft.esykart.customer.model.CustomerModel;
import com.webientsoft.esykart.customer.service.CustomerService;

/**
 * @author new-user
 *
 */

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	@Override
	public void save(CustomerModel model) {
		Customer customer = new Customer();
		try {
			BeanUtils.copyProperties(customer, model);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		customerDao.save(customer);
	}

	
	@Override
	public void update(CustomerModel model) {
		Customer customer = new Customer();
		try {
			BeanUtils.copyProperties(customer, model);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		customerDao.save(customer);
	}

	
	@Override
	public CustomerModel find(Integer id) {
		CustomerModel model = new CustomerModel();
		Customer customer = customerDao.find(id);
		try {
			BeanUtils.copyProperties( model, customer);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}

	
	@Override
	public PaginatedDataModel search(FilterModel model) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void changeStatus(Integer id, boolean status) {
		customerDao.changeStatus(id, status);

	}

	
	@Override
	public CustomerModel authenticate(AuthenticationModel authmodel) {
		CustomerModel model = new CustomerModel();
		Customer customer = customerDao.authenticate(authmodel);
		try {
			BeanUtils.copyProperties( model, customer);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}


	@Override
	public List<Cart> findCart(Integer customerId) {
		return  customerDao.findCart(customerId);
	}


	@Override
	public List<WishList> findWishList(Integer customerId) {
		return  customerDao.findWishList(customerId);
	}


	@Override
	public List<Wallet> findWallet(Integer customerId) {
		return  customerDao.findWallet(customerId);
	}

}
