<%@page import="com.model.customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%customer customer=(customer)request.getAttribute("customer"); %>
<body>
<h1>Update form</h1>
	<form action="up">

<pre>
id			 :<input type="text" name="id" value="<%=customer.getId() %>"><br><br>
Name 		 : <input type="text" name="name" value="<%=customer.getName()%>"><br><br>
adress 	 	 : <input type="text" name="adress" value="<%=customer.getAdress()%>"><br><br>
userName	 : <input type="text" name="uname" value="<%=customer.getUname()%>"><br><br>
Password	 : <input type="password" name="pass" value="<%=customer.getPass()%>"><br><br>


<input type="submit" value="update"> 

	</form>
</body>
</html>