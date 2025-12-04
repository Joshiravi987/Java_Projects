package com.example.SpringbootEmail.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceClass implements EmailService
{

	@Autowired
	private JavaMailSender mailsender;
	
	@Value("${spring.mail.username}")
	private String sender;
	
	@Override
	public String sendSimpleMail(UserEmail details) {
		// TODO Auto-generated method stub
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom(sender);
		mailMessage.setTo(details.getRecipient());
		mailMessage.setText(details.getMsgbody());
		mailMessage.setSubject(details.getSubject());
		mailsender.send(mailMessage);
		return "Mail Sent Successfully ..!";
	}
	
}