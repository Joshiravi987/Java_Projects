package com.servlet;

import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class Mailer {
    public static void send(String to, String subject, String msg) {

        // ⭐ CHANGE THIS: Use your actual sending email address
        final String user = "chemrj987@gmail.com"; 
        // ⭐ CHANGE THIS: MUST BE A GMAIL APP PASSWORD, NOT your regular password
        final String pass = "xsho zgqr hazf hpsg"; 
        
        // 1st step) Configure the properties for TLS on port 587
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");  
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");  
        props.put("mail.smtp.starttls.enable", "true"); // Enable TLS

        // 2nd step) Create the mail Session with authentication
        Session session = Session.getInstance(props, 
           new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
             return new PasswordAuthentication(user, pass);
            }
        });

        // 3rd step) Compose and Send the message
        try {
           MimeMessage message = new MimeMessage(session);
           message.setFrom(new InternetAddress(user));
           message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
           message.setSubject(subject);
           message.setText(msg);

           Transport.send(message);

           System.out.println("Mail sent successfully to: " + to);
        // ... in Mailer.java
        } catch (MessagingException e) {  
            System.err.println("Mailer Error: Failed to send email.");
            e.printStackTrace(); // <-- THIS PRINTS THE DETAILED ERROR
            throw new RuntimeException("Email sending failed", e);
        }
    }
}