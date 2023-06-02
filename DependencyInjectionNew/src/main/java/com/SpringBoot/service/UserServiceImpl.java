package com.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.SpringBoot.dao.IUser;
@Service
public class UserServiceImpl {
    @Autowired
	public IUser user;
    
	public UserServiceImpl()
	{
		System.out.println("Inside UserServiceImpl constructor");
	}
	
	public void getName()
	{
		user.getNameById();
	}
}
