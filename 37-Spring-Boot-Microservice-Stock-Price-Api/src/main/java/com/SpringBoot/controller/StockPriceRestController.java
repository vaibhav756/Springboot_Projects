package com.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.binding.StockPrice;
import com.SpringBoot.repo.StockPriceRepository;

@RestController
public class StockPriceRestController {

	@Autowired
	private StockPriceRepository repo;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/price/{cname}")
	public ResponseEntity<StockPrice> getStockPrice(@PathVariable String cname)
	{
		StockPrice stockPrice=repo.findByCompanyName(cname);
		stockPrice.setPortNumber(env.getProperty("server.port"));
		return new ResponseEntity<>(stockPrice,HttpStatus.OK);
	}
}
