<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<marquee>
		<h1>Welcome to RT Travels</h1>
	</marquee>

	please login
	<br>
	  
	<form action="validate-login">

		<label for = "email">User Name : </label>
		<input type="text" placeholder = "enter user name" name="email" required>
		
		 <label for = "password"> Password: </label>
		 <input type="password" placeholder = "enter password" name="password">
			
			 <input type="submit">

	</form>
</body>
</html>