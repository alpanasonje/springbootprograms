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

import com.tns.jn0910.example.demo.entity.Author;
import com.tns.jn0910.example.demo.service.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	AuthorService service;
	@PostMapping("/author")
	void addAuthor(@RequestBody Author c) {
		service.addAuthor(c);
	}

	@GetMapping("/author")
	List<Author> listAll() {
		return service.getAllAuthors();
	}

	@GetMapping("/author/{id}")
	ResponseEntity<Author> getAuthor(@PathVariable int id) {
		try
		{
			Author c=service.getAuthor(id);
			return new ResponseEntity<>(c,HttpStatus.OK) ;
		}
		catch(NoSuchElementException e)
		{
			System.out.println("No record found");
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		}
		
	}

	@DeleteMapping("/author/{id}")
	void deleteAuthor(@PathVariable int id) {
		service.deleteAuthor(id);
	}

	@PutMapping("/author/{id}")
	void updateAuthor(@RequestBody Author c, @PathVariable int id) {
		service.updateAuthor(id, c);
	}

	
}
