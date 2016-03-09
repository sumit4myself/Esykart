package com.webientsoft.esykart.product.service;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.ProductModel;

public interface ProductService {

    void save(ProductModel model);

    void update(Integer productId,ProductModel model);

    ProductModel find(Integer id);

    PaginatedDataModel search(FilterModel model);

    void changeStatus(Integer id, Status status);

}
