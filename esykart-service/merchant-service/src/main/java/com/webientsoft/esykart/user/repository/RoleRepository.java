/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.user.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.webientsoft.esykart.merchant.repository.BaseRepository;
import com.webientsoft.esykart.user.entity.Role;

/**
 * 
 * @author Sumit Kumar Sharma
 * @since 1.0
 */


@RepositoryRestResource(path = "roles")
public interface RoleRepository
		extends BaseRepository<Role, Integer>, RoleRepositoryCustom {

}
