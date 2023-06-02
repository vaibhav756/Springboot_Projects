package com.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {

	@GetMapping("/greet")
	public ModelAndView greet()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Greet");
		String msg="Greet from Mumbai";
		mv.addObject("msg",msg);
		return mv;
	}
	
	
}
