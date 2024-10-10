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

import com.tns.jn0910.example.demo.entity.Book;
import com.tns.jn0910.example.demo.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService service;
	@PostMapping("/books")
	void addBook(@RequestBody Book c) {
		service.addBook(c);
	}

	@GetMapping("/books")
	List<Book> listAll() {
		return service.getAllBooks();
	}

	@GetMapping("/books/{isbn}")
	ResponseEntity<Book> getBook(@PathVariable int isbn) {
		try
		{
			Book c=service.getBook(isbn);
			return new ResponseEntity<>(c,HttpStatus.OK) ;
		}
		catch(NoSuchElementException e)
		{
			System.out.println("No record found");
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		}
		
	}

	@DeleteMapping("/books/{isbn}")
	void deleteBook(@PathVariable int isbn) {
		service.deleteBook(isbn);
	}

	@PutMapping("/books/{isbn}")
	void updateBook(@RequestBody Book c, @PathVariable int isbn) {
		service.updateBook(isbn, c);
	}

	
}
