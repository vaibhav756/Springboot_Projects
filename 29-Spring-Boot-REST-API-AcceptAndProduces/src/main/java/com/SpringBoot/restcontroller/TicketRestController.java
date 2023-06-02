package com.SpringBoot.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.binding.Ticket;

@RestController
public class TicketRestController {

	@GetMapping(value="/ticket/{ticketId}",produces= {"application/json","application/xml"})
    public ResponseEntity<String> getTicket(@PathVariable("ticketId")Integer ticketId)
    {
    	Ticket ticket=new Ticket();
    	ticket.setTicketId(ticketId);
    	ticket.setFrom("Mumbai");
    	ticket.setTo("Chennai");
    	ticket.setJdate("22-04-2022");
    	ticket.setPrice(1000.00);
    	ticket.setTrainNum(7890);
    	
    	return new ResponseEntity(ticket,HttpStatus.OK);
    	
    }
	
	
}
