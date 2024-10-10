package com.tns.jn0910.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Greet {
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello Students!!";
	}
	
	@GetMapping("/w/{name}")
	public String welcome(@PathVariable String name)
	{
		return "Welcome "+name+" to the World of Spring Boot";
	}
}
