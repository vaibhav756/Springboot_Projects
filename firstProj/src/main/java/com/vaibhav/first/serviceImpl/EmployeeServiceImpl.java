package com.vaibhav.first.serviceImpl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav.first.Employee;
import com.vaibhav.first.repository.EmployeeRepository;
import com.vaibhav.first.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	 
 @Autowired
 EmployeeRepository employeeRepository;
 
    @Override
	public List<Employee> EmpDetail() {
		List<Employee> x=employeeRepository.findAll();
		return x;
	}
 
    @Override
	public String addEmployee(Employee employee) {
		
		employeeRepository.save(employee);
		return "";
	}

	@Override
	public Employee getEmployee(String id) {
		Employee e2=employeeRepository.getEmployee(id);
		return e2;
	}
	
	

	@Override
	public int updateEmployee(Employee e) {
		String eid=e.getId();
		String ename=e.getName();
		String egender=e.getGender();
		String emobile=e.getMobile();
		String edept=e.getDepartment();
		String esalary=e.getSalary();
		employeeRepository.updateEmployee(eid,ename,egender,emobile,edept,esalary);
		return 0;
		}

	@Override
	public String deleteEmployee(String id) {
		employeeRepository.deleteEmployee(id);
		return "";
	}

}
