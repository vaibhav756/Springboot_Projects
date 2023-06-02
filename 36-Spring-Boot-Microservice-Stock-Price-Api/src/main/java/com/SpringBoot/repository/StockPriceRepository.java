package com.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.binding.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice,Integer>{

	public StockPrice findByCompanyName(String companyName);
	
}
