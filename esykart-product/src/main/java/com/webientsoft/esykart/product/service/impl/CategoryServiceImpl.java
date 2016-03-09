package com.webientsoft.esykart.product.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.common.dao.support.JPADaoSupport;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.CategoryModel;
import com.webientsoft.esykart.common.utils.BeanUtils;
import com.webientsoft.esykart.product.entity.Category;
import com.webientsoft.esykart.product.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private JPADaoSupport dao;

	@Override
	public void save(CategoryModel model) {
		Category category = new Category();
		BeanUtils.copyProperties(model, category);
		dao.persist(category);

	}

	@Override
	public void update(int id, CategoryModel model) {
		Category category = new Category();
		BeanUtils.copyProperties(model, category);
		dao.persist(category);

	}

	@Override
	public CategoryModel find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaginatedDataModel search(FilterModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeStatus(Integer id, Status status) {
		// TODO Auto-generated method stub

	}

}
