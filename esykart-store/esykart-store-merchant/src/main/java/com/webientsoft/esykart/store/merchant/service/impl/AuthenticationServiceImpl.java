package com.webientsoft.esykart.store.merchant.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.user.MenuModel;
import com.webientsoft.esykart.common.model.user.PermissionModel;
import com.webientsoft.esykart.common.model.user.PrivilegeModel;
import com.webientsoft.esykart.common.model.user.UserModel;
import com.webientsoft.esykart.store.merchant.service.AuthenticationService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {


	@Override
	public UserModel authenticate(AuthenticationModel model) {
		UserModel user = new UserModel();
		user.setName("Sumit Kumar Shamra");
		user.setEmail("sumit4myself@gmail.com");
		user.setUserName("Sumit4myself");
		
		
		List<MenuModel> menus = new ArrayList<>();
		
		MenuModel dashboard = new MenuModel();
		dashboard.setIcon("&#xE871;");
		dashboard.setLink("restricted.dashboard");
		dashboard.setMenuId(1);

		List<PermissionModel> dashboardPermissions = new ArrayList<>();
		PermissionModel dashboardPermission = new PermissionModel();
		PrivilegeModel dashboardPrivilege = new PrivilegeModel();
		dashboardPermission.setLink("restricted.dashboard");
		dashboardPrivilege.setPrivilegeName("View");
		dashboardPermission.setPrivilege(dashboardPrivilege);
		dashboardPermissions.add(dashboardPermission);
		dashboard.setPermissions(dashboardPermissions);
		
		
		
		return new UserModel();
	}

}
