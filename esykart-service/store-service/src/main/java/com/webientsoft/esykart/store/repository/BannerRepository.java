package com.webientsoft.esykart.store.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.webientsoft.esykart.store.entity.Banner;



@RepositoryRestResource(path = "banners")
public interface BannerRepository
		extends BaseRepository<Banner, Integer>, CustomBannerRepository {
	

}
