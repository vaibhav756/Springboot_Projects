package com.SpringBoot.serviceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.SpringBoot.request.Passenger;
import com.SpringBoot.response.Ticket;
import com.SpringBoot.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	private Map<String,Ticket> ticketMap=new HashMap<>();
	
	@Override
	public Ticket bookTicket(Passenger passenger) {

		String ticketNum=UUID.randomUUID().toString().replace("-", "");
		
		Ticket ticket=new Ticket();
		ticket.setName(passenger.getName());
		ticket.setEmail(passenger.getEmail());
		ticket.setFrom(passenger.getFrom());
		ticket.setTo(passenger.getTo());
		ticket.setPhno(passenger.getPhno());
		ticket.setJdate("25 Apr 2022");
		ticket.setTrainNum(passenger.getTrainNum());
		ticket.setTicketNum(ticketNum);
		ticket.setTicketStatus("Booked Ticket");
		ticket.setTicketPrice(1200.00);
		
        ticketMap.put(ticketNum, ticket);
		return ticket;
	}

	@Override
	public Ticket getTicket(String ticketNum) {
		
		if(ticketMap.containsKey(ticketNum))
		{
			return ticketMap.get(ticketNum);
		}
		else
		{
			return null;			
		}

	}

}
