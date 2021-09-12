package com.sk.kmooc.account.domain.repository;

import com.sk.kmooc.account.domain.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {


}
