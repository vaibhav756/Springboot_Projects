package com.SpringBoot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component()
public class Engine {

	@PostConstruct
	public void Start()
	{
		System.out.println("Start method called");
	}
	@PreDestroy
	public void Stop()
	{
		System.out.println("Stop method called");
	}
	
}
