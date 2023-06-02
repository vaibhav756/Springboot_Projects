package com.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.entity.Account;
import com.SpringBoot.entity.AccountPK;
public interface AccountRepository extends JpaRepository<Account,AccountPK>{

}
