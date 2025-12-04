package com.example.SpringBootDev;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class BankController {

	@Autowired
	private BankService bankservice;

	@PostMapping("/Bank")
	public ResponseEntity<Bank> saveBank(@RequestBody Bank bank) {

		Bank newBank = bankservice.Savebank(bank);
		return ResponseEntity.ok(newBank);
	}

	@GetMapping("/Bank")
	public List<Bank> getAllBankData() {
		return bankservice.getAllBankData();
	}

	@GetMapping("/Bank/{id}")
	public ResponseEntity<Bank> getBankById(@PathVariable int id) {
		Bank bank = bankservice.getBankById(id);
		if (bank != null) {
			return ResponseEntity.ok(bank);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PutMapping("/Bank/{id}")
	public ResponseEntity<Bank> updateBank(@PathVariable int id, @RequestBody Bank bank) {
		Bank updatedBank = bankservice.updateBank(id, bank);
		if (updatedBank != null) {
			return ResponseEntity.ok(updatedBank);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	// Update multiple accounts
@PutMapping("/Banks")
public ResponseEntity<List<Bank>> updateManyBanks(@RequestBody List<Bank> banks) {
	List<Bank> updatedBanks = bankservice.updateAllBanks(banks);
	return ResponseEntity.ok(updatedBanks);
	}
	@DeleteMapping("/Bank/{id}")
	public ResponseEntity<Void> deleteBank(@PathVariable int id) {
		   bankservice.deleteBank(id);
return ResponseEntity.noContent().build();
	}
	
	// Delete multiple accounts
	@DeleteMapping("/Banks")
	public ResponseEntity<String> deleteManyBanks(@RequestBody List<Integer> ids) {
	    String result = bankservice.deleteCheck(ids);
	    return ResponseEntity.ok(result);
	}
@PostMapping("/Banks")
public ResponseEntity<List<Bank>> saveAllBanks(@RequestBody List<Bank> banks) {
	List<Bank> savedBanks = bankservice.saveAllBanks(banks);
	return ResponseEntity.ok(savedBanks);

	}
}