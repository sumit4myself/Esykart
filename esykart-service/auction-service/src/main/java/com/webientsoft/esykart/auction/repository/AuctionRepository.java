/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.auction.repository;

import com.webientsoft.esykart.auction.entity.Auction;
import com.webientsoft.esykart.common.model.Status;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
public interface AuctionRepository
		extends BaseRepository<Auction, Integer>, AuctionRepositoryCustom {

	/**
	 * @param id
	 * @param status
	 */
	void changeStatus(int id, Status status);

}
