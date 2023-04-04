<%@page import="com.Entity.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%Customer customer=(Customer)request.getAttribute("Customer"); %>
<body>
<h1>Update form</h1>
	<form action="up" method="post">

<pre>
id			 :<input type="text" name="id" value="<%=customer.getId() %>"><br><br>
Name 		 : <input type="text" name="name" value="<%=customer.getName()%>"><br><br>
Adress 	 	 : <input type="text" name="adress" value="<%=customer.getAddress()%>"><br><br>
uname	 : <input type="text" name="uname" value="<%=customer.getUname()%>"><br><br>
pass	 : <input type="password" name="pass" value="<%=customer.getPass()%>"><br><br>


<input type="submit" value="update"> 

	</form>
</head>
<body>

</body>
</html>