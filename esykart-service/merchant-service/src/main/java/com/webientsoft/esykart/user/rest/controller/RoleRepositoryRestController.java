
package com.webientsoft.esykart.user.rest.controller;

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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webientsoft.esykart.common.model.SearchFilter;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.user.entity.Role;
import com.webientsoft.esykart.user.repository.RoleRepository;

@RequestMapping(value = "/roles")
@RepositoryRestController
public class RoleRepositoryRestController {

	@Autowired
	private RoleRepository roleRepository;

	@RequestMapping(value = "/{id}/changeStatus", params = "status", method = RequestMethod.PATCH, consumes = {
		"application/merge-patchjson;charset=UTF-8" })
	public @ResponseBody ResponseEntity<Void> changeStatus(@PathVariable("id") int id,
			@RequestParam("status") Status status) {
		roleRepository.changeStatus(id, status);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST, consumes = {
		MediaType.APPLICATION_JSON_VALUE }, produces = { MediaTypes.HAL_JSON_VALUE })
	public @ResponseBody ResponseEntity<PagedResources<Resource<Role>>> search(
			@RequestBody SearchFilter filter) {
		Pageable pageable = new PageRequest(filter.getPage(), filter.getSize());
		Page<Role> page = roleRepository.findAll(pageable);
		List<Resource<Role>> resources = new ArrayList<>(page.getSize());
		for (Role role : page.getContent()) {
			resources.add(new Resource<Role>(role));
		}
		PagedResources<Resource<Role>> pagedResources = new PagedResources<>(
				resources, new PageMetadata(page.getSize(), page.getNumber(),
						page.getTotalElements()));
		return ResponseEntity.ok(pagedResources);
	}


}
