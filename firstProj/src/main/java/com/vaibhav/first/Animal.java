package com.vaibhav.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animal {
    
	@Autowired
	Laptop lap;
	
	public void code()
	{
		lap.compile();
	}
	
}
