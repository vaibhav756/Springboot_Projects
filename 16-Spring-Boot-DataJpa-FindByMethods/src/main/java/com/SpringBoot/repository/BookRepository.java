package com.SpringBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{
	
	public Book findByBookName(String name);
	public List<Book> findByBookNameAndBookPrice(String name,Integer price);
	public List<Book> findByBookPriceLessThanEqual(Integer price);
	public List<Book> findByBookPriceBetween(Integer from,Integer to);
	public List<Book> findByBookNameIn(List<String> name);
	public List<Book> findByBookNameEndingWith(char x);
	public List<Book> findByBookNameIsLike(String like);


}
