package com.vaibhav.Collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionDemoApplication.class, args);
		
		LinkedList<String> arl=new LinkedList<String>();
		arl.add("Vaibhav");
		arl.add("Ketan");
		arl.add("Amit");
		arl.add("Rohan");
		arl.add("Vaibhav");
		arl.add("Amit");
		arl.add("Rohan");
        arl.add(2,"Amay");
        arl.indexOf("Vaibhav");
		arl.remove(2);
		arl.remove("Vaibhav");
		arl.set(3,"Kiran");
		
		//System.out.println(arl);
		//System.out.println(arl.indexOf("Amay"));
       
		Map<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(101,"Amar");
		mp.put(102,"Vaibhav");
		mp.put(103,"Amit");
		mp.put(104,"Rohan");
		
		System.out.println(mp.get(101));
		Set<Integer> key=mp.keySet();
        for(Integer k:key)
        {
        	//System.out.println(k+" "+k.getValue);
        }
		
		
		
	}

}
