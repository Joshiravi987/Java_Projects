<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit User</title>
</head>
<body>
    <h2>Edit User</h2>
    
    <form action="updateUser" method="post">
    
        <input type="hidden" name="id" value="${user.id}"/>
        
        <label>Username:</label>
        <input type="text" name="username" value="${user.username}"/><br/><br/>
        
        <label>Password:</label>
        <input type="text" name="password" value="${user.password}"/><br/><br/>
        
        <input type="submit" value="Update User"/>
    </form>
    
    <br/>
    <a href="showdata">Cancel</a>
</body>
</html>