package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
	
	@GetMapping("/hello")
	public String sayHello() {
		System.out.println("Hello Naman");
		return "Hello";
	}
}
