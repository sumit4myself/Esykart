
package com.webientsoft.esykart.customer.service.account;

import com.webientsoft.esykart.common.model.product.SkuModel;

public interface WishlistService {

	public void add(SkuModel sku);

	public void delete(SkuModel sku);

	public void moveToCart(SkuModel sku);

}
