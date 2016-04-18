/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.store.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.webientsoft.esykart.store.entity.NavMenu;

@RepositoryRestResource(path = "menus")
public interface NavMenuRepository
		extends BaseRepository<NavMenu, Integer>, CustomNavMenuRepository {

}