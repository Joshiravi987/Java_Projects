package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.Datadao;
import com.model.User;

@WebServlet("/EditUser")
public class EditUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// 1. Get the User ID from the request parameter
			int id = Integer.parseInt(request.getParameter("id"));
			
			// 2. Call the DAO method (getUserById) to fetch the User object
			Datadao dao = new Datadao();
			// NOTE: We use the correct method name here!
			User userToEdit = dao.getUserById(id); 
			
			// 3. Set the User object as a request attribute
			request.setAttribute("user", userToEdit);
			
			// 4. Forward the request and the data to the EditUser.jsp page
			RequestDispatcher rd = request.getRequestDispatcher("EditUser.jsp");
			rd.forward(request, response);
			
		} catch (NumberFormatException e) {
			// Handle case where ID is missing or invalid by redirecting to show all
			response.sendRedirect("Showdata");
		}
        // The method ends here, no code runs after the forward/redirect!
	}
    
    // doPost is only required if the form posts back to this servlet, but for a 
    // separate UpdateUser servlet, this simple version is fine:
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}