package com.webientsoft.esykart.product.repository;

import org.springframework.data.repository.query.Param;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.product.entity.CategoryAttribute;

public interface CategoryAttributeRepository
		extends BaseRepository<CategoryAttribute, Integer>, CategoryAttributeRepositoryCustom {
	
	void changeStatus(@Param("id") Integer id, @Param("status") Status status);

}
