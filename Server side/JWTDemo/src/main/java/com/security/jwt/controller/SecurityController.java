package com.security.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	
	
	@GetMapping("/")
	public String home() {
		return "hello & welcome to home";
	}

}
