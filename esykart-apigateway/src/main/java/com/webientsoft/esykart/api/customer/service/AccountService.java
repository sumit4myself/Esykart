/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */
package com.webientsoft.esykart.api.customer.service;

import com.webientsoft.esykart.common.model.user.UserModel;

public interface AccountService {

	public void authenticate(UserModel model);
	public void register(UserModel model);

}
