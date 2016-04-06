package com.webientsoft.esykart.apigateway.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.apigateway.product.service.client.CategoryServiceClient;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.CategoryModel;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryServiceClient client;

	@Override
	public long save(CategoryModel entity) {
		return client.save(entity);
	}

	@Override
	public void update(long id, CategoryModel entity) {
		client.update(id, entity);
	}

	@Override
	public CategoryModel find(long id) {
		return client.find(id);
	}

	@Override
	public PaginatedDataModel search(FilterModel model) {
		return client.search(model);
	}

	@Override
	public void changeStatus(long id, Status status) {
		client.changeStatus(id, status);
	}

}
