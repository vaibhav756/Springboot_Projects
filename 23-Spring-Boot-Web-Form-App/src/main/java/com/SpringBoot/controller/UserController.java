package com.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBoot.binding.User;

@Controller
public class UserController {

	//Method to load empty form
	@GetMapping("/user")
	public ModelAndView loadForm()
	{
		User userObj=new User();
		ModelAndView mv=new ModelAndView("userView");
		mv.addObject("user",userObj);
		return mv;
	}
	
	//Method for handling form submission
	@PostMapping("/userResult")
	public ModelAndView handleSubmit(@ModelAttribute("user") User user)
	{
	  ModelAndView mv=new ModelAndView("userView");
	  String name="User Name is "+user.getUname();
	  String email="User Email is "+user.getEmail();
	  String mobile="User Mobile number is "+user.getPhno();
	  
	  mv.addObject("name",name);
	  mv.addObject("email",email);
	  mv.addObject("mobile",mobile);
	  
	  return mv;
	}
}
