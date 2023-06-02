package com.SpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import com.SpringBoot.entity.Book;
import com.SpringBoot.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		BookRepository bookRepo=context.getBean(BookRepository.class);
		Book b1=new Book();
		b1.setBookId(101);
		b1.setBookName("Spring");
		b1.setBookPrice(100);
		
		Book b2=new Book();
		b2.setBookId(102);
		b2.setBookName("AWS");
		b2.setBookPrice(200);
		
		Book b3=new Book();
		b3.setBookId(103);
		b3.setBookName("JavaScript");
		b3.setBookPrice(300);
		
		Book b4=new Book();
		b4.setBookId(104);
		b4.setBookName("Python");
		b4.setBookPrice(400);
		
		Book b5=new Book();
		b5.setBookId(105);
		b5.setBookName("SpringBoot");
		b5.setBookPrice(500);
		
		
		bookRepo.saveAll(Arrays.asList(b1,b2,b3,b4,b5));
		
		Book book=bookRepo.findByBookName("Spring");
		System.out.println(book);
		
		/*(List<Book> bookPrice=bookRepo.findByBookPriceLessThanEqual(300);
		bookPrice.forEach(val->{
			System.out.println(val);
		});*/
		
		/*List<Book>Book=bookRepo.findByBookPriceBetween(100,400);
		Book.forEach(val->{
			System.out.println(val);
		});*/
		
		/*List<Book> book1=bookRepo.findByBookNameAndBookPrice("SpringBoot",500);
		book1.forEach(val->{
			System.out.println(val);
		});*/
		
		/*List<Book> booksIn=bookRepo.findByBookNameIn(Arrays.asList("Spring","SpringBoot","Python"));
		booksIn.forEach(val->{
			System.out.println(val);
		});*/
		
		/*List<Book> bookEndWith=bookRepo.findByBookNameEndingWith('t');
		bookEndWith.forEach(val->{
			System.out.println(val);
		});*/
		
		List<Book> like=bookRepo.findByBookNameIsLike("%t");
		like.forEach(val->{
			System.out.println(val);
		});
		
		
		
	}

}
