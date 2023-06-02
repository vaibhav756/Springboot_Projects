package com.SpringBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	public List<Employee> findByEmpName(String name);
	
	public List<Employee> findByEmpAgeLessThanEqual(int age);
	
	
}
