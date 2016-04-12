
package com.webientsoft.esykart.customer.service.account;

import com.webientsoft.esykart.common.model.user.UserModel;

public interface AccountService {

	public void authenticate(UserModel model);
	public void register(UserModel model);

}
