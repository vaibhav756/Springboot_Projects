package com.SpringBoot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Example;

import com.SpringBoot.entity.Employee;
import com.SpringBoot.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		EmployeeRepository employeeRepo=context.getBean(EmployeeRepository.class);
		
		/*Employee e1=new Employee();
		e1.setEmpId(101);
		e1.setEmpName("Vaibhav");
		e1.setEmpAge(10);
		e1.setEmpCity("Mumbai");
		e1.setEmpRole("Java Developer");
		
		employeeRepo.save(e1);
		System.out.println("Done...!!!");
		
		Employee e2=new Employee();
		e2.setEmpId(102);
		e2.setEmpName("Rohan");
		e2.setEmpAge(10);
		e2.setEmpCity("Banglore");
		e2.setEmpRole("Accountant");
		
		employeeRepo.save(e2);
		System.out.println("Second record updated");
		
		/*Iterable<Employee> emp=employeeRepo.findAll();
		emp.forEach(val->{
			System.out.println(val);
		});
		
		if(employeeRepo.existsById(101))
		{
		    Optional <Employee> val=employeeRepo.findById(101);
		    System.out.println("Entity is present "+val.get());
		};*/
		
		Employee e1=new Employee();                           //Create query as per requirement
		e1.setEmpAge(10); 
        Example example=Example.of(e1);                       //Pass the value in example		
		List<Employee> emp=employeeRepo.findAll(example);     //Find records as per created query
		emp.forEach(val->{
			System.out.println(val);
		});
		
		
	}

}
