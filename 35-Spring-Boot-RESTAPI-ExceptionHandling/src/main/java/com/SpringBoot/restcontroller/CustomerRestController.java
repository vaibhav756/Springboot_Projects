package com.SpringBoot.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.exception.NoCustomerFoundException;

@RestController
public class CustomerRestController {

	@GetMapping("/customer/{custId}")
	public ResponseEntity<String> getCustomerEmail(@PathVariable("custId")Integer custId)
	{
		String email="";
		if(custId == 100)
		{
			email="yvaibhav756@gmail.com";
		}
		else
		{
			throw new NoCustomerFoundException("Invalid Customer Id");
		}
		return new ResponseEntity<String>(email,HttpStatus.OK);
	}
}
