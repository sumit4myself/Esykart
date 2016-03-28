INSERT INTO privilege(privilege_name,icon,sort_index) VALUES ('Add','&#xE148;' , '1');
INSERT INTO privilege(privilege_name,icon,sort_index) VALUES ('View', '&#xE8A0;@md-color-blue-grey-500', '2');
INSERT INTO privilege(privilege_name,icon,sort_index) VALUES ('Edit', '&#xE254;@md-color-blue-500', '3');
INSERT INTO privilege(privilege_name,icon,sort_index) VALUES ('Delete', '&#xE872;@md-color-red-500', '4');
INSERT INTO privilege(privilege_name,icon,sort_index) VALUES ('Activate', '&#xE86C;@md-color-green-500', '5');
INSERT INTO privilege(privilege_name,icon,sort_index) VALUES ('Deactivate', '&#xE14B;@md-color-purple-500', '6');


INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES ('&#xE871;', 'restricted.dashboard', 1, 'Dashboard', null);

	INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.dashboard',(select menu_id from menu where link = 'restricted.dashboard'),( select privilege_id from privilege where privilege_name = 'View' ));

INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES ('&#xE919', null , 2, 'Catalogue', null);

	INSERT INTO menu(icon, link, sort_index, title, parent_id)  VALUES (null, 'restricted.category_attribute.manage' , 1, 'Category Attribute', (select menu_id from menu where title = 'Catalogue'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.category_attribute.add',(select menu_id from menu where link = 'restricted.category_attribute.manage' ),( select privilege_id from privilege where privilege_name = 'Add' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.category_attribute.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.category_attribute.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.category_attribute.edit({id_key : id_val})',(select menu_id from menu where link = 'restricted.category_attribute.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('delete(id_val)',(select menu_id from menu where link = 'restricted.category_attribute.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));

	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.category.manage' , 2, 'Category', (select menu_id from menu where title = 'Catalogue'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.category.add',(select menu_id from menu where link = 'restricted.category.manage' ),( select privilege_id from privilege where privilege_name = 'Add' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.category.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.category.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.category.edit({id_key : id_val})',(select menu_id from menu where link = 'restricted.category.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('delete(id_val)',(select menu_id from menu where link = 'restricted.category.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('activate(id_val)',(select menu_id from menu where link = 'restricted.category.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('deactivate(id_val)',(select menu_id from menu where link = 'restricted.category.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.product.manage' , 3, 'Product', (select menu_id from menu where title = 'Catalogue'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.product.add',(select menu_id from menu where link = 'restricted.product.manage' ),( select privilege_id from privilege where privilege_name = 'Add' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.product.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.product.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.product.edit({id_key : id_val})',(select menu_id from menu where link = 'restricted.product.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('delete(id_val)',(select menu_id from menu where link = 'restricted.product.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			    
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.product_detail.manage' , 4, 'Product Detail', (select menu_id from menu where title = 'Catalogue'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.product_detail.add',(select menu_id from menu where link = 'restricted.product_detail.manage' ),( select privilege_id from privilege where privilege_name = 'Add' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.product_detail.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.product_detail.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.product_detail.edit({id_key : id_val})',(select menu_id from menu where link = 'restricted.product_detail.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('delete(id_val)',(select menu_id from menu where link = 'restricted.product_detail.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('activate(id_val)',(select menu_id from menu where link = 'restricted.product_detail.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('deactivate(id_val)',(select menu_id from menu where link = 'restricted.product_detail.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.sku.manage' , 5, 'SKU', (select menu_id from menu where title = 'Catalogue'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.sku.add',(select menu_id from menu where link = 'restricted.sku.manage' ),( select privilege_id from privilege where privilege_name = 'Add' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.sku.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.sku.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.sku.edit({id_key : id_val})',(select menu_id from menu where link = 'restricted.sku.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('delete(id_val)',(select menu_id from menu where link = 'restricted.sku.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('activate(id_val)',(select menu_id from menu where link = 'restricted.sku.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('deactivate(id_val)',(select menu_id from menu where link = 'restricted.sku.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES ('&#xE54E;', null , 3, 'Pricing', null);
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.offer.manage' , 1, 'Offers', (select menu_id from menu where title = 'Pricing'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.offer.add',(select menu_id from menu where link = 'restricted.offer.manage' ),( select privilege_id from privilege where privilege_name = 'Add' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.offer.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.offer.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.offer.edit({id_key : id_val})',(select menu_id from menu where link = 'restricted.offer.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('delete(id_val)',(select menu_id from menu where link = 'restricted.offer.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('activate(id_val)',(select menu_id from menu where link = 'restricted.offer.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('deactivate(id_val)',(select menu_id from menu where link = 'restricted.offer.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES ('&#xE7F2;', null , 4, 'Customer Care', null);
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.customer.manage' , 1, 'Customers', (select menu_id from menu where title = 'Customer Care'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.customer.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.customer.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));

	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.order.manage' , 1, 'Orders', (select menu_id from menu where title = 'Customer Care'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.order.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.order.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.order.edit({id_key : id_val})',(select menu_id from menu where link = 'restricted.order.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('delete(id_val)',(select menu_id from menu where link = 'restricted.order.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));

INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES ('&#xE912;', null , 5, 'Store Setting', null);

	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.store_banner.manage' , 1, 'Banner', (select menu_id from menu where title = 'Store Setting'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.store_banner.add',(select menu_id from menu where link = 'restricted.store_banner.manage' ),( select privilege_id from privilege where privilege_name = 'Add' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.store_banner.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.store_banner.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.store_banner.edit({id_key : id_val})',(select menu_id from menu where link = 'restricted.store_banner.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('delete(id_val)',(select menu_id from menu where link = 'restricted.store_banner.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('activate(id_val)',(select menu_id from menu where link = 'restricted.store_banner.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('deactivate(id_val)',(select menu_id from menu where link = 'restricted.store_banner.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.store_icon.manage' , 2, 'Icon', (select menu_id from menu where title = 'Store Setting'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.store_icon.add',(select menu_id from menu where link = 'restricted.store_icon.manage' ),( select privilege_id from privilege where privilege_name = 'Add' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.store_icon.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.store_icon.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.store_icon.edit({id_key : id_val})',(select menu_id from menu where link = 'restricted.store_icon.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('delete(id_val)',(select menu_id from menu where link = 'restricted.store_icon.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('activate(id_val)',(select menu_id from menu where link = 'restricted.store_icon.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('deactivate(id_val)',(select menu_id from menu where link = 'restricted.store_icon.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));

	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.store_layout.manage' , 3, 'Layout', (select menu_id from menu where title = 'Store Setting'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.store_layout.add',(select menu_id from menu where link = 'restricted.store_layout.manage' ),( select privilege_id from privilege where privilege_name = 'Add' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.store_layout.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.store_layout.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.store_layout.edit({id_key : id_val})',(select menu_id from menu where link = 'restricted.store_layout.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('delete(id_val)',(select menu_id from menu where link = 'restricted.store_layout.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('activate(id_val)',(select menu_id from menu where link = 'restricted.store_layout.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('deactivate(id_val)',(select menu_id from menu where link = 'restricted.store_layout.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.store_menu.manage' , 4, 'Menu', (select menu_id from menu where title = 'Store Setting'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.store_menu.add',(select menu_id from menu where link = 'restricted.store_menu.manage' ),( select privilege_id from privilege where privilege_name = 'Add' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.store_menu.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.store_menu.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.store_menu.edit({id_key : id_val})',(select menu_id from menu where link = 'restricted.store_menu.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('delete(id_val)',(select menu_id from menu where link = 'restricted.store_menu.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('activate(id_val)',(select menu_id from menu where link = 'restricted.store_menu.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('deactivate(id_val)',(select menu_id from menu where link = 'restricted.store_menu.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.store_page.manage' , 5, 'Page', (select menu_id from menu where title = 'Store Setting'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.store_page.add',(select menu_id from menu where link = 'restricted.store_page.manage' ),( select privilege_id from privilege where privilege_name = 'Add' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.store_page.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.store_page.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.store_page.edit({id_key : id_val})',(select menu_id from menu where link = 'restricted.store_page.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('delete(id_val)',(select menu_id from menu where link = 'restricted.store_page.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('activate(id_val)',(select menu_id from menu where link = 'restricted.store_page.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('deactivate(id_val)',(select menu_id from menu where link = 'restricted.store_page.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));

INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES ('&#xE32A;', null , 6, 'Users', null);

	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.merchant.manage' , 1, 'Merchant', (select menu_id from menu where title = 'Users'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.merchant.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.merchant.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.merchant.edit({id_key : id_val})',(select menu_id from menu where link = 'restricted.merchant.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('delete(id_val)',(select menu_id from menu where link = 'restricted.merchant.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('activate(id_val)',(select menu_id from menu where link = 'restricted.merchant.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('deactivate(id_val)',(select menu_id from menu where link = 'restricted.merchant.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
	
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.user.manage' , 2, 'User', (select menu_id from menu where title = 'Users'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.user.add',(select menu_id from menu where link = 'restricted.user.manage' ),( select privilege_id from privilege where privilege_name = 'Add' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.user.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.user.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.user.edit({id_key : id_val})',(select menu_id from menu where link = 'restricted.user.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('delete(id_val)',(select menu_id from menu where link = 'restricted.user.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('activate(id_val)',(select menu_id from menu where link = 'restricted.user.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('deactivate(id_val)',(select menu_id from menu where link = 'restricted.user.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.role.manage' , 3, 'Role', (select menu_id from menu where title = 'Users'));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.role.add',(select menu_id from menu where link = 'restricted.role.manage' ),( select privilege_id from privilege where privilege_name = 'Add' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.role.view({id_key : id_val})',(select menu_id from menu where link = 'restricted.role.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.role.edit({id_key : id_val})',(select menu_id from menu where link = 'restricted.role.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('delete(id_val)',(select menu_id from menu where link = 'restricted.role.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('activate(id_val)',(select menu_id from menu where link = 'restricted.role.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('deactivate(id_val)',(select menu_id from menu where link = 'restricted.role.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));

INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES ('&#xE8C0;', 'restricted.setting', 7, 'Settings', null); 
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('restricted.setting',(select menu_id from menu where link = 'restricted.setting'),( select privilege_id from privilege where privilege_name = 'Edit' ));
--Menu and Permission setup done 


INSERT INTO role(role_name,description, status, updated_by, updated_on) VALUES ('SuperAdmin', 'Super Admin Role', 'A', null, now());
    
INSERT INTO role_permission_mapping(role_id, permission_id) SELECT (SELECT role_id FROM role WHERE role_name = 'SuperAdmin'),permission_id FROM permission;

INSERT INTO users(email, mobile, name, user_name, password, status, updated_by, updated_on) VALUES ('superadmin@webientsoft.com', '9891939498', 'Super Admin', 'superAdmin', 'SuperAdm!n', 'A', null, now());

INSERT INTO role_user_mapping(role_id,user_id) VALUES((SELECT role_id FROM role WHERE role_name = 'SuperAdmin'),(SELECT user_id FROM users WHERE user_name = 'superAdmin'));
            