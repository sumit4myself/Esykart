package com.webientsoft.esykart.user.repository.impl;

import org.springframework.stereotype.Repository;

import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.user.repository.RoleRepositoryCustom;


@Repository
public class RoleRepositoryImpl implements RoleRepositoryCustom{

	@Override
	public PaginatedDataModel search(FilterModel model) {
		System.out.println("Serach  === > "+model);
		return null;
	}

}
