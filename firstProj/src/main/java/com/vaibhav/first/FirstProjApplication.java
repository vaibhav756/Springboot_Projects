package com.vaibhav.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(FirstProjApplication.class, args);
		
		Animal an=context.getBean(Animal.class);
		an.code();
		
	}

}
