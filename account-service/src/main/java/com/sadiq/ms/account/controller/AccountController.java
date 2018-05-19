package com.sadiq.ms.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sadiq.ms.account.domain.Account;
import com.sadiq.ms.account.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(path="/{name}", method = RequestMethod.GET)
	
	public Account getAccountByName(@PathVariable String name){
		return accountService.findByName(name);
		
	}

}
