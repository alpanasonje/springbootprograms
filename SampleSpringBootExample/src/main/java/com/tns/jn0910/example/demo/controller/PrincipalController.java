package com.tns.jn0910.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns.jn0910.example.demo.entity.Principal;
import com.tns.jn0910.example.demo.service.PrincipalService;

@RestController
public class PrincipalController {
	@Autowired
	PrincipalService service;

	@PostMapping("/principals")
	void addPrincipal(@RequestBody Principal p) {
		service.addPrincipal(p);
	}

	@GetMapping("/principals")
	List<Principal> listAll() {
		return service.getAllPrincipals();
	}

	@GetMapping("/principals/{emailid}")
	ResponseEntity<Principal> getPrincipal(@PathVariable String emailid) {
		try
		{
			Principal p=service.getPrincipal(emailid);
			return new ResponseEntity<>(p,HttpStatus.OK) ;
		}
		catch(NoSuchElementException e)
		{
			System.out.println("No record found");
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		}
		
	}

	@DeleteMapping("/principals/{emailid}")
	void deletePrincipal(@PathVariable String emailid) {
		service.deletePrincipal(emailid);
	}

	@PutMapping("/principals/{emailid}")
	void updatePrincipal(@RequestBody Principal p, @PathVariable String emailid) {
		service.updatePrincipal(emailid, p);
	}
}
