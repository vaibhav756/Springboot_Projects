package com.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@GetMapping("/user")
	public ModelAndView getUserDetails(@RequestParam("fname") String fname,@RequestParam("lname") String lname,@RequestParam("age") int age)
	{
		ModelAndView mv=new ModelAndView("UserView");
		String firstName=fname;
		String lastName=lname;
		int eage=age;
		mv.addObject("lname",lastName);
		mv.addObject("fname",firstName);
		mv.addObject("age",eage);
		return mv;
	}
	
	
}
