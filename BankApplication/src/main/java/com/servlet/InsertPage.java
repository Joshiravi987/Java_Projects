package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets; // For robust String conversion

import com.dao.Datadao;
import com.model.User;

@WebServlet("/InsertPage")
@jakarta.servlet.annotation.MultipartConfig(
    fileSizeThreshold = 1024 * 1024 * 2, // 2MB
    maxFileSize = 1024 * 1024 * 10,      // 10MB
    maxRequestSize = 1024 * 1024 * 50    // 50MB
)
public class InsertPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
    public InsertPage() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        byte[] photoData = null; // Will store the image BLOB data
        String statusMessage = "Registration failed due to server error."; // Default error message
        
        try {
            // --- 1. Data Extraction ---
            String username = readPartValue(request.getPart("Username"));
            String phone = readPartValue(request.getPart("Phone"));
            String email = readPartValue(request.getPart("Email"));
            String password = readPartValue(request.getPart("Password"));
            
            // --- 2. Email Sending ---
            try {
                // Ensure Mailer.java has the correct NEW App Password and configuration!
                Mailer.send(email, "Welcome to BankApp", "Thank you for registering, " + username + "!");
                System.out.println("Registration: Attempted to send email to " + email);
            } catch (RuntimeException mailEx) {
                // Catches the RuntimeException re-thrown by Mailer.java on MessagingException
                System.err.println("Registration Error: Email sending failed. Details: " + mailEx.getMessage());
                // Set a specific message, but DO NOT stop the process if the database insertion is more critical.
                // NOTE: Depending on your business logic, you might want to stop here.
                statusMessage = "Registration recorded, but welcome email failed to send. Check server logs.";
            }

            // --- 3. Handle file upload as BLOB ---
            Part filePart = request.getPart("photo");
            
            if (filePart != null && filePart.getSize() > 0) {
                try (InputStream is = filePart.getInputStream();
                     ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {
                        
                    int nRead;
                    byte[] data = new byte[1024];
                        
                    while ((nRead = is.read(data, 0, data.length)) != -1) {
                        buffer.write(data, 0, nRead);
                    }
                    buffer.flush();
                    photoData = buffer.toByteArray(); // This is the byte[] (BLOB)
                }
            }
            
            // --- 4. Store user input in model file ---
            User user = new User();
            user.setUsername(username);
            user.setPhone(phone);
            user.setEmail(email);
            user.setPassword(password);
            user.setPhoto(photoData); // Set the BLOB data
            
            // --- 5. Call DAO file ---
            Datadao dao = new Datadao();
            String s = dao.InsertData(user);
            
            // --- 6. Set Final Status Message ---
            if(s.equalsIgnoreCase("Success")) {
                // Overwrite any temporary email error message with success if DAO succeeds
                statusMessage = "Data Inserted Successfully"; 
            } else {
                // Overwrite the default "server error" if DAO fails but is handled
                statusMessage = "Database error: Not Data Inserted";
            }
            
        } catch (Exception e) {
            // Catches general exceptions (IO, Database connection, etc.)
            System.err.println("CRITICAL REGISTRATION ERROR:");
            e.printStackTrace();
            // The default statusMessage (Registration failed due to server error) is used here.
        }
        
        // --- 7. Forward to View ---
        request.setAttribute("msg", statusMessage);
        RequestDispatcher rd = request.getRequestDispatcher("BankApp.jsp");
        rd.forward(request, response);
	}
    
    // Helper method to extract text value from a Part (Improved for robust encoding)
    private String readPartValue(Part part) throws IOException {
        if (part == null) return "";
        try (InputStream is = part.getInputStream()) {
            // Use StandardCharsets.UTF_8 for reliable text decoding
            return new String(is.readAllBytes(), StandardCharsets.UTF_8);
        }
    }
}