package com.webientsoft.esykart.apigateway.service;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.user.RoleModel;

public interface RoleService {

	void save(RoleModel model);

	void update(Integer id, RoleModel model);

	RoleModel find(Integer id);

	PaginatedDataModel search(FilterModel model);

	void changeStatus(Integer id, Status status);

}
