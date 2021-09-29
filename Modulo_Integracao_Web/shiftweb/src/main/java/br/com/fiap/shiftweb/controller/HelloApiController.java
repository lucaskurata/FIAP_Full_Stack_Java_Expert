package br.com.fiap.shiftweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello API";
	}
	
	@GetMapping("/hello2")
	public String hello2() {
		return "Hello API 2";
	}
	
}
