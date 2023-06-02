package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBoot.binding.Pet;
import com.SpringBoot.service.PetService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		
		/*
		 * String endpointUrl=
		 * "https://vur3ednzag.execute-api.ap-south-1.amazonaws.com/prod/pets";        //Use for retriving array of Pet Object
		 * RestTemplate rt=new RestTemplate(); ResponseEntity<Pet[]>
		 * response=rt.getForEntity(endpointUrl,Pet[].class); Pet[]
		 * petInfo=response.getBody(); for(Pet pet:petInfo) { System.out.println(pet); }
		 */
		/*
		 * String
		 * url="https://vur3ednzag.execute-api.ap-south-1.amazonaws.com/prod/pets/1";  //User for retrieving particular Pet Object using petId
		 * RestTemplate rt=new RestTemplate(); ResponseEntity<Pet>
		 * response=rt.getForEntity(url,Pet.class);
		 * 
		 * System.out.println(response.getBody());
		 */
	     
		/*
		 * PetService ptServ=context.getBean(PetService.class); Pet
		 * pet=ptServ.getPet(2); System.out.println(pet);
		 */
		
		
		/*
		 * PetService ptServ=context.getBean(PetService.class); Pet[]
		 * pt=ptServ.getAllPets(); for(Pet pet:pt) { System.out.println(pet); }
		 */
		
		PetService ptServ=context.getBean(PetService.class);
		ptServ.addPet();                                                  //Use to add new Pet Object
		
		
	}

}
