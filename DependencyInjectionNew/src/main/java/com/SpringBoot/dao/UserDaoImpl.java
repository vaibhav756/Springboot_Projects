package com.SpringBoot.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository()
@Primary
public class UserDaoImpl implements IUser {

	public UserDaoImpl()
	{
		System.out.println("Inside UserDaoImpl Constructor");
	}
	
	@Override
	public void getNameById() {
		System.out.println("UserDaoImpl");

	}

}
