
package com.webientsoft.esykart.customer.service.account.client;

import com.webientsoft.esykart.common.model.product.SkuModel;

public interface CartServiceClient {

	void add(SkuModel sku);

	void delete(SkuModel sku);

	void moveToWishlist(SkuModel sku);

}
