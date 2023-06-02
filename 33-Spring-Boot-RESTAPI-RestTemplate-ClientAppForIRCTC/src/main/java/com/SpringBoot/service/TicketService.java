package com.SpringBoot.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.SpringBoot.binding.Passenger;
import com.SpringBoot.binding.Ticket;

@Service
public class TicketService {

	
	public ResponseEntity<Ticket> bookTicket()
	{
		String Url="https://ashokit-app-irctc.herokuapp.com/ticket";
		Passenger p=new Passenger();
		p.setEmail("yvaibhav756@gmail.com");
		p.setFrom("Mumbai");
		p.setJdate("30Apr2022");
		p.setName("Vaibhav Yadav");
		p.setTo("Pune");
	    p.setTrainNum(7890);
	    
	    RestTemplate rt=new RestTemplate();
	    ResponseEntity<Ticket> response=rt.postForEntity(Url,p,Ticket.class);
	    return response;
	}
	
	
	public Ticket getTicket(String ticket)
	{
		String Url="https://ashokit-app-irctc.herokuapp.com/ticket/{ticket}";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Ticket> response=rt.getForEntity(Url,Ticket.class,ticket);
		return response.getBody();
	}
	
}
