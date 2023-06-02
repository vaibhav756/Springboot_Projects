package com.SpringBoot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseEntityController {
	
	@GetMapping("/welcome")
	public String welcome()
	{
		String msg="Welcome to Mumbai";
		return msg;
	}

	@GetMapping("/greet")
	public ResponseEntity greet()
	{
		String msg="Greeting from Mumbai";
		return new ResponseEntity(msg,HttpStatus.OK);
	}
	
	
}
