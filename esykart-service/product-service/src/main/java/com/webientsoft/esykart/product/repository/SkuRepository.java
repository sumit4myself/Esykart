package com.webientsoft.esykart.product.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.webientsoft.esykart.common.model.Status;
import com.webientsoft.esykart.product.entity.Sku;


@RepositoryRestResource
public interface SkuRepository extends BaseRepository<Sku, Integer> {

	@Modifying
	@Transactional
	@Query(name="SKU_UPDATE_STATUS")
	void changeStatus(@Param("id") Integer id, @Param("status") Status status);

}