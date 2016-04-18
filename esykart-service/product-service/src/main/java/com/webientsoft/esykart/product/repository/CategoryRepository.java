
package com.webientsoft.esykart.product.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.webientsoft.esykart.product.entity.Category;


@RepositoryRestResource(path = "categories")
public interface CategoryRepository
		extends BaseRepository<Category, Integer>, CustomCategoryRepository {

}