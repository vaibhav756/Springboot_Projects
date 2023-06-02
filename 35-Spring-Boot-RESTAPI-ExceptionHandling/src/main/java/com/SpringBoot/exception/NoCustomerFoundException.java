package com.SpringBoot.exception;

public class NoCustomerFoundException extends RuntimeException{

	public NoCustomerFoundException()
	{
		
	}
	
	public NoCustomerFoundException(String msg)
	{
	   super(msg);	
	}
}
