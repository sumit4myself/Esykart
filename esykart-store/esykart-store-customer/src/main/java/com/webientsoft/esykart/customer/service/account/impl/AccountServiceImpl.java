
package com.webientsoft.esykart.customer.service.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.common.model.user.UserModel;
import com.webientsoft.esykart.customer.service.account.AccountService;
import com.webientsoft.esykart.customer.service.account.client.AccountServiceClient;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountServiceClient client;


	@Override
	public void authenticate(UserModel model) {
		client.authenticate(model);
	}

	
	@Override
	public void register(UserModel model) {
		client.register(model);
	}

}
