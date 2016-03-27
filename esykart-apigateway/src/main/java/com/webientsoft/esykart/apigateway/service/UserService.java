package com.webientsoft.esykart.apigateway.service;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.user.UserModel;

public interface UserService {
	
	void save(UserModel model);

	void update(Integer id, UserModel model);

	UserModel find(Integer id);

	PaginatedDataModel search(FilterModel model);

	void changeStatus(Integer id, Status status);
	
	UserModel authenticate(AuthenticationModel model);
	
}
