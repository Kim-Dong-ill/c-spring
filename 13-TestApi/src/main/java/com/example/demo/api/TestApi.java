package com.example.demo.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

	@GetMapping("/hello/world")
	public String getHello() {
		return "get hello world";
	}
	
	@PostMapping("/hello/world")
	public String postHello() {
		return "post hello world";
	}
	
	@PutMapping("/hello/world")
	public String putHello() {
		return "put hello world";
	}
	
	@DeleteMapping("/hello/world")
	public String deleteHello() {
		return "delete hello world";
	}
}
