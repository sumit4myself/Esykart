package com.webientsoft.esykart.merchant.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.webientsoft.esykart.common.dao.support.JPADaoSupport;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.merchant.MerchantModel;
import com.webientsoft.esykart.common.utils.BeanUtils;
import com.webientsoft.esykart.merchant.entity.Merchant;
import com.webientsoft.esykart.merchant.entity.user.User;
import com.webientsoft.esykart.merchant.service.MerchantService;


public class MerchantServiceImpl implements MerchantService {

	@Autowired
	private JPADaoSupport dao;

	@Override
	public void save(MerchantModel model) {
		Merchant merchant = new Merchant();
		merchant.setUsers(populateUser(model));
		dao.persist(merchant);
	}

	@Override
	public void update(Integer id, MerchantModel model) {
		Merchant merchant = new Merchant();
		merchant.setUsers(populateUser(model));
		merchant.setMerchantId(id);
		dao.merge(merchant);
	}

	@Override
	public MerchantModel find(Integer id) {
		Merchant merchant = dao.find(Merchant.class, id);
		MerchantModel model = new MerchantModel();
		BeanUtils.copyProperties(model, merchant);
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
		dao.executeUpdateByNamedQuery("MERCHANT_DETAIL_UPDATE_STATUS",
				dao.addQueryNamedParameters("id", id, "status", status));
	}

	private User populateUser(MerchantModel model){
		User users=new User();
		users.setName(model.getFullName());
		users.setEmail(model.getEmail());
		users.setPassword(model.getPassword());
		users.setMobile(model.getMobile());
		return null;
	}

}
