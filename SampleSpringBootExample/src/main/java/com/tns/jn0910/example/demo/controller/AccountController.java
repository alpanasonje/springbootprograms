package com.tns.jn0910.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns.jn0910.example.demo.entity.Account;
import com.tns.jn0910.example.demo.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService service;
	@PostMapping("/accounts")
	void addAccount(@RequestBody Account c) {
		service.addAccount(c);
	}

	@GetMapping("/accounts")
	List<Account> listAll() {
		return service.getAllAccounts();
	}

	@GetMapping("/accounts/{accno}")
	ResponseEntity<Account> getAccount(@PathVariable int accno) {
		try
		{
			Account c=service.getAccount(accno);
			return new ResponseEntity<>(c,HttpStatus.OK) ;
		}
		catch(NoSuchElementException e)
		{
			System.out.println("No record found");
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		}
		
	}

	@DeleteMapping("/accounts/{accno}")
	void deleteAccount(@PathVariable int accno) {
		service.deleteAccount(accno);
	}

	@PutMapping("/accounts/{accno}")
	void updateAccount(@RequestBody Account c, @PathVariable int accno) {
		service.updateAccount(accno, c);
	}

	
}
