package com.example.SpringBootBankProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootBankProject.entity.Account;
import com.example.SpringBootBankProject.service.AccountServiceClass;



@RestController
@RequestMapping("/api/v3/")
public class AccountController {

	@Autowired
	private AccountServiceClass  accountServiceClass;
	
	@PostMapping("/Account")
	public ResponseEntity<Account>SaveAccount(@RequestBody Account ac){
		Account savedAccount = accountServiceClass.SaveAccount(ac);
		return ResponseEntity.ok(savedAccount);
	}
	
	@GetMapping("/ShowAccount")
	public ResponseEntity<List<Account>>ShowAllAccountData(){
		return ResponseEntity.ok(accountServiceClass.ShowAllAccountData());
	}
}
