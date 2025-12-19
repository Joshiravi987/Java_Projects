package com.example.SpringBootBankProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootBankProject.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	boolean existsByAccNumber(String accNumber);

}
