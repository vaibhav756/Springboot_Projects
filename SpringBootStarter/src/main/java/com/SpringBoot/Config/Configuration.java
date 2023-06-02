package com.SpringBoot.Config;

import org.springframework.context.annotation.Bean;

import in.SpringBoot.Dog;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	public Configuration()
	{
		System.out.println("Configuration class constructor");
	}
	@Bean
	public Dog getDog()
	{
		Dog puppy=new Dog();
	    return puppy;	
	}

}
