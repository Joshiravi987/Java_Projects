<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Banking application </title>
</head>
<body>
<form action="Home_1.jsp " method = "post">
<table>
<tr>
<td>
Username:
</td>
<td>
<input type="text" name="username" required="required">
</td>
</tr>

<tr>
<td>
Password:
</td>
<td>
<input type="password" name="password" required="required">
</td>
</tr>

<tr>
<td>
Gender:
</td>
<td>
Male<input type= "radio" name ="gender">
Female<input type = "radio" name ="gender">
</td>
</tr>

<tr>
<td>
Language:
</td>
<td>
English<input type= "checkbox" name ="language">
Gujarati<input type = "checkbox" name ="language">
Hindi<input type = "checkbox" name ="language">
</td>
</tr>


<tr>
<td>
City:
</td>
<td>
<select name="city">
<option value="Ahmedabad">Ahmedabad</option>
<option value="Surat">Surat</option>
<option value="Rajkot">Rajkot</option>
<option value="Baroda">Baroda</option>
<option value="Gandhinagar">Gandhinagar</option>

</select>
</td>
</tr>

<tr>
<td>
DOB:
</td>
<td>
<input type="date" name="dob">
</td>
</tr>

<tr>
<td>
File Upload:
</td>
<td>
<input type="file" name="file">
</td>
</tr>

<tr>
<td>
Email:
</td>
<td>
<input type="email" name="email" required="required">
</td>
</tr>

<tr>
<td>
</td>
<td>
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</td>

</tr>
</table>
</form>
</body>
</html>
