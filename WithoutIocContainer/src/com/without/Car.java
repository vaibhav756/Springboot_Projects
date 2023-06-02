package com.without;
public class Car {

	public IEngine eng;
	
	/*public Car(IEngine eng)
	{
		this.eng=eng;
	}*/
	
	public void setEng(IEngine eng)
	{
		System.out.println("Inside Setter Injection of Car");
		this.eng=eng;
	}
	public void run()
	{
		int status=eng.start();
		if(status==0)
		{
			System.out.println("Car is running because of Engine");
		}
	}
	
}
