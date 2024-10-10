package com.tns.jn0910.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.jn0910.example.demo.entity.Bank;
import com.tns.jn0910.example.demo.repository.BankRepository;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	BankRepository repo;

	@Override
	public void addBank(Bank c) {

		repo.save(c);
	}

	@Override
	public List<Bank> getAllBanks() {
		return repo.findAll();

	}

	@Override
	public Bank getBank(int code) {

		return repo.findById(code).get();
	}

	@Override
	public void deleteBank(int code) {
		repo.deleteById(code);

	}

	@Override
	public void updateBank(int code, Bank c) {
		if (getBank(code) != null)
			repo.save(c);

	}

}
