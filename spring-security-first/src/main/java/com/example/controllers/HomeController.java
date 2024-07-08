package com.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	
	@GetMapping // public page
	public ResponseEntity<String> getHomePage(){
		return ResponseEntity.ok("Welcome To Spring Security !!");
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> getAdminPage(){
		return ResponseEntity.ok("Welcome To Admin User Page !!");
	}
	
	@GetMapping("/normal")
	public ResponseEntity<String> getNormalPage(){
		return ResponseEntity.ok("Welcome To Normal User Page !!");
	}
	
}
