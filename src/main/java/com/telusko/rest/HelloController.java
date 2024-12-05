package com.telusko.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

	@GetMapping("/")
	public String greet(HttpServletRequest request) {
		
		return "welcome to SpringApp "+request.getSession().getId();
	}
}
