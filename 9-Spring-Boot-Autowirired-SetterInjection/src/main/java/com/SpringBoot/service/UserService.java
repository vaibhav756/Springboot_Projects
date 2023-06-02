package com.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.SpringBoot.dao.IUserDao;

@Service()
public class UserService {

	public IUserDao user;
	@Autowired
	public void setUser(IUserDao user)
	{
		this.user=user;
	}
	public void setUser(int val)
	{
		System.out.println(user.findNameById(val));
	}
	
}
