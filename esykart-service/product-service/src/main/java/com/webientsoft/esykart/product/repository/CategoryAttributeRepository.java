package com.webientsoft.esykart.product.repository;

import com.webientsoft.esykart.product.entity.CategoryAttribute;


public interface CategoryAttributeRepository
		extends BaseRepository<CategoryAttribute, Integer>, CustomCategoryAttributeRepository {
	
	//void changeStatus(@Param("id") Integer id, @Param("status") Status status);

}
