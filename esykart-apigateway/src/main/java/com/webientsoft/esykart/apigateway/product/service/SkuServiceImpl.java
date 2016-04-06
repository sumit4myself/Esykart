package com.webientsoft.esykart.apigateway.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.apigateway.product.service.client.SkuServiceClient;
import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.SkuModel;

@Service
public class SkuServiceImpl implements SkuService {

	@Autowired
	private SkuServiceClient client;

	@Override
	public long save(SkuModel entity) {
		return client.save(entity);
	}

	@Override
	public void update(long id, SkuModel entity) {
		client.update(id, entity);
	}

	@Override
	public SkuModel find(long id) {
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
