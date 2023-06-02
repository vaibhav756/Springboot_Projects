package com.SpringBoot.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.exception.ApiError;

@RestController
public class CalculatorRestController {

	@GetMapping("/sum")
	public String sum()
	{
		int a=10;
		int b=20;
		int result=a+b;
		return "Sum of result :: "+result;
	}
	
	@GetMapping("/div")
	public String div()
	{
		int a=100;
		int b=0;
		int result=a/b;
		return "Sum of result :: "+result;
	}
	
	
	
}
