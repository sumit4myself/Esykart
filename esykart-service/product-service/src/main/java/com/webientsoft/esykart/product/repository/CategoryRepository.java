package com.webientsoft.esykart.product.repository;

import org.springframework.data.repository.query.Param;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.product.entity.Category;

public interface CategoryRepository
		extends BaseRepository<Category, Integer>, CategoryRepositoryCustom {

	void changeStatus(@Param("id") Integer id, @Param("status") Status status);

}