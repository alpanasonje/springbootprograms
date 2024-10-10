package com.tns.jn0910.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns.jn0910.example.demo.entity.Student;
import com.tns.jn0910.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;

	@GetMapping("/students")
	List<Student> getAllStudent() {
		return service.getAllStudents();
	}
	@GetMapping("/students/{id}")
	Student getStudent(@PathVariable int id)
	{
		return service.getStudentByUId(id);
	}
	
	@PostMapping("/students")
	void addStudent(@RequestBody Student s)
	{
		service.addStudent(s);
	}
	
	@DeleteMapping("/students/{id}")
	void deleteStudent(@PathVariable int id)
	{
		service.deleteStudent(id);
			
	}
	
	@PutMapping("/students/{id}")
	void updateStudent(@PathVariable int id,@RequestBody Student s)
	{
		service.updateStudent(id, s);
	}
}