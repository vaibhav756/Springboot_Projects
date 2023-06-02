package com.SpringBoot.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.SpringBoot.entity.Address;
import com.SpringBoot.entity.Employee;
import com.SpringBoot.repository.AddressRepository;
import com.SpringBoot.repository.EmpRepository;

@Service
public class EmployeeService {

	private EmpRepository empRepo;
	
	private AddressRepository addrRepo;

	public EmployeeService(EmpRepository empRepo, AddressRepository addrRepo) {
		super();
		this.empRepo = empRepo;
		this.addrRepo = addrRepo;
	}
	
	public EmployeeService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Transactional(rollbackOn = Exception.class)
	public void saveData()
	{
		Employee emp=new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Vaibhav");
		emp.setEmpSal(10000);
		empRepo.save(emp);
		
		int i=10/0;
		
		Address addr=new Address();
		addr.setAddrId(505);
		addr.setCity("Mumbai");
		addr.setCountry("India");
		addr.setEmpId(101);
		addr.setState("Maharashtra");
		
		addrRepo.save(addr);
	}
	
}
