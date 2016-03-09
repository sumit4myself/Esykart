package com.webientsoft.esykart.product.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.ProductModel;
import com.webientsoft.esykart.product.service.ProductCatalogueService;


@Service
@Transactional
public class ProductCatalogueServiceImpl implements ProductCatalogueService {

	@Override
	public void save(ProductModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Integer id, ProductModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public ProductModel find(Integer id) {
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
