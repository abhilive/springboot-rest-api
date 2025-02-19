package com.abhilive.springboot_rest_api.repository;

import com.abhilive.springboot_rest_api.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
