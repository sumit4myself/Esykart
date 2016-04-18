INSERT INTO banner(name,status) VALUES ('Home Page Banner','A');
--	INSERT INTO banner_item (action_url,desc,image_url, title, banner_id) VALUES('');

INSERT INTO nav_menu (name,status) VALUES('Default Menu','A')
--	INSERT INTO nav_menu_item (name, category_id,page_id, parent_id, menu_id )
    
INSERT INTO  page (name,url,status) VALUES ('Contact Us','/contactus','A');

INSERT INTO layout (name,default_layout,start_date,end_date,status,banner_id,nav_menu_id) values('Default Layout',true,'2016-01-01 00:00:00','2017-01-01 00:00:00','A',(select id FORM banner where name = 'Home Page Banner'),(select id FORM nav_menu where name = 'Default Menu'))
--	INSERT INTO layout_section (name,size,index,all_product_selection_rule,product_selection_rule,layout_id)
       

            