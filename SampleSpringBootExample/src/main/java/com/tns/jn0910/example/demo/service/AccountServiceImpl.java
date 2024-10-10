package com.tns.jn0910.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.jn0910.example.demo.entity.Account;
import com.tns.jn0910.example.demo.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository repo;

	@Override
	public void addAccount(Account c) {

		repo.save(c);
	}

	@Override
	public List<Account> getAllAccounts() {
		return repo.findAll();

	}

	@Override
	public Account getAccount(int accNo) {

		return repo.findById(accNo).get();
	}

	@Override
	public void deleteAccount(int accNo) {
		repo.deleteById(accNo);

	}

	@Override
	public void updateAccount(int accNo, Account c) {
		if (getAccount(accNo) != null)
			repo.save(c);

	}

}
