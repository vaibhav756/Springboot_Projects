package com.spring.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.spring.binding.Student;

public class Unmarshalling {
	public static void main(String[] args) throws JAXBException {
		
		JAXBContext instance=JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller=instance.createUnmarshaller();
		Object obj=unmarshaller.unmarshal(new File("Student.xml"));
		Student stud=(Student)obj;
		System.out.println(stud);
	}
}
