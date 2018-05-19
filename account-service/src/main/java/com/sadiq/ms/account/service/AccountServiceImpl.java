package com.sadiq.ms.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadiq.ms.account.domain.Account;
import com.sadiq.ms.account.domain.User;
import com.sadiq.ms.account.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository repository;

	@Override
	public Account findByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByName(name);
	}

	@Override
	public Account create(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveChanges(String name, Account update) {
		// TODO Auto-generated method stub
		
	}

}
