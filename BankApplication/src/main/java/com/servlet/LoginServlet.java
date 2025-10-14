package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession; // CRITICAL: Import for session management
import java.io.IOException;

import com.dao.Datadao;
import com.model.User;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    // Login is a POST operation
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        // 1. Get credentials from the form
		String email = request.getParameter("Email");
		String password = request.getParameter("Password");
		
        // 2. Call the DAO method
		Datadao dao = new Datadao();
		User user = dao.login(email, password); // Calls the method you just implemented
		
		if (user != null) {
            // LOGIN SUCCESS: 
            // 3. Start a new session for the user
			HttpSession session = request.getSession();
            
            // Store the User object in the session
			session.setAttribute("currentUser", user); 
            
            // Redirect to the user dashboard (Need to create this file next)
			response.sendRedirect("Dashboard.jsp");
            
		} else {
            // LOGIN FAILURE: 
            // Set an error message and forward back to the login page
			request.setAttribute("msg", "Invalid Email or Password. Please try again.");
			RequestDispatcher rd = request.getRequestDispatcher("BankApp.jsp");
			rd.forward(request, response);
		}
	}
    
    // Simple doGet implementation (sends users back to the main page)
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("BankApp.jsp");
    }
}