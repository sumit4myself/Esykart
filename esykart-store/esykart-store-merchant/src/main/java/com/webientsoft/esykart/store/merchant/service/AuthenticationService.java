package com.webientsoft.esykart.store.merchant.service;

import com.webientsoft.esykart.common.model.common.AuthenticationModel;
import com.webientsoft.esykart.common.model.user.UserModel;

public interface AuthenticationService {
	
	UserModel authenticate(AuthenticationModel model);
	
	
}
