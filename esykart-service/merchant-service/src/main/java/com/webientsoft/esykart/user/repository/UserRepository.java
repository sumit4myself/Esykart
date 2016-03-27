/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.user.repository;

import org.springframework.data.repository.query.Param;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.merchant.repository.BaseRepository;
import com.webientsoft.esykart.user.entity.User;

/**
 * 
 * @author Sumit Kumar Sharma
 * @since 1.0
 */

public interface UserRepository extends BaseRepository<User, Integer>, UserRepositoryCustom {

	void changeStatus(@Param("userId") Integer userId, @Param("status") Status status);
}
