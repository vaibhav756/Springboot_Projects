package com.SpringBoot.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository()
public class UserDaoSuperImpl implements IUser {

	public UserDaoSuperImpl()
	{
		System.out.println("Inside UserDaoSuperImpl constructor");
	}
	@Override
	public void getNameById() {
		System.out.println("UserDaoSuperImpl");
	}

}
