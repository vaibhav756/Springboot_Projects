package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.SpringBoot.binding.Pet;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		String endpointUrl="https://vur3ednzag.execute-api.ap-south-1.amazonaws.com/prod/pets";       //This RestCall is tempory available on aws cloud
		//String endpointUrl="https://vur3ednzag.execute-api.ap-south-1.amazonaws.com/prod/pets/1";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> response=rt.getForEntity(endpointUrl,String.class);
		int status=response.getStatusCodeValue();
		if(status==200)
		{
			String body=response.getBody();
			System.out.println(body);
		}
		
		
	}

}
