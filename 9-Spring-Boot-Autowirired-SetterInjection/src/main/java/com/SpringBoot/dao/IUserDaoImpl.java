package com.SpringBoot.dao;

import org.springframework.stereotype.Repository;

@Repository("normal")
public class IUserDaoImpl implements IUserDao {

	@Override
	public String findNameById(int id) {
		return "John";
	}

}
