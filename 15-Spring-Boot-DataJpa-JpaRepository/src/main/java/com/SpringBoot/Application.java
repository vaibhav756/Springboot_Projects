package com.SpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.SpringBoot.entity.Employee;
import com.SpringBoot.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		EmployeeRepository empRepo=context.getBean(EmployeeRepository.class);
		
		Employee e1=new Employee(103,"Ketan",12,"Mumbai","Developer");
		Employee e2=new Employee(104,"Amit",13,"Banglore","Developer");
		Employee e3=new Employee(105,"Ketan",12,"Mumbai","Developer");
		Employee e4=new Employee(106,"Amit",13,"Banglore","Developer");
		Employee e5=new Employee(107,"Ketan",12,"Mumbai","Developer");
		Employee e6=new Employee(108,"Amit",13,"Banglore","Developer");
		Employee e7=new Employee(109,"Ketan",12,"Mumbai","Developer");
		Employee e8=new Employee(110,"Amit",13,"Banglore","Developer");
		Employee e9=new Employee(111,"Ketan",12,"Mumbai","Developer");
		Employee e10=new Employee(112,"Amit",13,"Banglore","Developer");
		Employee e11=new Employee(113,"Ketan",12,"Mumbai","Developer");
		Employee e12=new Employee(114,"Amit",13,"Banglore","Developer");
		Employee e13=new Employee(115,"Ketan",12,"Mumbai","Developer");
		Employee e14=new Employee(116,"Amit",13,"Banglore","Developer");
		
		empRepo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14));       //Save takes single entity where SaveAll takes Arrays list of object
		System.out.println("Done inserting records");

		/*Iterable<Employee> iterable=empRepo.findAll();  //
		iterable.forEach(val ->{
			System.out.println(val);
		});
		
		Optional<Employee> emp=empRepo.findById(101);   //FindById method is use to find value using id which will give optional
		if(emp.isPresent())
		{
			System.out.println(emp.get());
		}*/
		
/*		Iterable<Employee> allEmp=empRepo.findAllById(Arrays.asList(101,102,103));    //findAllById use to find values based on id's
		allEmp.forEach(val ->{
			System.out.println("Data"+val);
		}); */
		
/*
 * boolean data=empRepo.existsById(101); //ExistsById method use to check entity
 * based on id if(data) { System.out.println("Present"); }
 */
	
/*
 * int data=(int) empRepo.count(); System.out.println(data);     //count use to find number of records present in table
 */
/*
 * PageRequest pageRequest=PageRequest.of(1, 5);                              //first we need to create pageRequest object and we need to maintion page index and page size
 * Page<Employee>pageData=empRepo.findAll(pageRequest);                       //Then we have to pass that object in findAll method  
 * List<Employee> data=pageData.getContent();                                 //Then we need to get the content of that data and iterate through it
 * data.forEach(val->
 * {
 *  System.out.println(val); 
 * });
 */
		 
		/*List<Employee> findAll=empRepo.findAll(Sort.by("empAge").descending());   //If we want to sort data based on particular parameter then we need to pass that parameter in findAll method and we need to defind Sort.by().ascending()
		findAll.forEach(val->{
			System.out.println(val);
		});*/
		
        /*Employee emp=new Employee();
        emp.setEmpAge(10);
        emp.setEmpCity("Mumbai");
        
        Example obj=Example.of(emp);
        List<Employee> findAll=empRepo.findAll(obj);
        findAll.forEach(val->{
        	System.out.println(val);
        });*/
		
		/*List<Employee> emp=empRepo.findByEmpName("Rohan");              //Find employee based on name
		emp.forEach(val->{
			System.out.println(val);
		});*/
		
		/*List<Employee> emp=empRepo.findByEmpAgeLessThanEqual(12);
		emp.forEach(val->{
			System.out.println(val);
		});*/
		
		/*Optional<Employee> emp=empRepo.findById(112);
		if(emp.isPresent())
		{
			System.out.println(emp);
		}*/
		
		
		List<Employee> emp=empRepo.findAll(Sort.by("empName","empAge").ascending());
		emp.forEach(val->{
			System.out.println(val);
		});
		
	}

}
