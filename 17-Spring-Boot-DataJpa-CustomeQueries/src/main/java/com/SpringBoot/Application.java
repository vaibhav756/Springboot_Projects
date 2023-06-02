package com.SpringBoot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBoot.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		BookRepository bookRepo=context.getBean(BookRepository.class);
		/*List<Book> bookList=bookRepo.getAllBook();
		bookList.forEach(val->{
			System.out.println(val);
		});
		*/
		
		/*List<Object[]> obj=bookRepo.getIdAndName(500);
	    for(Object[] result:obj)
	    {
	       System.out.println(result[0]+" "+result[1]);	
	    }
		
		List<Object[]> obj=bookRepo.getNameAndPrice(103);
		for(Object[] data:obj)
		{
			System.out.println(data[0]+" "+data[1]);
		}
		*/
	}
}
