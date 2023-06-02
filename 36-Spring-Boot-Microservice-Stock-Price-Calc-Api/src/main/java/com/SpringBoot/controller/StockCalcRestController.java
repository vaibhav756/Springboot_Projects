package com.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.SpringBoot.binding.StockPrice;
import com.SpringBoot.client.StockPriceClient;

@RestController
public class StockCalcRestController {

	@Autowired
	private StockPriceClient client;
	
	@GetMapping("/calc/{cname}/{qty}")
	public ResponseEntity<String> calculate(@PathVariable String cname,@PathVariable Integer qty)
	{
		
		/*
		 * String msg=""; String url="http://localhost:1111/price/{cname}"; RestTemplate
		 * rt=new RestTemplate(); ResponseEntity<StockPrice>
		 * response=rt.getForEntity(url,StockPrice.class,cname); StockPrice
		 * price=response.getBody(); Double companyPrice=price.getCompanyPrice();
		 */
		
		StockPrice stockPrice=client.invokeStockPrice(cname);
		String portNum=stockPrice.getPortNumber();
	    Double companyPrice=stockPrice.getCompanyPrice();
		
		Double TotalCost=companyPrice*qty;
		String msg="Total Cost : "+TotalCost+" (PRICE-API server PortNumber :: "+portNum+")";
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
}
