<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.model.User" %>
<%@ page import="java.util.Base64" %> <%-- CRITICAL: Import Base64 utility --%>

<%-- 1. SESSION PROTECTION --%>
<%
    // Retrieve the User object stored in the session by LoginServlet
    User currentUser = (User)session.getAttribute("currentUser");
    
    // If the session is null, redirect the user back to the main login page
    if (currentUser == null) {
        response.sendRedirect("BankApp.jsp");
        return;
    }
    
    // 2. BLOB to Base64 Conversion
    String base64Image = null;
    if (currentUser.getPhoto() != null) {
        // Convert the byte[] (BLOB) data to a Base64 String for inline display
        base64Image = Base64.getEncoder().encodeToString(currentUser.getPhoto());
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .profile-img {
            width: 150px;
            height: 150px;
            object-fit: cover;
            border-radius: 50%; /* Makes the image circular */
            border: 4px solid #0077b6;
            margin-bottom: 20px;
        }
        .card-header-bg {
            background-color: #0077b6;
            color: white;
            font-weight: bold;
        }
    </style>
</head>
<body>

<div class="container my-5">
    
    <div class="text-center">
        <% if (base64Image != null) { %>
            <img src="data:image/jpeg;base64, <%=base64Image%>" alt="<%=currentUser.getUsername()%>'s Photo" class="profile-img">
        <% } else { %>
            <img src="https://via.placeholder.com/150/0077b6/FFFFFF?text=No+Photo" alt="Default Photo" class="profile-img">
        <% } %>
    </div>

    <h1 class="mb-4 text-center">Welcome Back, <%= currentUser.getUsername() %>!</h1>

    <div class="card">
        <div class="card-header card-header-bg">
            Account Summary
        </div>
        <div class="card-body">
            <ul class="list-group list-group-flush">
                <li class="list-group-item"><strong>Account Holder:</strong> <%= currentUser.getUsername() %></li>
                <li class="list-group-item"><strong>Account ID:</strong> <%= currentUser.getId() %></li>
                <li class="list-group-item"><strong>Email:</strong> <%= currentUser.getEmail() %></li>
                <li class="list-group-item"><strong>Phone:</strong> <%= currentUser.getPhone() %></li>
                <li class="list-group-item"><strong>Current Balance:</strong> ₹5000 (Placeholder - To be implemented next!)</li> 
            </ul>
        </div>
    </div>

    <div class="mt-4 text-center">
        <a href="Logout" class="btn btn-danger btn-lg">Logout</a> 
    </div>

</div>

</body>
</html>