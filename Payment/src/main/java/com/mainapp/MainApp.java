package com.mainapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.payment.PayBill;

public class MainApp {

	public static void main(String[] args) {
		//Resource resource=new ClassPathResource("config.xml");
		
		Resource resource=new FileSystemResource("config.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		PayBill bill=factory.getBean(PayBill.class);
		
	    bill.pay(1000);	
	    		
	    		

	    //ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		//PayBill bill=context.getBean(PayBill.class);
		//bill.pay(1000);
	}

}
