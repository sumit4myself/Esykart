
package com.webientsoft.esykart.customer.service.account.client;

import com.webientsoft.esykart.common.model.user.UserModel;

public interface AccountServiceClient {

	void authenticate(UserModel model);

	void register(UserModel model);

}
