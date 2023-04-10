<%@page import="com.example.demo.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Student student=(Student)request.getAttribute("Student"); %>
<body>
<h1>Update form</h1>
	<form action="up" >

<pre>
id			 :<input type="text" name="id" value="<%=student.getId() %>"><br><br>
Name 		 : <input type="text" name="name" value="<%=student.getName()%>"><br><br>
Address 	 	 : <input type="text" name="adress" value="<%=student.getAddress()%>"><br><br>
UserName	 : <input type="text" name="uname" value="<%=student.getUname()%>"><br><br>
Password	 : <input type="password" name="pass" value="<%=student.getPass()%>"><br><br>


<input type="submit" value="update"> 
</pre>
	</form>
</body>
</html>