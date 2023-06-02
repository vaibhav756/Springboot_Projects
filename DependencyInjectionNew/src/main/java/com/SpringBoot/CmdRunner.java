package com.SpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;
@Repository
public class CmdRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Command Line Runner executed");	
	}
}
