package com.webientsoft.esykart.product.repository;

import org.springframework.data.repository.query.Param;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.product.entity.Sku;

public interface SkuRepository extends BaseRepository<Sku, Integer>, SkuRepositoryCustom {

	void changeStatus(@Param("id") Integer id, @Param("status") Status status);

}