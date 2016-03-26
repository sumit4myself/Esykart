INSERT INTO privilege(privilege_name,icon,sort_index) VALUES ('View', '&#xE254;', '1');

INSERT INTO privilege(privilege_name,icon,sort_index) VALUES ('Edit', '&#xE254;', '2');

INSERT INTO privilege(privilege_name,icon,sort_index) VALUES ('Delete', '&#xE872;', '3');

INSERT INTO privilege(privilege_name,icon,sort_index) VALUES ('Activate', '&#xE86C;', '4');

INSERT INTO privilege(privilege_name,icon,sort_index) VALUES ('Deactivate', '&#xE14B;', '5');



INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES ('&#xE871;', 'restricted.dashboard', 1, 'Dashboard', null);

INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES ('&#xE919', null , 2, 'Catalogue', null);

	INSERT INTO menu(icon, link, sort_index, title, parent_id)  VALUES (null, null , 1, 'Category Attribute', (select menu_id from menu where title = 'Catalogue'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id)  VALUES (null, 'restricted.category_attribute.add' , 1, 'Add', (select menu_id from menu where title = 'Category Attribute'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.category_attribute.manage' , 2, 'Manage', (select menu_id from menu where title = 'Category Attribute'));
		
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.category_attribute.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));

		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.category_attribute.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.category_attribute.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			    

	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, null , 2, 'Category', (select menu_id from menu where title = 'Catalogue'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.category.add' , 1, 'Add', (select menu_id from menu where title = 'Category'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.category.manage' , 2, 'Manage', (select menu_id from menu where title = 'Category'));

			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.category.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));

		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.category.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.category.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.category.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.category.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
			    
		
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, null , 3, 'Product', (select menu_id from menu where title = 'Catalogue'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.product.add' , 1, 'Add', (select menu_id from menu where title = 'Product' ));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.product.manage' , 2, 'Manage', (select menu_id from menu where title = 'Product'));
		
			
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.product.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));

		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.product.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.product.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			    
		
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, null , 4, 'Product Detail', (select menu_id from menu where title = 'Catalogue'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.product_detail.add' , 1, 'Add', (select menu_id from menu where title = 'Product Detail'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.product_detail.manage' , 2, 'Manage', (select menu_id from menu where title = 'Product Detail'));
			
			
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.product_detail.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));

		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.product_detail.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.product_detail.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.product_detail.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.product_detail.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
		
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, null , 5, 'SKU', (select menu_id from menu where title = 'Catalogue'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.sku.add' , 1, 'Add', (select menu_id from menu where title = 'SKU'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.sku.manage' , 2, 'Manage', (select menu_id from menu where title = 'SKU'));
		
			
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.sku.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));

		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.sku.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.sku.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.sku.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.sku.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
		
		
INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES ('&#xE54E;', null , 3, 'Pricing', null);

	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, null , 1, 'Offers', (select menu_id from menu where title = 'Pricing'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.offer.add' , 1, 'Add', (select menu_id from menu where title = 'Offers'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.offer.manage' , 2, 'Manage', (select menu_id from menu where title = 'Offers'));		
		
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.offer.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));

		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.offer.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.offer.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.offer.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.offer.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
		
INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES ('&#xE7F2;', null , 4, 'Customer Care', null);

	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.customer.manage' , 1, 'Customers', (select menu_id from menu where title = 'Customer Care'));
	
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.customer.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));
	
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.order.manage' , 1, 'Orders', (select menu_id from menu where title = 'Customer Care'));
			
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.order.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));

		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.order.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.order.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			    
	


INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES ('&#xE912;', null , 5, 'Store Setting', null);

	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, null , 1, 'Banner', (select menu_id from menu where title = 'Store Setting'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.store_banner.add' , 1, 'Add', (select menu_id from menu where title = 'Banner'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.store_banner.manage' , 2, 'Manage', (select menu_id from menu where title = 'Banner'));
			
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_banner.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));

		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_banner.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_banner.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_banner.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_banner.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
		
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, null , 2, 'Icon', (select menu_id from menu where title = 'Store Setting'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.store_icon.add' , 1, 'Add', (select menu_id from menu where title = 'Icon'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.store_icon.manage' , 2, 'Manage', (select menu_id from menu where title = 'Icon'));
		
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_icon.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));

		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_icon.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_icon.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_icon.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_icon.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, null , 3, 'Layout', (select menu_id from menu where title = 'Store Setting'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.store_layout.add' , 1, 'Add', (select menu_id from menu where title = 'Layout'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.store_layout.manage' , 2, 'Manage', (select menu_id from menu where title = 'Layout'));
		
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_layout.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));

		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_layout.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_layout.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_layout.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_layout.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, null , 4, 'Menu', (select menu_id from menu where title = 'Store Setting'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.store_menu.add' , 1, 'Add', (select menu_id from menu where title = 'Menu'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.store_menu.manage' , 2, 'Manage', (select menu_id from menu where title = 'Menu'));

		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_menu.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));

		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_menu.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_menu.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_menu.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_menu.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, null , 5, 'Page', (select menu_id from menu where title = 'Store Setting'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.store_page.add' , 1, 'Add', (select menu_id from menu where title = 'Page'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.store_page.manage' , 2, 'Manage', (select menu_id from menu where title = 'Page'));
			
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_page.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));

		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_page.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_page.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_page.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.store_page.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));

INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES ('&#xE32A;', null , 6, 'Users', null);

	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.merchant.manage' , 1, 'Merchant', (select menu_id from menu where title = 'Users'));
	
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, null , 2, 'User', (select menu_id from menu where title = 'Users'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.user.add' , 1, 'Add', (select menu_id from menu where title = 'User'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.user.manage' , 2, 'Manage', (select menu_id from menu where title = 'User'));		
			
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.user.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));

		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.user.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.user.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.user.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.user.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));
		
		
	INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, null , 3, 'Role', (select menu_id from menu where title = 'Users'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.role.add' , 1, 'Add', (select menu_id from menu where title = 'Role'));
		
		INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES (null, 'restricted.role.manage' , 2, 'Manage', (select menu_id from menu where title = 'Role'));		
			
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.role.manage' ),( select privilege_id from privilege where privilege_name = 'View' ));

		    INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.role.manage'),( select privilege_id from privilege where privilege_name = 'Edit' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.role.manage'),( select privilege_id from privilege where privilege_name = 'Delete' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.role.manage'),( select privilege_id from privilege where privilege_name = 'Activate' ));
			    
			INSERT INTO permission(link,menu_id, privilege_id) VALUES ('',(select menu_id from menu where link = 'restricted.role.manage'),( select privilege_id from privilege where privilege_name = 'Deactivate' ));

INSERT INTO menu(icon, link, sort_index, title, parent_id) VALUES ('&#xE8C0;', 'restricted.setting', 7, 'Settings', null); 
--Menu and Permission setup done 


INSERT INTO role(role_name,description, status, updated_by, updated_on) VALUES ('SuperAdmin', 'Super Admin Role', 'A', null, now());
    
INSERT INTO role_permission_mapping(role_id, permission_id) SELECT (SELECT role_id FROM role WHERE role_name = 'SuperAdmin'),permission_id FROM permission;

INSERT INTO users(email, mobile, name, user_name, password, status, updated_by, updated_on) VALUES ('superadmin@webientsoft.com', '9891939498', 'Super Admin', 'superAdmin', 'SuperAdm!n', 'A', null, now());

            