package com.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@GetMapping("/product/{id}/{name}")
	public ModelAndView getProductId(@PathVariable("id") int id,@PathVariable("name") String name)
	{
		String msg="Product id is "+id+" and ProductName is "+name;
		ModelAndView mv=new ModelAndView("product");
		mv.addObject("msg",msg);
		return mv;
	}
	
	
}
