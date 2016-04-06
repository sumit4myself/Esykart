package com.webientsoft.esykart.apigateway.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.apigateway.user.service.client.UserServiceClient;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.user.UserModel;

@Service
public class UserServiceImpl implements UserService {
	
//	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserServiceClient client;

	@Override
	public void save(UserModel model) {
		client.save(model);
	}

	@Override
	public void update(Integer id, UserModel model) {
		client.update(id, model);
	}

	@Override
	public UserModel find(Integer id) {
		return client.find(id);
	}

	@Override
	public PaginatedDataModel search(FilterModel model) {
		return client.search(model);
	}

	@Override
	public void changeStatus(Integer id, Status status) {
		client.changeStatus(id, status);
	}

	@Override
	public UserModel authenticate(AuthenticationModel model) {
		return client.authenticate(model);
	}

}
