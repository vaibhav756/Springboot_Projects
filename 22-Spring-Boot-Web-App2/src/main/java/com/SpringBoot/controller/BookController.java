package com.SpringBoot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBoot.bindings.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public ModelAndView getBookData()
	{
		ModelAndView mv=new ModelAndView("bookView");
		Book book=new Book(110,"Angular",100.00);
		mv.addObject("book",book);
		return mv;
	}
	
	@GetMapping("/books")
	public ModelAndView getBooksData()
	{
		ModelAndView mv=new ModelAndView("booksView");
		
		Book book1=new Book(101,"Spring",1000.00);
		Book book2=new Book(102,"Spring Boot",2000.00);
		Book book3=new Book(103,"Java Core",3000.00);
		Book book4=new Book(104,"Python",4000.00);
		
		List<Book> books=Arrays.asList(book1,book2,book3,book4);
		mv.addObject("books",books);
		
        return mv;
	}
	
}
