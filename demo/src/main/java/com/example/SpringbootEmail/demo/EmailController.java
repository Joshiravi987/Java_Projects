package com.example.SpringbootEmail.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController 
{
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/sendMail")
	public String
	sendMail(@RequestBody UserEmail details)
	{
		String status=emailService.sendSimpleMail(details);
		return status;
	}
}