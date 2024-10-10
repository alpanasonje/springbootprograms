package com.tns.jn0910.example.demo.service;

import java.util.List;

import com.tns.jn0910.example.demo.entity.Account;

public interface AccountService {
	void addAccount(Account acc);

	List<Account> getAllAccounts();

	Account getAccount(int accNo);

	void deleteAccount(int accNo);

	void updateAccount(int accNo, Account acc);

}
