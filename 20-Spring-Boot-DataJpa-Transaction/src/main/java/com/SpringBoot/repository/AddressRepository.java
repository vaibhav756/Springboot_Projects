package com.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>{

}
