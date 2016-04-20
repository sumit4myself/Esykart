/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.user.repository;

import com.webientsoft.esykart.common.model.Status;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public interface RoleRepositoryCustom {

	void changeStatus(Integer id, Status status);
}
