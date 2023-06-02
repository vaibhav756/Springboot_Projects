package com.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
