package com.example.student_service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
	 @PostMapping("/authenticate")
	    public String generateToken(@RequestParam String username, @RequestParam String password) {
	        // Simple check, replace with DB validation
	        if ("student".equals(username) && "password".equals(password)) {
	            return JwtUtil.generateToken(username);
	        } else {
	            throw new RuntimeException("Invalid Credentials");
	        }
	    }
}
