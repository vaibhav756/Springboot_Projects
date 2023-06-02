package com.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView displayWelcomeMsg()
	{
		ModelAndView mv=new ModelAndView();
		String msgText="Welcome to Mumbai Vaibhav";
		mv.addObject("msg",msgText);
		mv.setViewName("welcomeView");
		return mv;
	}

}
