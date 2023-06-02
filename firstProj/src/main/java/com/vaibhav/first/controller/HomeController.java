package com.vaibhav.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vaibhav.first.Employee;
import com.vaibhav.first.service.EmployeeService;

@Controller
public class HomeController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView();
	    List<Employee> e=employeeService.EmpDetail();
		mv.addObject("empObject", e);
		mv.setViewName("index");
		return mv;
		//return "index";
	}
	
	
	@GetMapping("/insertPage")
	public String insertPage()
	{
		return "insert";
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(@ModelAttribute Employee e)
	{
		/*
		 * Employee Employee=new Employee(); Employee.setId(id); Employee.setName(name);
		 * Employee.setDepartment(dept); Employee.setSalary(sal);
		 */
		
		  //Employee x=new Employee(e);
		  String str=employeeService.addEmployee(e);
		  return "redirect:/insertPage";
		 
	}

	@GetMapping("/updatePage/{id}")
	public ModelAndView updateEmployee(@PathVariable String id)
	{ 
		Employee i=employeeService.getEmployee(id);
		ModelAndView mv=new ModelAndView();

		mv.addObject("id", i.getId());
		mv.addObject("name", i.getName());
		mv.addObject("gender",i.getGender());
		mv.addObject("mobile",i.getMobile());
		mv.addObject("dept", i.getDepartment());
		mv.addObject("salary", i.getSalary());
		mv.setViewName("update");
		return mv;
	}
	@PostMapping("/updateEmp")
	public String update(@ModelAttribute Employee e)
	{
		int x=employeeService.updateEmployee(e);
		return "redirect:/";
		
	}
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable String id)
	{
		 employeeService.deleteEmployee(id);
		 return "redirect:/";
	}
}
