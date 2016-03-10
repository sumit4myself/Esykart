package com.webientsoft.esykart.product.service;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.SkuModel;

public interface SKUService {

    void save(SkuModel model);

    void update(Integer productId,SkuModel model);

    SkuModel find(Integer id);

    PaginatedDataModel search(FilterModel model);

    void changeStatus(Integer id, Status status);

}
