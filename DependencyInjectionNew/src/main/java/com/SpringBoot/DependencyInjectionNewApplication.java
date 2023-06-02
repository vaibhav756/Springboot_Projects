package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBoot.service.UserServiceImpl;

@SpringBootApplication
public class DependencyInjectionNewApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DependencyInjectionNewApplication.class, args);
        UserServiceImpl impl=context.getBean(UserServiceImpl.class);
        impl.getName();
	}

}
