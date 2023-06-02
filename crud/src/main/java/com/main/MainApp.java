package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Employee.Employee;

public class MainApp {

	public static void main(String[] args) {
    
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee emp=context.getBean("Employee",Employee.class);
		emp.role();
	}

}
