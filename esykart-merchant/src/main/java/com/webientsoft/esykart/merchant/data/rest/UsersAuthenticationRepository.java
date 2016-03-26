package com.webientsoft.esykart.merchant.data.rest;

import com.webientsoft.esykart.merchant.entity.user.User;

public interface UsersAuthenticationRepository {
	
	User authenticate(String userName,String password);
	
}
