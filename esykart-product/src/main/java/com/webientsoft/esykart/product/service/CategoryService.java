package com.webientsoft.esykart.product.service;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.common.model.common.FilterModel;
import com.webientsoft.esykart.common.model.common.PaginatedDataModel;
import com.webientsoft.esykart.common.model.product.CategoryModel;

public interface CategoryService {
    
    void save(CategoryModel model);
    void update( int id,CategoryModel model);
    CategoryModel find(Integer id);
    PaginatedDataModel search(FilterModel model);
    void changeStatus(Integer id, Status status);

}
