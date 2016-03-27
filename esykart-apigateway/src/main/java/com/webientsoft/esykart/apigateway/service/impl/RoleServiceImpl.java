package com.webientsoft.esykart.apigateway.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.webientsoft.esykart.apigateway.service.RoleService;
import com.webientsoft.esykart.apigateway.service.client.RoleServiceClient;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.user.RoleModel;

public class RoleServiceImpl implements RoleService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(
			RoleServiceImpl.class);

	@Autowired
	private RoleServiceClient client;

	@Override
	public void save(RoleModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Integer id, RoleModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public RoleModel find(Integer id) {
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

}
