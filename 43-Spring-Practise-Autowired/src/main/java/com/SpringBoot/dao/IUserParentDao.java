package com.SpringBoot.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository()
@Primary()
public class IUserParentDao implements IUser{

	@Override
	public String findById() {
		return "Parent Implementation";
	}

}
