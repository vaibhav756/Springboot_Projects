package com.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class welcomeController {

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg()
	{
	    String msgText="Good Morning...!!!";
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("msg",msgText);
		return mv;
		
	}
	
}
