package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBoot.entity.Student;
import com.SpringBoot.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		StudentRepository studRepo=context.getBean(StudentRepository.class);
		Student s1=new Student();
		s1.setSname("Vaibhav");
		s1.setSrank(456);
		
		studRepo.save(s1);
		System.out.println("Done...!!!");
		
		Student s2=new Student();
		s2.setSname("Amit");
		s2.setSrank(7890);
		
		studRepo.save(s2);
		
		System.out.println("Added new record");
		
	}

}
