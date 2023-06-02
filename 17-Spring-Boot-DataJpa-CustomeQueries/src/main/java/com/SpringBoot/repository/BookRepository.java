package com.SpringBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringBoot.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

	@Query("from Book")
	public List<Book> getAllBook();
	
	@Query("select bookId,bookName from Book where bookPrice=:bookPrice")
	public List<Object[]> getIdAndName(Integer bookPrice);
	
	@Query("select bookName,bookPrice from Book where bookId=:bookId")
	public List<Object[]> getNameAndPrice(Integer bookId);
	
	
}
