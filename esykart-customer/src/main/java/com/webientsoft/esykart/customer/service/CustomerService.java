package com.webientsoft.esykart.customer.service;

import java.util.List;

import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.customer.entity.Cart;
import com.webientsoft.esykart.customer.entity.Wallet;
import com.webientsoft.esykart.customer.entity.WishList;
import com.webientsoft.esykart.customer.model.CustomerModel;

public interface CustomerService {

	    void save(CustomerModel model);

	    void update(CustomerModel model);

	    CustomerModel find(Integer id);

	    PaginatedDataModel search(FilterModel model);

	    void changeStatus(Integer id, boolean status);

	    CustomerModel authenticate(AuthenticationModel model);
	    
	    List<Cart> findCart(Integer customerId);
	    
	    List<WishList> findWishList(Integer customerId);
	    
	    List<Wallet> findWallet(Integer customerId);
}
