/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.user.repository;

import org.springframework.data.repository.query.Param;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.merchant.entity.Merchant;
import com.webientsoft.esykart.merchant.repository.BaseRepository;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */

public interface RoleRepository
		extends BaseRepository<Merchant, Integer>, UserRepositoryCustom {

	void changeStatus(@Param("merchantId") Integer merchantId,
			@Param("status") Status status);

}
