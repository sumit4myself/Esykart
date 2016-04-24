
package com.webientsoft.esykart.product.repository.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.PagedResources.PageMetadata;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webientsoft.esykart.common.model.SearchFilter;
import com.webientsoft.esykart.product.entity.Category;
import com.webientsoft.esykart.product.repository.CategoryRepository;

@RepositoryRestController
@RequestMapping(value = "/categories")
public class CategoryRepositoryRestController {

	@Autowired
	private CategoryRepository repository;

	@RequestMapping(value = "/search", method = RequestMethod.POST, consumes = {
		MediaType.APPLICATION_JSON_VALUE }, produces = { MediaTypes.HAL_JSON_VALUE })
	public @ResponseBody ResponseEntity<PagedResources<Resource<Category>>> search(
			@RequestBody SearchFilter filter) {
		Pageable pageable = new PageRequest(0, 1000);
		Page<Category> page = repository.findAll(pageable);
		List<Resource<Category>> resources = new ArrayList<>(page.getSize());
		for (Category category : page.getContent()) {
			resources.add(new Resource<Category>(category));
		}
		PagedResources<Resource<Category>> pagedResources = new PagedResources<Resource<Category>>(
				resources, new PageMetadata(page.getSize(), page.getNumber(),
						page.getTotalElements()));
		return ResponseEntity.ok(pagedResources);
	}

}
