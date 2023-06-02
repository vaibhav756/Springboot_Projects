package com.SpringBoot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathParamController {

	@GetMapping("/book/{bookId}")
	public ResponseEntity<String> bookInfo(@PathVariable("bookId")String bookId)
	{
	    int bookId1=Integer.parseInt(bookId);
	    String info="";
	    if(bookId1==101)
	    {
	    	info="BookName is SpringBoot";
	    }
	    else
	    {
	    	info="BookName is AWS";
	    }
		return new ResponseEntity(info,HttpStatus.OK);
	}
}
