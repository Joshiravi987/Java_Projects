package com.example.SpringBootBankProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootBankProject.entity.Account;
import com.example.SpringBootBankProject.repository.AccountRepository;

@Service
public class AccountServiceClass {

	@Autowired
	private AccountRepository accountRepository;
	
	
	private String generateAccountNumber() {
		long random=(long)(Math.random()*9000000000L)+1000000000L;
		return "AC" + random;
	}
	private String uniqueAccountNumber() {
		String accNumber;
		do {
			accNumber = generateAccountNumber();
		} while (accountRepository.existsByAccNumber(accNumber));
		return accNumber;
	}
	
	public Account SaveAccount(Account ac) {
		ac.setAccNumber(generateAccountNumber());
		return accountRepository.save(ac);
	}
	public List<Account> ShowAllAccountData(){
		return accountRepository.findAll();
	}
}
