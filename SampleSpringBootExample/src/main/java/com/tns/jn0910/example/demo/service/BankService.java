package com.tns.jn0910.example.demo.service;

import java.util.List;

import com.tns.jn0910.example.demo.entity.Bank;

public interface BankService {
	void addBank(Bank b);

	List<Bank> getAllBanks();

	Bank getBank(int code);

	void deleteBank(int code);

	void updateBank(int code, Bank b);

}
