package com.SpringBoot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.entity.Account;
import com.SpringBoot.entity.AccountPK;
import com.SpringBoot.repository.AccountRepository;

@Service
public class AccountService {
	
	private AccountRepository accRepo;
	@Autowired
	public AccountService(AccountRepository accRepo)
	{
		this.accRepo=accRepo;
	}
	public void getDataUsingPK()
	{
		AccountPK pk=new AccountPK();
		pk.setAccId(105);
		pk.setAccType("CURRENT");
		pk.setHolderName("VAIBHAV YADAV");
		
	    Optional<Account> AccountData=accRepo.findById(pk);
	    if(AccountData.isPresent())
	    {
	    	System.out.println(AccountData.get());
	    }
		
	}
	public void saveAccData()
	{
		AccountPK pk=new AccountPK();
		pk.setAccId(105);
		pk.setAccType("CURRENT");
		pk.setHolderName("VAIBHAV YADAV");
		
		Account acc=new Account();
		acc.setMinBal(5000.00);
		acc.setBranchName("Mumbai");
		acc.setAccPk(pk);
		
		accRepo.save(acc);
	}

}
