package com.webientsoft.esykart.merchant.data.rest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.webientsoft.esykart.merchant.entity.user.User;

@RepositoryRestResource(path = "/users", collectionResourceRel = "user", itemResourceRel = "user")
public interface UsersRepository extends PagingAndSortingRepository<User, Integer>, UsersAuthenticationRepository {

	List<User> findByName(@Param("name") String name);

}
