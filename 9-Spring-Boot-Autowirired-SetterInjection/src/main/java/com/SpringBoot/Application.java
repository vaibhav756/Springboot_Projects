package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBoot.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext con=SpringApplication.run(Application.class, args);
		UserService ser=con.getBean(UserService.class);
		ser.setUser(10);
	}

}
