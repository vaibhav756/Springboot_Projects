package com.SpringBoot.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.SpringBoot.binding.Pet;

@Service
public class PetService {

	
	public Pet getPet(int petId)
	{
		String Url="https://vur3ednzag.execute-api.ap-south-1.amazonaws.com/prod/pets/"+petId;
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Pet> response=rt.getForEntity(Url,Pet.class);
		return response.getBody();
	}
	
	public Pet[] getAllPets()
	{
		String Url="https://vur3ednzag.execute-api.ap-south-1.amazonaws.com/prod/pets";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Pet[]> response=rt.getForEntity(Url,Pet[].class);
		return response.getBody();
	}
	
	public void addPet()
	{
		String Url="https://vur3ednzag.execute-api.ap-south-1.amazonaws.com/prod/pets";
		Pet p=new Pet();
		p.setId(4);
		p.setType("Dog");
		p.setPrice(10000.00);
		
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> response=rt.postForEntity(Url,p,String.class);
		System.out.println(response);
		
	}
	
}
