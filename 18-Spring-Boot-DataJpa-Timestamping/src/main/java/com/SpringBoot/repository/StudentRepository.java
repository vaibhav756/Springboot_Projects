package com.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
