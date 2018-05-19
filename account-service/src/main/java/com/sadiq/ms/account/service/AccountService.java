package com.sadiq.ms.account.service;

import com.sadiq.ms.account.domain.Account;
import com.sadiq.ms.account.domain.User;

public interface AccountService {
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public Account findByName(String name);
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	
	public Account create(User user);
	
	/**
	 * 
	 * @param name
	 * @param update
	 */
	public void saveChanges(String name, Account update);

}
