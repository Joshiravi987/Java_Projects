package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.util.UUID; // Not strictly needed here but good to keep in imports

import com.dao.Datadao;
import com.model.User;

@WebServlet("/UpdateUser")
@jakarta.servlet.annotation.MultipartConfig
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateUser() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("Showdata");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        byte[] photoData = null; 
        
		try {
			// *** 1. SAFELY RETRIEVE AND PARSE ID ***
            Part idPart = request.getPart("Id"); // Must match JSP name: 'Id'
            String idString = readPartValue(idPart);
            
            if (idPart == null || idString.isEmpty()) {
                // Throwing an exception forces a catch block to handle missing ID
                throw new IllegalArgumentException("User ID is missing."); 
            }
            int id = Integer.parseInt(idString);
            
            // 2. Retrieve remaining text fields
			String username = readPartValue(request.getPart("Username"));
			String phone = readPartValue(request.getPart("Phone"));
			String email = readPartValue(request.getPart("Email"));
			String password = readPartValue(request.getPart("Password"));

            // 3. HANDLE OPTIONAL FILE UPLOAD (BLOB)
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
                    photoData = buffer.toByteArray(); // This is the new BLOB data
                }
            }
            
            // 4. PREPARE USER OBJECT
			User user = new User();
			user.setId(id);
			user.setUsername(username);
			user.setPhone(phone);
			user.setEmail(email);
			user.setPassword(password);
            user.setPhoto(photoData); // Set the optional BLOB data
            
            // 5. CALL DAO
			Datadao dao = new Datadao();
			int rowsAffected = dao.updateDataWithPhoto(user); 
			
            // 6. CHECK RESULT AND REDIRECT
            if (rowsAffected > 0) {
                response.sendRedirect("Showdata");
            } else {
                request.setAttribute("msg", "Update failed.");
                // Forward back to EditUser.jsp with error
                request.setAttribute("user", dao.getUserById(id));
                request.getRequestDispatcher("EditUser.jsp").forward(request, response);
            }
			
		} catch (Exception e) {
			System.err.println("Update error: " + e.getMessage());
			// Log the error and redirect to show data to avoid crash
			response.sendRedirect("Showdata"); 
		}
	}
    
    // Helper method to extract text value from a Part
    private String readPartValue(Part part) throws IOException {
        if (part == null) return "";
        try (InputStream is = part.getInputStream()) {
            return new String(is.readAllBytes()).trim(); // Added trim() for extra safety
        }
    }
}