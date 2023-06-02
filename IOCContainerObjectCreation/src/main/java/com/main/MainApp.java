package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.ioccontainer.Car;

public class MainApp {

	public static void main(String[] args) {
		
//		Resource resource=new ClassPathResource("config.xml");    //If our xml file is present in ClassPath
//		BeanFactory factory=new XmlBeanFactory(resource);
		Resource resource=new FileSystemResource("config.xml");   //If our xml file is not present in ClassPath
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Car newCar=factory.getBean(Car.class);
		
		Car newCar1=factory.getBean(Car.class);
		
		System.out.println("First Object"+newCar);
		System.out.println("Second Object"+newCar1);
		
//        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        		
	}

}
/*                                   BeanFactory
 * When we start container using BeanFactory object we need to ask for bean object;
 * In BeanFactory IOC container doesnt create object for bean.We need to ask for bean
 * When we call getBean method IOC container create object for us.
 * BeanFactory follows lazy loading concept
 * 
 *                                  ApplicationContext
 * When we start container using ApplicationContext we dont need to ask for it container create it without asking
 * Whenever we start IOC container using ApplicationContext it creates object during startup only.
 * ApplicationContext follows Eagerloading concept.
 * ApplicationContext has more feature than BeanFactory.It has some additional feature like Event Handling,I18N WebApp Support.
 * ApplicationContext is called as superior to BeanFactory
 * 
 */