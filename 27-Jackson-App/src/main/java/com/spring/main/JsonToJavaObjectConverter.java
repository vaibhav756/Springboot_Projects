package com.spring.main;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.binding.Student;

public class JsonToJavaObjectConverter {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
	
		ObjectMapper om=new ObjectMapper();
        Object obj=om.readValue(new File("Student.json"),Student.class);
		Student stud=(Student)obj;
		System.out.println(stud);
		System.out.println("Student id is"+stud.getSid());
		System.out.println("Student name is"+stud.getSname());
		System.out.println("Student rank is"+stud.getSrank());

	}

}
