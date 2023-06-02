package com.spring.main;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.binding.Student;

public class JavaToJsonConverter {

	public static void main(String[] args) throws IOException {
		
		Student stud=new Student();
		stud.setSid(101);
		stud.setSname("Vaibhav");
		stud.setSrank(1);
		
		ObjectMapper om=new ObjectMapper();
		String data=om.writeValueAsString(stud);
		om.writeValue(new File("Student.json"),stud);
		//om.writeValue(new File("Student.json"), stud);
		System.out.println(data);
       /*Student student=om.readValue(data,Student.class);
       System.out.println(student);
       
       System.out.println(student.getSid());
       System.out.println(student.getSname());
       System.out.println(student.getSrank());*/
	}

}
