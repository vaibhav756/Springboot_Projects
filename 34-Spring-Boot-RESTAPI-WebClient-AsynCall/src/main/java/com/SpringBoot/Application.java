package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBoot.service.MakeMyTripService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		MakeMyTripService clientService=context.getBean(MakeMyTripService.class);
		//clientService.bookTicket();
		//clientService.getTicketSync("910bf4939adc4cafb0cb7ece745acc9e");
		clientService.getTicketAsync("6bc7c48d7f0b4539ab95d6779189c896");
	}

}
