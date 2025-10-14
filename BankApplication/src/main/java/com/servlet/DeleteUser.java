package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.Datadao;

@WebServlet("/DeleteUser")
public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// 1. Get the User ID from the request parameter
			int id = Integer.parseInt(request.getParameter("id"));
			
			// 2. Call the DAO to delete the user (we assume dao.deleteData is void)
			Datadao dao = new Datadao();
			dao.deleteData(id); 
			
			// 3. REDIRECT to the servlet that shows the updated data.
			// This fixes the "black screen" and "refresh" issues!
			response.sendRedirect("Showdata"); 
			
		} catch (NumberFormatException e) {
			// Handle invalid ID by redirecting back to the list
			response.sendRedirect("Showdata"); 
		}
        // ALL CODE ENDS HERE. NOTHING AFTER THE REDIRECT!
	}
    // doPost is fine calling doGet for a simple operation like this
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}