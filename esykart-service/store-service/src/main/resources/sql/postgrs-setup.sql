INSERT INTO banner(name) VALUES ('Home Page Banner');
--	INSERT INTO banner_item (action_url,desc,image_url, title, banner_id) VALUES('');

INSERT INTO nav_menu(name) VALUES('Default Menu')
--	INSERT INTO nav_menu_item (name, category_id,page_id, parent_id, menu_id )
    
INSERT INTO  page(name,url) VALUES ('Contact Us','/contactus');

INSERT INTO layout(name,default_layout,start_date,end_date,banner_id,nav_menu_id) values('Default Layout',true,'2016-01-01 00:00:00','2017-01-01 00:00:00',(SELECT id FROM banner WHERE name = 'Home Page Banner'),(SELECT id FROM nav_menu WHERE name = 'Default Menu'))
--	INSERT INTO layout_section (name,size,index,all_product_selection_rule,product_selection_rule,layout_id)
       

            