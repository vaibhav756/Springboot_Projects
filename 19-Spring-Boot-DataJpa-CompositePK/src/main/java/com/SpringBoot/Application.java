package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBoot.service.AccountService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		AccountService accountRepo=context.getBean(AccountService.class);
		accountRepo.saveAccData();
		accountRepo.getDataUsingPK();
		
		
	}

}
