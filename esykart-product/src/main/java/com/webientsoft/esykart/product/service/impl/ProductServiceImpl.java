package com.webientsoft.esykart.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webientsoft.esykart.common.dao.support.JPADaoSupport;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.ProductModel;
import com.webientsoft.esykart.common.model.product.SkuModel;
import com.webientsoft.esykart.common.utils.BeanUtils;
import com.webientsoft.esykart.product.entity.Product;
import com.webientsoft.esykart.product.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private JPADaoSupport dao;

	
	@Override
	public void save(SkuModel model) {
		Product product = new Product();
		BeanUtils.copyProperties(model, product);
		dao.persist(product);
	}

	@Override
	public void update(Integer id, SkuModel model) {
		Product product = new Product();
		product.setId(id);
		BeanUtils.copyProperties(model, product);
		dao.merge(product);
	}

	@Override
	public ProductModel find(Integer id) {

		Product product = dao.find(Product.class, id);
		ProductModel model = new ProductModel();
		BeanUtils.copyProperties(product, model);
		return model;
	}

	
	@Override
	public PaginatedDataModel search(FilterModel model) {
		PaginatedDataModel dataModel = new PaginatedDataModel();
		if (model.isHasCount()) {
			// TODO include count
			int totalCount = 0;
			int filteredCount = 0;
			
			dataModel.setTotalCount(totalCount);
			dataModel.setFilteredCount(filteredCount);
		}

		StringBuilder queryBuilder = new StringBuilder();
		List<?> dataList = dao.findByQueryString(queryBuilder.toString(), dao.addQueryNamedParameters(""));
		dataModel.setDataList(dataList);
		return dataModel;
	}

	@Override
	public void changeStatus(Integer id, Status status) {
		StringBuilder queryBuilder = new StringBuilder();
		dao.executeUpdateByQueryString(queryBuilder.toString(), dao.addQueryNamedParameters(""));
	}

}
