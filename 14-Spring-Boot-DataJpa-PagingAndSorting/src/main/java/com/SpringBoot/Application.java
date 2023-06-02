package com.SpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.SpringBoot.entity.Book;
import com.SpringBoot.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		BookRepository bookRepo=context.getBean(BookRepository.class);
		
		Book b1=new Book(101,"Spring",450);
		Book b2=new Book(102,"Python",550);
		Book b3=new Book(103,"AWS",650);
		Book b4=new Book(104,"Full Stack Dev",750);
		
		bookRepo.save(b4);                                                                 //Save is use to save single object
		
/*		Optional book=bookRepo.findById(104);                                              //findById is use to find record based on Id it gives us an optional
		if(book.isPresent())                                                               //Optional contains null/non-null value.using isPresent() we can check if data is present or not
		{
			System.out.println(book);                                                         
		}
*/		
		
		
		
		
		
		
		bookRepo.saveAll(Arrays.asList(b1,b2,b3));                                         //Save all is use to save object as arrayList
		
		/*Iterable <Book> findAllById=bookRepo.findAllById(Arrays.asList(101,102,103));    //findAllById takes arrays for list and it finds record from table based on list ids which contains ids
		                                                                                   //findAllById gives us Iterable class object which contains list of records
		findAllById.forEach(val->{                                                         //forEach method is introduce in java 8 which is same as callback in JavaScript
			System.out.println(val);
		});
		*/
		
		/*Iterable<Book> findAll=bookRepo.findAll();                                       //It is use to findAll records in the table
		findAll.forEach(val->{
			System.out.println(val);
		});*/
		
		//bookRepo.deleteById(103);                                                          //Use to delete record based on Id
		
		//bookRepo.deleteAllById(Arrays.asList(101,102,103,104));                          //Based on ids we can delete records from the table
		                                                                                   //While passing multiple data pass as Arrays.asList
	    PageRequest pageRequest=PageRequest.of(0, 10);                                     //First we need to create object of PageRequest required page records
	    Page<Book> page=bookRepo.findAll(pageRequest);                                     //Then we need to pass that object in findAll method
	    List<Book> book=page.getContent();                                                 //Then we need to retrieve records from page request object
	    book.forEach(val->{
	    	System.out.println(val);
	    });
		
	    
	    System.out.println("----------------------------------------------------------------------------------------------------");
	    
	    List<Book> sortBook=bookRepo.findAll(Sort.by("bookName").ascending());              //use to sort record based on bookName with ascending order
	    sortBook.forEach(val->{
	    	System.out.println(val);
	    });
	}

}
