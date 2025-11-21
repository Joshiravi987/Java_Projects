<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
</head>
<body>
<form action ="register" method="post">
 Username: <input type="text" name="username"/><br/>
 Password: <input type="password" name="password"/><br/>
 <input type="submit" value="Register"/>
 ${message} 	
 </form>
 
</body>
</html>