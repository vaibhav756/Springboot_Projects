package com.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
