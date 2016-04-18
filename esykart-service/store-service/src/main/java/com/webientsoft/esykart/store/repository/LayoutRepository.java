
package com.webientsoft.esykart.store.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.webientsoft.esykart.store.entity.Layout;

@RepositoryRestResource(path = "layouts")
public interface LayoutRepository
		extends BaseRepository<Layout, Integer>, CustomLayoutRepository {

}