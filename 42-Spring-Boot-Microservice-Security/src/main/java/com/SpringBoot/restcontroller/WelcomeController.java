package com.SpringBoot.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public void welcome()
	{
		System.out.println("Welcome to Mumbai");
	}
	
}
