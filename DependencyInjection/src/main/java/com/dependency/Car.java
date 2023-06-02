package com.dependency;

public class Car {

	public IEngine engine;
	private String tyre;
	private String speed;
	
	public void setTyre(String tyre)
	{
		this.tyre=tyre;
	}
	public IEngine getEngine() {
		return engine;
	}
	public String getTyre() {
		return tyre;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String Speed)
	{
		this.speed=Speed;
	}
	
	/*public void setEngine(IEngine engine)
	{
		this.engine=engine;
	}*/
	
	public Car(IEngine engine)
	{
		this.engine=engine;
	}
	public void execute()
	{
		if(engine.run()==0)
		{
			System.out.println("Car is running because of Engine");
		}
		System.out.println("Car Tyre type is "+tyre+".It has speed of "+speed);
		
	}
	
}
