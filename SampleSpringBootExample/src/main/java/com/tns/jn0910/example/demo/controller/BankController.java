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

import com.tns.jn0910.example.demo.entity.Bank;
import com.tns.jn0910.example.demo.service.BankService;

@RestController
public class BankController {

	@Autowired
	BankService service;
	@PostMapping("/banks")
	void addBank(@RequestBody Bank c) {
		service.addBank(c);
	}

	@GetMapping("/banks")
	List<Bank> listAll() {
		return service.getAllBanks();
	}

	@GetMapping("/banks/{code}")
	ResponseEntity<Bank> getBank(@PathVariable int code) {
		try
		{
			Bank c=service.getBank(code);
			return new ResponseEntity<>(c,HttpStatus.OK) ;
		}
		catch(NoSuchElementException e)
		{
			System.out.println("No record found");
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		}
		
	}

	@DeleteMapping("/banks/{code}")
	void deleteBank(@PathVariable int code) {
		service.deleteBank(code);
	}

	@PutMapping("/banks/{code}")
	void updateBank(@RequestBody Bank c, @PathVariable int code) {
		service.updateBank(code, c);
	}

	
}
