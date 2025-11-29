package com.example.SpringBootDev;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
	@Autowired
	private BankRepository bankRepository;

	// insert method
	public Bank Savebank(Bank bank) {
		return bankRepository.saveAndFlush(bank);
	}

	// get all data method
	public List<Bank> getAllBankData() {
		// TODO Auto-generated method stub
		return bankRepository.findAll();
	}

	// get bank by id method
	public Bank getBankById(int id) {
		return bankRepository.findById(id).orElse(null);

	}

	// update method
	public Bank updateBank(int id, Bank bank) {
		Bank existingBank = bankRepository.findById(id).orElse(null);
		if (existingBank != null) {
			existingBank.setAccountHolderName(bank.getAccountHolderName());
			existingBank.setAccountNumber(bank.getAccountNumber());
			existingBank.setAccountID(bank.getAccountID());
			existingBank.setBalance(bank.getBalance());
			return bankRepository.saveAndFlush(existingBank);
		} else {
			return null;
		}
	}
	//update multiple records
	public List<Bank> updateAllBanks (List<Bank> banks) {
		return bankRepository.saveAll(banks);
	}
	
	// delete method 
	public void deleteBank(int id) {
	    bankRepository.deleteById(id);
	}
	// Delete multiple banks by IDs
	public String deleteCheck(List<Integer> id) {
	    bankRepository.deleteAllById(id);
	    return "Deleted " + id.size() + " accounts successfully.";
	}
	
	// save multiple records
	  public List<Bank> saveAllBanks (List<Bank> banks) {
		return bankRepository.saveAll(banks);
	}
	 
	
}
