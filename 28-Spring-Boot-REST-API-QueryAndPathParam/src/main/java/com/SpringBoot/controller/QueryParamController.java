package com.SpringBoot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryParamController {

	@GetMapping("/courseInfo")
	public ResponseEntity<String> courseInfo(@RequestParam("courseName")String courseName,@RequestParam("trainer")String trainer)
	{
		String info="Course name is"+courseName+" and Trainer name is "+trainer;
		return new ResponseEntity<>(info,HttpStatus.OK);
	}
	
}
