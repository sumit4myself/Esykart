package com.webientsoft.esykart.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webientsoft.esykart.common.dao.support.JPADaoSupport;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.SkuModel;
import com.webientsoft.esykart.common.utils.BeanUtils;
import com.webientsoft.esykart.product.entity.Sku;
import com.webientsoft.esykart.product.service.SKUService;

@Service
@Transactional
public class SKUServiceImpl implements SKUService {

	@Autowired
	private JPADaoSupport dao;

	@Override
	public void save(SkuModel model) {
		Sku sku = new Sku();
		BeanUtils.copyProperties(model, sku);
		dao.persist(sku);
	}

	@Override
	public void update(Integer id, SkuModel model) {
		Sku sku = new Sku();
		BeanUtils.copyProperties(model, sku);
		dao.persist(sku);
	}

	@Override
	public SkuModel find(Integer id) {

		Sku sku = dao.find(Sku.class, id);
		SkuModel model = new SkuModel();
		BeanUtils.copyProperties(sku, model);
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
