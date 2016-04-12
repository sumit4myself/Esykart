package com.webientsoft.esykart.customer.service.account;

import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.order.OrderModel;
import com.webientsoft.esykart.common.model.user.UserModel;

public interface OrderService {

	OrderModel find(UserModel model);
	PaginatedDataModel search(FilterModel model);
   
}
