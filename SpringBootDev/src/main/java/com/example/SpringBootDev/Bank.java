package com.example.SpringBootDev;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Bank {
	@Id
	@GeneratedValue
private int AccountID;
	@Column
private int balance;
	@Column
private int accountNumber;
	@Column
private String accountHolderName;
	
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public int getAccountID() {
	return AccountID;
}
public void setAccountID(int accountID) {
	AccountID = accountID;
}

}
