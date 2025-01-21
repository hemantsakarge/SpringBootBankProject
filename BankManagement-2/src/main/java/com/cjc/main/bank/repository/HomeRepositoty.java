package com.cjc.main.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.bank.model.Account;

public interface HomeRepositoty extends JpaRepository<Account, Integer> {

	public Account findByUsernameAndPassword(String username, String password);
	
	public Account findByAccno(int accno);
}
