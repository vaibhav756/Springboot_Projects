package com.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.binding.StockPrice;
import com.SpringBoot.client.StockPriceClient;

@RestController
public class StockPriceCalcRestController {
	
	@Autowired
	private StockPriceClient client;

	@GetMapping("/calc/{cname}/{qty}")
	public ResponseEntity<String> getTotalStockPrice(@PathVariable String cname,@PathVariable Integer qty)
	{
		/*
		 * RestTemplate rt=new RestTemplate(); String
		 * url="http://localhost:1111/price/{cname}"; ResponseEntity<StockPrice>
		 * st=rt.getForEntity(url,StockPrice.class,cname); StockPrice sp=st.getBody();
		 */
		
		StockPrice sp=client.invokeStockPrice(cname);
	    Double price=sp.getCompanyPrice();
	    String portNumber=sp.getPortNumber();
	    Double total=price*qty;
	    String msg="Total amount of stock is ::"+total+" (Service running on port ::"+portNumber+")";
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}
	
}
