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

import com.tns.jn0910.example.demo.entity.College;
import com.tns.jn0910.example.demo.service.CollegeService;

@RestController
public class CollegeController {

	@Autowired
	CollegeService service;
	@PostMapping("/colleges")
	void addCollege(@RequestBody College c) {
		service.addCollege(c);
	}

	@GetMapping("/colleges")
	List<College> listAll() {
		return service.getAllColleges();
	}

	@GetMapping("/colleges/{code}")
	ResponseEntity<College> getCollege(@PathVariable int code) {
		try
		{
			College c=service.getCollege(code);
			return new ResponseEntity<>(c,HttpStatus.OK) ;
		}
		catch(NoSuchElementException e)
		{
			System.out.println("No record found");
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		}
		
	}

	@DeleteMapping("/colleges/{code}")
	void deleteCollege(@PathVariable int code) {
		service.deleteCollege(code);
	}

	@PutMapping("/colleges/{code}")
	void updateCollege(@RequestBody College c, @PathVariable int code) {
		service.updateCollege(code, c);
	}

	
}
