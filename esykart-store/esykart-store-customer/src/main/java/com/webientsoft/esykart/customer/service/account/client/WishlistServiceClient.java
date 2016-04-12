
package com.webientsoft.esykart.customer.service.account.client;

import com.webientsoft.esykart.common.model.product.SkuModel;

public interface WishlistServiceClient {

	void add(SkuModel sku);

	void delete(SkuModel sku);

	void moveToCart(SkuModel sku);

}
