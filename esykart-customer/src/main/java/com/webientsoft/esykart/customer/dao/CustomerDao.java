package com.webientsoft.esykart.customer.dao;

import java.util.List;

import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.customer.entity.Cart;
import com.webientsoft.esykart.customer.entity.Customer;
import com.webientsoft.esykart.customer.entity.Wallet;
import com.webientsoft.esykart.customer.entity.WishList;

public interface CustomerDao {

	void save(Customer model);

    void update(Customer model);

    Customer find(Integer id);

    void changeStatus(Integer id, boolean status);

    Customer authenticate(AuthenticationModel model);
    
    List<Cart> findCart(Integer customerId);
    
    List<WishList> findWishList(Integer customerId);
    
    List<Wallet> findWallet(Integer customerId);
}
