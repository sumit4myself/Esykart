package com.webientsoft.esykart.product.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webientsoft.esykart.common.dao.support.JPADaoSupport;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.ProductModel;
import com.webientsoft.esykart.common.utils.BeanUtils;
import com.webientsoft.esykart.product.entity.Product;
import com.webientsoft.esykart.product.service.ProductCatalogueService;

@Service
@Transactional
public class ProductCatalogueServiceImpl implements ProductCatalogueService {

	@Autowired
	private JPADaoSupport dao;

	@Override
	public void save(ProductModel model) {
		Product product = new Product();
		BeanUtils.copyProperties(model, product);
		dao.persist(product);
	}

	@Override
	public void update(Integer id, ProductModel model) {
		Product product = new Product();
		BeanUtils.copyProperties(model, product);
		product.setId(id);
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
		StringBuilder queryBuilder = new StringBuilder();
		Map<String, Object> params = new HashMap<>();
		if (model.isCountCached()) {
			int totalCount = 0;
			int filteredCount = 0;

		}
		List<?> dataList = dao.findByQueryString(queryBuilder.toString(), params);
		dataModel.setDataList(dataList);
		return dataModel;
	}

	@Override
	public void changeStatus(Integer id, Status status) {
		dao.executeUpdateByNamedQuery("PRODUCT_DETAIL_UPDATE_STATUS", 
				dao.addQueryNamedParameters("id",id,"status",status));
	}

}
