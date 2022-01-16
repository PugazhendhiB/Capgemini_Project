package com.capgemini.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController
{

	@GetMapping("/checking")
	public String getMessage() 
	{
		return "<h1>Welcome to Spring Boot</h1>";
	}
}
