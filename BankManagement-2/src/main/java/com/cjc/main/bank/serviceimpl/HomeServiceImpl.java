package com.cjc.main.bank.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.bank.model.Account;
import com.cjc.main.bank.model.Transactions;
import com.cjc.main.bank.repository.HomeRepositoty;

import com.cjc.main.bank.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepositoty hr;

	
	@Override
	public void saveAccount(Account a) {
		hr.save(a);
		
	}

	@Override
	public Account findByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return hr.findByUsernameAndPassword(username, password);
	}

	@Override
	public Account findByAccno(int accno) {
		// TODO Auto-generated method stub
		return hr.findByAccno(accno);
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public void deleteAccount(Account a) {
		
		hr.delete(a);
		
	}

	
	

	


	

	
}
