/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.store.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.webientsoft.esykart.store.entity.Page;


@RepositoryRestResource(path = "pages")
public interface PageRepository
		extends BaseRepository<Page, Integer>,CustomPageRepository {


}
