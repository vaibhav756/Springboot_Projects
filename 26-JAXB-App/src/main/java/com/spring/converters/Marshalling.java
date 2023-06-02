package com.spring.converters;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.spring.binding.Student;

public class Marshalling {

	public static void main(String[] args) {
		Student student=new Student();
	    student.setId(101);
	    student.setName("RAJU");
        student.setRank(1);
        
        /*Student student1=new Student();
        student1.setId(102);
	    student1.setName("KETAN");
        student1.setRank(2);
        
        List<Student> list=new ArrayList<Student>();
   
	    list.add(student);
	    list.add(student1); */
	    try {
			JAXBContext instance=JAXBContext.newInstance(Student.class);
			Marshaller marshaller=instance.createMarshaller();
			marshaller.marshal(student,new File("Student.xml"));
			marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(student, System.out);
	        System.out.println("Marshalling Done......");
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("In exception");
		}  
	}
	
}
