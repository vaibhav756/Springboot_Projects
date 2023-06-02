package com.SpringBoot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.binding.Passanger;
import com.SpringBoot.binding.Ticket;

@RestController
public class ContentTypeAndConsumeController {

	@PostMapping(value="/ticket",consumes= {"application/json","application/xml"},produces= {"application/json","application/xml"})
	public ResponseEntity getPassanger(@RequestBody Passanger passenger)
	{

        Ticket ticket=new Ticket();
        ticket.setName(passenger.getName());
        ticket.setEmail(passenger.getEmail());
        ticket.setFrom(passenger.getFrom());
        ticket.setTo(passenger.getTo());
        ticket.setTicketNo(789);
        ticket.setTrainNum(passenger.getTrainNum());
        ticket.setTrainTime("12am 28Apr 2022");
		System.out.println(ticket);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	
}
