<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registered Users</title>
</head>
<body>

    <h2>Registered Users</h2>
    
    <h3 style="color: green">${message}</h3> <!--  this for message -->
    
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Password</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.username}"/></td>
                <td><c:out value="${user.password}"/></td>
                <td><a href="editUser?id=${user.id}">Edit</a></td>
                <td><a href="deleteUser?id=${user.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
    
    <c:remove var="message" scope="session" /> <!-- this for message -->

</body>
</html>