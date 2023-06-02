package com.vaibhav.first.service;

import java.util.List;

import com.vaibhav.first.Employee;

public interface EmployeeService {

	public String addEmployee(Employee employee);

	public Employee getEmployee(String id);

	public int updateEmployee(Employee e);
	
	public List<Employee> EmpDetail();

	public String deleteEmployee(String id);

	
}
