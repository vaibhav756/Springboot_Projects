package com.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.SpringBoot.dao.IUser;
@Service
public class IUserService {

	@Autowired
	private IUser user;
	
	public void findById()
	{
		System.out.println(user.findById());
	}
}
