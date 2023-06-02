package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dependency.Car;

public class MainApp {

	public static void main(String[] args) {
		
	/*Resource resource=new ClassPathResource("config.xml");	
    BeanFactory factory=new XmlBeanFactory(resource);
        Car newCar=factory.getBean("car",Car.class);
    *
    */
		
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");	
    Car newCar=context.getBean("car",Car.class);

    newCar.execute();
    
    
	}
}
