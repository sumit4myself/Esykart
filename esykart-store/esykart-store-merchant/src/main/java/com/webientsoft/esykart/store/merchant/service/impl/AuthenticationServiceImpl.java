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

<<<<<<< HEAD
=======

>>>>>>> origin/master
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
		menus.add(dashboard);
		
		MenuModel categlogue = new MenuModel();
		categlogue.setIcon("&#xE871;");
		categlogue.setTitle("Catalogue");
		categlogue.setMenuId(2);
		
		menus.add(categlogue);

		
		List<MenuModel> subMenus = new ArrayList<>();
		MenuModel category = new MenuModel();
		category.setIcon("&#xE871;");
		category.setTitle("Category");
		category.setLink("restricted.category.manage");
		category.setMenuId(0);
		subMenus.add(category);
		categlogue.setSubMenu(subMenus);
		List<PermissionModel> categoryPermissions = new ArrayList<>();
		for(int i = 0 ; i < 6 ; i++){
			PermissionModel viewPermission = new PermissionModel();
			PrivilegeModel viewPrivilege = new PrivilegeModel();
			if(i==0){
				viewPrivilege.setIcon("&#xE8A0;@md-color-blue-grey-500");
				viewPrivilege.setPrivilegeName("View");
				viewPermission.setLink("restricted.category.view({id_key : id_val})");
			}else if(i==1){
				viewPrivilege.setIcon("&#xE254;@md-color-blue-500");
				viewPrivilege.setPrivilegeName("Edit");
				viewPermission.setLink("restricted.category.edit({id_key : id_val})");
			}else if(i==2){
				viewPrivilege.setIcon("&#xE872;@md-color-red-500");
				viewPrivilege.setPrivilegeName("Delete");
				viewPermission.setLink("delete(id_val)");
			}else if(i==3){
				viewPrivilege.setIcon("&#xE86C;@md-color-green-500");
				viewPrivilege.setPrivilegeName("Activate");
				viewPermission.setLink("activate(id_val)");
			}else if(i==4){
				viewPrivilege.setIcon("&#xE14B;@md-color-purple-500");
				viewPrivilege.setPrivilegeName("Deactivate");
				viewPermission.setLink("deactivate(id_val)");
			}else if(i==5){
				viewPrivilege.setIcon("&#xE148;");
				viewPrivilege.setPrivilegeName("Add");
				viewPermission.setLink("restricted.category.add");
			}
			viewPermission.setPrivilege(viewPrivilege);
			categoryPermissions.add(viewPermission);
		}
		category.setPermissions(categoryPermissions);
		
		user.setMenus(menus);
		
		
<<<<<<< HEAD
		return user;
=======
		return new UserModel();
>>>>>>> origin/master
	}

}
