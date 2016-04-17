/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.product.entity.specification.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.webientsoft.esykart.common.model.SearchCriteria;
import com.webientsoft.esykart.product.entity.Product;
import com.webientsoft.esykart.product.entity.Product_;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public class ProductSpecificationImpl implements Specification<Product> {

	private List<SearchCriteria> criterias;

	/**
	 * @param criterias
	 */
	public ProductSpecificationImpl(List<SearchCriteria> criterias) {
		super();
		this.criterias = criterias;
	}

	@Override
	public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> query,
			CriteriaBuilder cb) {
		return cb.and(cb.equal(root.get(Product_.name), criterias.get(0).getValue()),
				cb.equal(root.get(Product_.model), criterias.get(1).getValue()));
	}

}
