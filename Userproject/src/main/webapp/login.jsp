<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="loginServelet">
	<label for="uname">User :name</label>
	<input type="text" name="uname">
	<label for="uemail">User :email</label>
	<input type="email" name="uemail">
	<label for="upass">User :password</label>
	<input type="password" name="upass">
	<button type="submit">Submit</button>
</form>
</body>
</html>