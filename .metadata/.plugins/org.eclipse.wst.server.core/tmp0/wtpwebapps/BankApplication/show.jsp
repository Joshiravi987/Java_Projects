<%@page import="com.model.User"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Base64"%> <%-- CRITICAL: NEW IMPORT for Base64 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>
<style>
    table {
        border-collapse: collapse;
        width: 80%;
        margin: 20px auto;
    }
    th, td {
        padding: 10px;
        text-align: center;
        border: 1px solid #ccc;
    }
    th {
        background: #007BFF;
        color: white;
    }
    .btn {
        padding: 5px 10px;
        border: none;
        cursor: pointer;
        border-radius: 4px;
        text-decoration: none;
    }
    .edit-btn { background: #28a745; color: white; }
    .delete-btn { background: #dc3545; color: white; }
</style>
</head>
<body>
<h2 style="text-align:center;">Admin User Management</h2>

<%
List<User> list = (List<User>) request.getAttribute("List");
%>

<% if (list != null && !list.isEmpty()) { %>

<table>
<tr>
    <th>Id</th>
    <th>Name</th>
    <th>Email</th>
    <th>Phone</th>
    <th>Password</th>
    <th>Photo</th> 
    <th>Actions</th>
</tr>

<% for(User u : list) { 
    String base64Image = null;
    // Check if the user object has byte[] data
    if (u.getPhoto() != null) {
        // Convert byte array (BLOB) to Base64 String
        base64Image = Base64.getEncoder().encodeToString(u.getPhoto());
    }
%>
<tr>
    <td><%=u.getId()%></td>
    <td><%=u.getUsername()%></td>
    <td><%=u.getEmail()%></td>
    <td><%=u.getPhone()%></td>
    <td><%=u.getPassword()%></td>
    
    <td>
        <% if (base64Image != null) { %>
            <img src="data:image/jpeg;base64, <%=base64Image%>" alt="Profile Photo" 
                 style="width: 50px; height: 50px; object-fit: cover; border-radius: 50%;">
        <% } else { %>
            No Photo
        <% } %>
    </td>
    
    <td>
        <a href="EditUser?id=<%=u.getId()%>" class="btn edit-btn">Edit</a> 
        <a href="DeleteUser?id=<%=u.getId()%>" class="btn delete-btn">Delete</a>
    </td>
</tr>
<% } %>
</table>

<% } else { %>
<div style="text-align:center; margin-top: 50px;" class="alert alert-warning">
    No users found or connection failed.
</div>
<% } %>

</body>
</html>