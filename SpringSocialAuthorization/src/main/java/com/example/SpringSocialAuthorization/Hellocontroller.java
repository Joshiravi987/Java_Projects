package com.example.SpringSocialAuthorization;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

	
	@GetMapping("/")
	public String hello() {
		return "Unlogged: Open-source tools for java developers to simplify OAuth2 integration in Spring applications.";
	}
	@GetMapping("/homepage")
	public String hello1() {
		return "Logged in: Hello, welcome to Spring Security with OAuth2!";
	}
}
