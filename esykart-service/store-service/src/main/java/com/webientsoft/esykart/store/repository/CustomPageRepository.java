/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.store.repository;

import com.webientsoft.esykart.common.model.Status;

public interface CustomPageRepository {

	void changeStatus(Integer id, Status status);
}
