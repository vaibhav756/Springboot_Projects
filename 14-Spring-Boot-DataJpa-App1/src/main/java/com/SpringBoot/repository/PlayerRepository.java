package com.SpringBoot.repository;

import org.springframework.data.repository.CrudRepository;

import com.SpringBoot.entity.Player;

public interface PlayerRepository extends CrudRepository<Player,Integer>{
	
}
