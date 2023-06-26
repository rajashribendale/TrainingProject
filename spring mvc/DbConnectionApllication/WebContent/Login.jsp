<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Page</h1>
<form action="log">
<h4 style="color:red;">
<%String str=(String)request.getAttribute("msg"); %>
<%if(str!=null){ %>
<%out.print(str); %>
<%} %>
</h4>
userName(<span style="color:red">*</span>)	 :	<input type="text" name="uname" required><br><br>
Password	 :	<input type="password" name="pass" required><br><br>
<input type="submit" value="Login">
</form>
</body>
</html>