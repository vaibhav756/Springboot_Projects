package com.SpringBoot.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestBodySpec;

import com.SpringBoot.request.Passenger;
import com.SpringBoot.response.Ticket;

@Service
public class MakeMyTripService {

	public void bookTicket()
	{
		String apiUrl="https://ashokit-app-irctc.herokuapp.com/ticket";
		Passenger passenger=new Passenger();
		passenger.setEmail("yvaibhav756@gmail.com");
		passenger.setFrom("Mumbai");
		passenger.setTo("Pune");
		passenger.setJdate("5 May 2022");
        passenger.setName("Vaibhav Kamlakar Yadav");
        passenger.setTrainNum(7890);
        WebClient client=WebClient.create();
        Ticket ticket=client.post()
        .uri(apiUrl)
        .bodyValue(passenger)
        .retrieve()
        .bodyToMono(Ticket.class)
        .block();
        System.out.println(ticket);
        
        
		
	}
	
	public void getTicketSync(String TicketNum)
	{
		String apiUrl="https://ashokit-app-irctc.herokuapp.com/ticket/"+TicketNum;
		WebClient client=WebClient.create();
		Ticket ticket=client.get()
		.uri(apiUrl)
		.retrieve()
		.bodyToMono(Ticket.class)
		.block();
		
		System.out.println(ticket);
		
	}
	
	
	public void getTicketAsync(String TicketNum)
	{
		String apiUrl="https://ashokit-app-irctc.herokuapp.com/ticket/"+TicketNum;
		WebClient client=WebClient.create();
		client.get()
		.uri(apiUrl)
		.retrieve()
		.bodyToMono(Ticket.class)
		.subscribe(MakeMyTripService::ticketResponseHandler);
		
		System.out.println("Logic executing after sending request");
		
	}
	
	public static void ticketResponseHandler(Ticket ticket)
	{
		System.out.println("Response Received from Api...");
		System.out.println(ticket);
	}
}
