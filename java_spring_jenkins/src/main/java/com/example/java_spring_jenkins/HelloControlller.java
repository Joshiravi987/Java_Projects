package com.example.java_spring_jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlller {
	@GetMapping("/")
public String home() {
		return "Hello World! from AWS EC2 Java Application";
}
@GetMapping("/health")
public String health() {
		return "Application is running fine";
}
}