<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.model.User" %>
<%@ page import="java.util.Base64" %> <%-- NEW IMPORT for Base64 encoding --%>

<%-- Retrieve the User object that the EditUser servlet forwarded --%>
<% User userToEdit = (User)request.getAttribute("user"); %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit User Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
    
    <style>
        body { font-family: Arial, sans-serif; background-color: #f8f9fa; }
        .auth-card { background: #fff; border-radius: 12px; padding: 30px; box-shadow: 0px 4px 15px rgba(0, 0, 0, 0.1); }
        .auth-title { font-weight: bold; color: #0077b6; margin-bottom: 20px; text-align: center; }
        .btn-success { background-color: #28a745; border-color: #28a745; }
        .profile-thumb { 
            width: 100px; 
            height: 100px; 
            object-fit: cover; 
            border-radius: 50%; 
            border: 2px solid #ccc; 
            margin-bottom: 15px; 
        }
    </style>
</head>
<body>
    <div class="container my-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                
                <% if (userToEdit != null) { 
                    // CRITICAL: Convert BLOB data to Base64 for inline image display
                    String base64Image = null;
                    if (userToEdit.getPhoto() != null) {
                        base64Image = Base64.getEncoder().encodeToString(userToEdit.getPhoto());
                    }
                %>
                
                <div class="auth-card text-center">
                    <h2 class="auth-title">Edit Account Details</h2>

                    <% if (base64Image != null) { %>
                        <img src="data:image/jpeg;base64, <%=base64Image%>" alt="Current Photo" class="profile-thumb">
                    <% } else { %>
                        <p>No current photo uploaded.</p>
                    <% } %>

                    <form action="UpdateUser" method="post" enctype="multipart/form-data"> 
                        
                        <%-- CRITICAL: Hidden field to pass the ID back to the UpdateUser servlet --%>
                        <input type="hidden" name="Id" value="<%=userToEdit.getId()%>">

                        <div class="mb-3 input-group">
                            <span class="input-group-text"><i class="fa fa-user"></i></span>
                            <input type="text" class="form-control" placeholder="Full Name" required name="Username"
                                   value="<%=userToEdit.getUsername()%>"> 
                        </div>

                        <div class="mb-3 input-group">
                            <span class="input-group-text"><i class="fa fa-envelope"></i></span>
                            <input type="email" class="form-control" placeholder="Email" required name="Email"
                                   value="<%=userToEdit.getEmail()%>">
                        </div>

                        <div class="mb-3 input-group">
                            <span class="input-group-text"><i class="fa fa-phone"></i></span>
                            <input type="text" class="form-control" placeholder="Phone Number" required name="Phone"
                                   value="<%=userToEdit.getPhone()%>">
                        </div>

                        <div class="mb-3 input-group">
                            <span class="input-group-text"><i class="fa fa-lock"></i></span>
                            <input type="password" class="form-control" placeholder="New Password (or current)" required name="Password"
                                   value="<%=userToEdit.getPassword()%>"> 
                        </div>

                        <div class="mb-3 input-group">
                            <span class="input-group-text"><i class="fa fa-camera"></i></span>
                            <input type="file" class="form-control" name="photo"> 
                        </div>


                        <input type="submit" class="btn btn-success w-100" value="Update Details">

                        <p class="text-center mt-3">
                            <a href="Showdata">Back to User List</a>
                        </p>
                    </form>
                </div>
                
                <% } else { %>
                
                <div class="alert alert-danger" role="alert">
                    User data not found! Please check the ID and try again.
                </div>
                
                <% } %>
            </div>
        </div>
    </div>
</body>
</html>