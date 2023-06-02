package com.SpringBoot.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("super")
@Primary()
public class IUserDaoSuperImpl implements IUserDao {

	@Override
	public String findNameById(int id) {
		return "Smith";
	}

}
