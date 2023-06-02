package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;

import com.SpringBoot.binding.Ticket;
import com.SpringBoot.service.TicketService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		TicketService serv = context.getBean(TicketService.class);
		ResponseEntity<Ticket> ticket = serv.bookTicket();
		//System.out.println(ticket);

		
	    Ticket ticketVal=serv.getTicket("69c6ed2fcdea4e30a247a44b81eca547");
		System.out.println(ticketVal);
		

	}

}
