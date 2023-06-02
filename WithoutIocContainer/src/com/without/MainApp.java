package com.without;

public class MainApp {
	
	public static void main(String args[])
	{
		Engine newEngine=new Engine();
		Car newCar=new Car();
		newCar.setEng(newEngine);
		newCar.run();	
	}
	
}
