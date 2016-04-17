
package com.webientsoft.esykart.product.repository.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webientsoft.esykart.product.repository.CategoryRepository;

@RepositoryRestController
@RequestMapping(value = "/categories")
public class CategoryRepositoryRestController {

	@Autowired
	private CategoryRepository repository;

}
