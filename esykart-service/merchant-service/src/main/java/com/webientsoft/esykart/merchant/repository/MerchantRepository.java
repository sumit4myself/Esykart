/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.merchant.repository;

import org.springframework.data.repository.query.Param;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.merchant.entity.Merchant;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */

public interface MerchantRepository extends BaseRepository<Merchant, Integer>, MerchantRepositoryCustom {

	void changeStatus(@Param("merchantId") Integer merchantId, @Param("status") Status status);

}
