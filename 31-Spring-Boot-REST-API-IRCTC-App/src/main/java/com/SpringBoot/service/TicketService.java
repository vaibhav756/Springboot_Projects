package com.SpringBoot.service;

import org.springframework.stereotype.Service;

import com.SpringBoot.request.Passenger;
import com.SpringBoot.response.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger passenger);    //Pass the data and get the ticket
	
	public Ticket getTicket(String ticketNum);
	
}
