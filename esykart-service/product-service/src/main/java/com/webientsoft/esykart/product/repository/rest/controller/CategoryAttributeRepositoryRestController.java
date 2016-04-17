
package com.webientsoft.esykart.product.repository.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webientsoft.esykart.product.repository.CategoryAttributeRepository;

@RepositoryRestController
@RequestMapping(value = "/productattributes")
public class CategoryAttributeRepositoryRestController {

	@Autowired
	private CategoryAttributeRepository repository;

}
