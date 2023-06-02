package com.SpringBoot.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository()
public class IUserChildDao implements IUser{

	@Override
	public String findById() {
		return "Child Implementation";
	}

}
