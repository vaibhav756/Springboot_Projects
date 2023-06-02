package com.without;

public class Engine implements IEngine {
	
	public Engine()
	{
		System.out.println("Inside Engine Constructor");
	}

	@Override
	public int start(){
		System.out.println("Inside Engine Class");
		return 0;
	}

}
