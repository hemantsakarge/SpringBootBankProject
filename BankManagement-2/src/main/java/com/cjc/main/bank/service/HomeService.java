package com.cjc.main.bank.service;

import java.util.List;

import com.cjc.main.bank.model.Account;
import com.cjc.main.bank.model.Transactions;

public interface HomeService {

	public void saveAccount(Account a);
	public Account findByUsernameAndPassword(String username, String password);
	public Account findByAccno(int accno);
	public List<Account> findAll();
	
	public void deleteAccount(Account a);

}
