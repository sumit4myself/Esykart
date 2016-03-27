/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.merchant.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable>
		extends JpaSpecificationExecutor<T>, PagingAndSortingRepository<T, ID> {

}
