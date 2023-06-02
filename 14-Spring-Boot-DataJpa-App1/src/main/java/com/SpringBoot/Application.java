package com.SpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBoot.entity.Player;
import com.SpringBoot.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		PlayerRepository playerRepo=context.getBean(PlayerRepository.class);
		/*
		 * Player p1=new Player(); p1.setPlayerId(101); p1.setPlayerName("Vaibhav");
		 * p1.setPlayerAge(10); p1.setPlayerGender("Male"); p1.setPlayerCity("Mumbai");
		 * 
		 * playerRepo.save(p1); //Save method is use to save object into table
		 * 
		 * //System.out.println("Done.....!!!");
		 * 
		 * Player p2=new Player(); p2.setPlayerId(102); p2.setPlayerName("Rohan");
		 * p2.setPlayerAge(10); p2.setPlayerGender("Male"); p2.setPlayerCity("Dubai");
		 * 
		 * playerRepo.save(p2);
		 * 
		 * //System.out.println("Done2.....!!!");
		 * 
		 * Player p3=new Player(); p3.setPlayerId(103); p3.setPlayerName("Rohan");
		 * p3.setPlayerAge(10); p3.setPlayerGender("Male"); p3.setPlayerCity("Dubai");
		 * 
		 * playerRepo.save(p3);
		 
		
		
		 
		Optional<Player> findById=playerRepo.findById(104);
		if(findById.isPresent())
		{
			System.out.println(findById.get());
		}
		
		
		
		Player p1=new Player();
		p1.setPlayerId(104);
		p1.setPlayerName("Vaibhav");
		p1.setPlayerAge(20);
		p1.setPlayerGender("Male");
		p1.setPlayerCity("Mumbai");
				
		Player p2=new Player();
		p2.setPlayerId(105);
		p2.setPlayerName("Amar");
		p2.setPlayerAge(25);
		p2.setPlayerGender("Male");
		p2.setPlayerCity("Dubai");
		
		
		Player p3=new Player();
		p3.setPlayerId(106);
		p3.setPlayerName("Kishan");
		p3.setPlayerAge(45);
		p3.setPlayerGender("Male");
		p3.setPlayerCity("Dubai");
		
        playerRepo.saveAll(Arrays.asList(p1,p2,p3));
        System.out.println("Done...!!!");        
        */
		
		/*Optional<Player> data=playerRepo.findById(105);
		if(data.isPresent())
		{
			System.out.println(data.get());
		}*/
		
		/*List<Player> players=(List<Player>) playerRepo.findAllById(Arrays.asList(104,105,106));
		players.forEach(val->{
			System.out.println(val);
		});*/
		
/*		boolean entry=playerRepo.existsById(105);
		System.out.println("Entity is exist "+entry);*/
		
		//playerRepo.deleteAll();
        //playerRepo.deleteById(105);		
		//playerRepo.deleteAllById(Arrays.asList(101,102,103));
		
		long count=playerRepo.count();
		System.out.println(count+" records are present in player table");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


/*                              CrudRepository
 * CrudRepository is use to perform crud operation in dataJpa
 * CrudRepository is an interface which contains several methods like(save,saveAll,findAll,findById,existById,findAllById,deleteById,DeleteAllById,count)
 * repo.save method takes only object whereas repo.saveAll takes array.asList(a,b,c) objects.
 * repo.findById Method is use to find particular entity in table based on Id.
 * repo.findAllById method is use to find list of entities available in table based on arrayList of entity.
 * repo.isexistsById is use to existance of record based on Id.
 * repo.count will provide count of records in table
 * 
*/


