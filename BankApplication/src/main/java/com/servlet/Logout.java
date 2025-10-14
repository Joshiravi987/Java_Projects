package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        // Get the existing session (do not create a new one)
		HttpSession session = request.getSession(false); 
        
        if (session != null) {
            // Invalidate the session, which destroys all stored data (like currentUser)
			session.invalidate(); 
		}
        
        // Redirect the user back to the main login page
        response.sendRedirect("BankApp.jsp");
	}
    
    // We don't expect a POST for logout
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}