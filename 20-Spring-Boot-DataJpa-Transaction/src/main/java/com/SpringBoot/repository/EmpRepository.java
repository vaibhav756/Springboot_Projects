package com.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee,Integer>{

}
