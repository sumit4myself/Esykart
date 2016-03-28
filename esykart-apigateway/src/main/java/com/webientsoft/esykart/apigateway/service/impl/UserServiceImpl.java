package com.webientsoft.esykart.apigateway.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.apigateway.service.UserService;
import com.webientsoft.esykart.apigateway.service.client.UserServiceClient;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.user.UserModel;

@Service
public class UserServiceImpl implements UserService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(
			UserServiceImpl.class);
	
	@Autowired
	private UserServiceClient client;

	@Override
	public void save(UserModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Integer id, UserModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserModel find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaginatedDataModel search(FilterModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeStatus(Integer id, Status status) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserModel authenticate(AuthenticationModel model) {
		return client.authenticate(model);
	}

}
