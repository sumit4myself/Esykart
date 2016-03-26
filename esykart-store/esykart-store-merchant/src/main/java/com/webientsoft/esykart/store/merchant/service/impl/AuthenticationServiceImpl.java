package com.webientsoft.esykart.store.merchant.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.user.UserModel;
import com.webientsoft.esykart.store.merchant.client.helper.RestTemplateHelper;
import com.webientsoft.esykart.store.merchant.service.AuthenticationService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private RestTemplateHelper restTemplateHelper;

	@Override
	public UserModel authenticate(AuthenticationModel model) {
		return restTemplateHelper.authenticate(model);
	}

}
